import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdminLogin extends JFrame implements ActionListener {
    private JPanel panel;
    private JLabel lb1, lb2, lb3, lb4,label3;
    private JTextField tf1;
    private JPasswordField pf1;
    private JButton bt1, bt2, bt3;
    private Color c1;
    private Font f1, f2, f4,f5,f6;
    private ImageIcon ic,ic1, icon;

    public AdminLogin() {
        super("Hospital Management System");
        super.setBounds(510, 160, 900, 700);
        super.setResizable(false);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(null);
        c1 = new Color(255, 255, 255);
        panel.setBackground(c1);

        ic = new ImageIcon(".\\images\\admin.png");
        lb1 = new JLabel(ic);
        lb1.setBounds(70, 0, 419, 596);
        panel.add(lb1);

        icon = new ImageIcon(getClass().getResource(".\\images\\hospital.png"));
        this.setIconImage(icon.getImage());

        lb2 = new JLabel("Admin Login");
        lb2.setBounds(450, 100, 500, 80);
        f1 = new Font("Segoe UI Black", Font.BOLD, 60);
        lb2.setFont(f1);
        panel.add(lb2);

        lb3 = new JLabel("Username");
        lb3.setBounds(508, 190, 180, 65);
        f5 = new Font("Segoe UI", Font.BOLD, 20);
        lb3.setFont(f5);
        panel.add(lb3);

        tf1 = new JTextField();
        tf1.setBounds(508, 243, 310, 35);
		f4 = new Font("Segoe UI", Font.BOLD, 19);
		tf1.setFont(f4);
        panel.add(tf1);

        lb4 = new JLabel("Password");
        lb4.setBounds(508, 267, 180, 65);
        lb4.setFont(f5);
        panel.add(lb4);

        pf1 = new JPasswordField();
        pf1.setBounds(508, 320, 310, 35);
        pf1.setEchoChar('*');
		f6 = new Font("Segoe UI Black", Font.BOLD, 19);
		pf1.setFont(f6);
        panel.add(pf1);

        bt1 = new JButton("Exit");
        bt1.setBounds(510, 475, 150, 40);
        bt1.setBackground(Color.RED);
        bt1.setForeground(Color.WHITE);
        f2 = new Font("Segoe UI Black", Font.PLAIN, 25);
        bt1.setFont(f2);
        bt1.addActionListener(this);
        panel.add(bt1);

        bt2 = new JButton("Back");
        bt2.setBounds(670, 475, 150, 40);
        bt2.setForeground(Color.WHITE);
        bt2.setBackground(Color.decode("#2E75B6"));
        bt2.setFont(f2);
        bt2.addActionListener(this);
        panel.add(bt2);

        bt3 = new JButton("Login");
        bt3.setBounds(508, 420, 310, 40);
        bt3.setForeground(Color.WHITE);
        bt3.setBackground(Color.decode("#2E75B6"));
        bt3.setFont(f2);
        bt3.addActionListener(this);
        panel.add(bt3);
		
		ic1= new ImageIcon(".\\images\\bgForAdminLogin.jpg");
		label3= new JLabel (ic1);
		label3.setBounds(0,0,900,700);
		panel.add(label3);

        super.add(panel);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == bt1) {
            System.exit(0);
        } else if (ae.getSource() == bt2) {
            // Navigate back to the previous screen
            JOptionPane.showMessageDialog(this, "Navigating back...");
			Hospital obj3 = new Hospital(); 
			obj3.setVisible(true);
			this.setVisible(false);
        } else if (ae.getSource() == bt3) {
            String name = tf1.getText();
            String pass = new String(pf1.getPassword());

            if (name.isEmpty() || pass.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill up all the info");
            } else {
                AdminAccount admin = new AdminAccount();
                if (admin.validateAdmin(name, pass)) {
                    JOptionPane.showMessageDialog(this, "Login Successful");
					AdminPanel adminpanel = new AdminPanel();
					adminpanel.setVisible(true);
					this.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(this, "Invalid Admin Credentials");
                }
            }
        }
    }

   
}
