import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SelfPack extends JFrame implements ActionListener {
    private JPanel panel;
    private JLabel label1, label3, label4, label6, label7, label8, label9;
    private JComboBox jb1, jb2, jb3, jb4;
    private JButton bt1, bt2, bt3;
    private ImageIcon ic, icon;
    private JTextField feeField;
    private Font f1, f2, f3, f4, f5, f6;
    private boolean isUpdatingSpecialists = false;

    public SelfPack() {
        super("Hospital Management System");
        setBounds(500, 100, 900, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setResizable(false);
        panel = new JPanel();
        panel.setLayout(null);

        ic = new ImageIcon(".\\images\\Selfpack.png");
        label3 = new JLabel(ic);
        label3.setBounds(30, 100, 397, 397);
        panel.add(label3);
		
        // Fonts
        f1 = new Font("Segoe UI Black", Font.PLAIN, 35);
        f2 = new Font("Segoe UI Black", Font.PLAIN, 20);
        f3 = new Font("Segoe UI Semibold", Font.PLAIN, 35);
        f4 = new Font("Segoe UI", Font.PLAIN, 25);
        f5 = new Font("Segoe UI", Font.PLAIN, 19);
        f6 = new Font("Segoe UI", Font.PLAIN, 25);

        // Logo Icon
        icon = new ImageIcon(getClass().getResource(".\\images\\hospital.png"));
        this.setIconImage(icon.getImage());
		
        label1 = new JLabel("Fillup All Information");
        label1.setBounds(470, 10, 600, 200);
        label1.setFont(new Font("Segoe", Font.PLAIN, 35));
        panel.add(label1);

        label4 = new JLabel("Department");
        label4.setBounds(465, 140, 600, 200);
        label4.setFont(new Font("Segoe", Font.PLAIN, 25));
        panel.add(label4);

        String dept[] = {" ", "Cardiology", "Gyneocology", "Orthopedic", "Dentists", "Eye Specialists", "Surgeon"};
        jb1 = new JComboBox(dept);
        jb1.setBounds(605, 230, 250, 30);
        jb1.setForeground(Color.decode("#6087D5"));
        jb1.setFont(f2);
        jb1.addActionListener(this);
        panel.add(jb1);

        label6 = new JLabel("Specialist");
        label6.setBounds(465, 200, 600, 200);
        label6.setFont(new Font("Segoe", Font.PLAIN, 25));
        panel.add(label6);

        jb2 = new JComboBox();
        jb2.setBounds(605, 288, 250, 30);
        jb2.setForeground(Color.decode("#6087D5"));
        jb2.setFont(f2);
        jb2.addActionListener(this);
        panel.add(jb2);

        label9 = new JLabel("Appointment Fee");
        label9.setBounds(465, 390, 600, 200);
        label9.setFont(new Font("Segoe", Font.PLAIN, 25));
        panel.add(label9);

        feeField = new JTextField();
        feeField.setBounds(680, 473, 170, 30);
        feeField.setEditable(false);
        feeField.setFont(f5);
        panel.add(feeField);

        
        JLabel labelDate = new JLabel("Appointment Date");
        labelDate.setBounds(465, 350, 220, 30);
        labelDate.setFont(new Font("Segoe", Font.PLAIN, 25));
        panel.add(labelDate);

        jb3 = new JComboBox();
        jb3.setBounds(680, 352, 170, 30);
        jb3.setFont(f5);
        panel.add(jb3);

        JLabel labelTime = new JLabel("Appointment Time");
        labelTime.setBounds(465, 410, 220, 30);
        labelTime.setFont(new Font("Segoe", Font.PLAIN, 25));
        panel.add(labelTime);

        jb4 = new JComboBox();
        jb4.setBounds(680, 410, 170, 30);
        jb4.setFont(f5);
        panel.add(jb4);

        // Populate jb3 with literal appointment date strings
        String[] dates = {
            " ", "03-02-2025", "04-02-2025", "05-02-2025", "06-02-2025", "07-02-2025",
            "08-02-2025", "09-02-2025", "10-02-2025", "11-02-2025", "12-02-2025",
            "13-02-2025", "14-02-2025", "15-02-2025", "16-02-2025", "17-02-2025",
            "18-02-2025", "19-02-2025", "20-02-2025", "21-02-2025", "22-02-2025",
            "23-02-2025", "24-02-2025", "25-02-2025", "26-02-2025", "27-02-2025",
            "28-02-2025", "01-03-2025", "02-03-2025", "03-03-2025", "04-03-2025"
        };
        for (String date : dates) {
            jb3.addItem(date);
        }

        // Populate jb4 with appointment time slots
        String[] times = {" ", "10:00 AM", "11:00 AM", "12:00 PM", "01:00 PM", "02:00 PM", "03:00 PM", "04:00 PM", "05:00 PM"};
        for (String time : times) {
            jb4.addItem(time);
        }

        bt1 = new JButton("Exit");
        bt1.setFont(new Font("Segoe UI Black", Font.PLAIN, 30));
        bt1.setBounds(50, 600, 200, 50);
        bt1.setForeground(Color.WHITE);
        bt1.setBackground(Color.decode("#C00000"));
        bt1.addActionListener(this);
        panel.add(bt1);

        bt2 = new JButton("Back");
        bt2.setFont(new Font("Segoe UI Black", Font.PLAIN, 30));
        bt2.setBounds(335, 600, 200, 50);
        bt2.setForeground(Color.WHITE);
        bt2.setBackground(Color.decode("#2E75B6"));
        bt2.addActionListener(this);
        panel.add(bt2);

        bt3 = new JButton("Next");
        bt3.setFont(new Font("Segoe UI Black", Font.PLAIN, 30));
        bt3.setBounds(620, 600, 200, 50);
        bt3.setForeground(Color.WHITE);
        bt3.setBackground(Color.decode("#45C75F"));
        bt3.addActionListener(this);
        panel.add(bt3);

        add(panel);
    }

    public void actionPerformed(ActionEvent me) {
        if (me.getSource() == bt2) {
            PatientHome obj1 = new PatientHome();
            obj1.setVisible(true);
            this.setVisible(false);
        }
        if (me.getSource() == bt1) {
            System.exit(0);
        }
        if (me.getSource() == jb1) {
            String selectedDept = (String) jb1.getSelectedItem();
            isUpdatingSpecialists = true;
            jb2.removeAllItems();
            if (selectedDept != null) {
                switch (selectedDept) {
                    case "Cardiology":
                        jb2.addItem("Dr. Khondokar");
                        jb2.addItem("Dr. Rahman");
                        jb2.setForeground(Color.decode("#6087D5"));
                        jb2.setFont(f2);
                        break;
                    case "Gyneocology":
                        jb2.addItem("Dr. Akhter");
                        jb2.addItem("Dr. Begum");
                        break;
                    case "Orthopedic":
                        jb2.addItem("Dr. Chowdhury");
                        jb2.addItem("Dr. Ahmed");
                        break;
                    case "Dentists":
                        jb2.addItem("Dr. Islam");
                        jb2.addItem("Dr. Hossain");
                        break;
                    case "Eye Specialists":
                        jb2.addItem("Dr. Uddin");
                        jb2.addItem("Dr. Siddiqui");
                        break;
                    case "Surgeon":
                        jb2.addItem("Dr. Khan");
                        jb2.addItem("Dr. Das");
                        break;
                }
            }
            isUpdatingSpecialists = false;
        }
        if (me.getSource() == jb2 && !isUpdatingSpecialists) {
            String selectedSpecialist = (String) jb2.getSelectedItem();
            if (selectedSpecialist != null) {
                switch (selectedSpecialist) {
                    case "Dr. Khondokar": feeField.setText("1000 BDT"); break;
                    case "Dr. Rahman": feeField.setText("1200 BDT"); break;
                    case "Dr. Akhter": feeField.setText("900 BDT"); break;
                    case "Dr. Begum": feeField.setText("1100 BDT"); break;
                    case "Dr. Chowdhury": feeField.setText("1300 BDT"); break;
                    case "Dr. Ahmed": feeField.setText("1250 BDT"); break;
                    case "Dr. Islam": feeField.setText("1400 BDT"); break;
                    case "Dr. Hossain": feeField.setText("1500 BDT"); break;
                    case "Dr. Uddin": feeField.setText("1350 BDT"); break;
                    case "Dr. Siddiqui": feeField.setText("1450 BDT"); break;
                    case "Dr. Khan": feeField.setText("1550 BDT"); break;
                    case "Dr. Das": feeField.setText("1600 BDT"); break;
                    default: feeField.setText("");
                }
            }
        }
        
        if (me.getSource() == bt3) {
            if (jb1.getSelectedItem().equals(" ") ||
                jb2.getSelectedItem().equals(" ") ||
                jb3.getSelectedItem().equals(" ") ||
                jb4.getSelectedItem().equals(" ")) {
                JOptionPane.showMessageDialog(this, "Please fill out all fields!", "Warning", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            // Proceed if all fields are filled
            JOptionPane.showMessageDialog(this, "All fields are filled. Proceeding...");
            
			
			String fee = feeField.getText();
			String selectedDoctor = (String) jb2.getSelectedItem();
              JOptionPane.showMessageDialog(this, 
            "Your appointment with " + selectedDoctor + " has a fee of: " + fee + ". \nTo complete the procedure please make your payment first!", 
            "Appointment Confirmation", 
            JOptionPane.INFORMATION_MESSAGE);
			
			Payment obj2 = new Payment();
			obj2.setVisible(true);
			this.setVisible(false);
    }

	}
}
