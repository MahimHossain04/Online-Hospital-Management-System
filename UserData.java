import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class UserData extends JFrame implements ActionListener {
    private JPanel panel;
    private JLabel labelHeader;
    private JTable table;
    private JScrollPane scroll;
    private JButton btnRefresh, btnDelete, btnAdd, btnExit;
    private DefaultTableModel model;
    private ImageIcon icon;
    private Font f1, f2, f3, f4;
    private String[] column = {"User Name", "Email", "Age", "Gender", "Password"};

    public UserData() {
        super("Hospital Management System");
        setBounds(400, 120, 1100, 700);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(null);

        // Fonts
        f1 = new Font("Segoe UI Black", Font.PLAIN, 35);
        f2 = new Font("Segoe UI Black", Font.PLAIN, 25);
        f3 = new Font("Segoe UI Semibold", Font.PLAIN, 20);
        f4 = new Font("Segoe UI", Font.PLAIN, 18);

        // Icon
        icon = new ImageIcon(getClass().getResource("/images/hospital.png"));
        this.setIconImage(icon.getImage());

        // Header
        labelHeader = new JLabel("User Data Info");
        labelHeader.setFont(f1);
        labelHeader.setBounds(420, 20, 400, 50);
        panel.add(labelHeader);

        // Table
        table = new JTable();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(column);
        table.setModel(model);
        table.setFont(f4);
        table.setSelectionBackground(Color.decode("#8AC5FF"));
        table.setBackground(Color.WHITE);
        table.setRowHeight(30);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        for (int i = 0; i < column.length; i++) {
            table.getColumnModel().getColumn(i).setPreferredWidth(200);
        }

        scroll = new JScrollPane(table);
        scroll.setBounds(50, 100, 1000, 400);
        panel.add(scroll);

        loadUserData();

        // Buttons
        btnRefresh = new JButton("Refresh");
        btnRefresh.setFont(f2);
        btnRefresh.setBounds(150, 550, 180, 40);
        btnRefresh.setForeground(Color.WHITE);
        btnRefresh.setBackground(Color.decode("#2E75B6"));
        btnRefresh.addActionListener(this);
        panel.add(btnRefresh);

        btnDelete = new JButton("Delete");
        btnDelete.setFont(f2);
        btnDelete.setBounds(350, 550, 180, 40);
        btnDelete.setForeground(Color.WHITE);
        btnDelete.setBackground(Color.decode("#2E75B6"));
        btnDelete.addActionListener(this);
        panel.add(btnDelete);

        btnAdd = new JButton("Add");
        btnAdd.setFont(f2);
        btnAdd.setBounds(550, 550, 180, 40);
        btnAdd.setForeground(Color.WHITE);
        btnAdd.setBackground(Color.decode("#2E75B6"));
        btnAdd.addActionListener(this);
        panel.add(btnAdd);

        btnExit = new JButton("Exit");
        btnExit.setFont(f2);
        btnExit.setBounds(750, 550, 180, 40);
        btnExit.setForeground(Color.WHITE);
        btnExit.setBackground(Color.decode("#C00000"));
        btnExit.addActionListener(this);
        panel.add(btnExit);

        add(panel);
    }

    private void loadUserData() {
        String filePath = "./Data/user_data.txt";
        model.setRowCount(0);

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] details = line.split("\t");
                if (details.length == 5) {
                    model.addRow(details);
                }
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error loading user data!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void deleteUser() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a user to delete!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String usernameToDelete = model.getValueAt(selectedRow, 0).toString();
        String filePath = "./Data/user_data.txt";
        String tempFile = "./Data/temp_user_data.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String[] details = line.split("\t");
                if (details.length == 5 && !details[0].equals(usernameToDelete)) {
                    writer.write(line);
                    writer.newLine();
                }
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error updating file!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        File oldFile = new File(filePath);
        File newFile = new File(tempFile);
        if (oldFile.delete()) {
            newFile.renameTo(oldFile);
            JOptionPane.showMessageDialog(this, "User deleted successfully!");
            loadUserData();
        } else {
            JOptionPane.showMessageDialog(this, "Error deleting user!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnRefresh) {
            loadUserData();
            JOptionPane.showMessageDialog(this, "Data Refreshed!");
        } else if (e.getSource() == btnDelete) {
            deleteUser();
        } else if (e.getSource() == btnAdd) {
           AdminAdd obj1 = new AdminAdd();
		   obj1.setVisible(true);
           this.setVisible(false);
        } else if (e.getSource() == btnExit) {
           AdminPanel obj2 =  new AdminPanel();
		   obj2.setVisible(true);
           this.setVisible(false);
        }
    }

    
}
