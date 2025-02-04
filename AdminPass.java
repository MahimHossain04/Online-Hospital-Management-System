import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdminPass extends JFrame implements ActionListener {
    private JPanel panel;
    private JLabel lb1, lb2, lb3, lb4;
    private JTextField tf1;
    private JPasswordField pf1;
    private JButton bt1, bt2;
    private Color c1;
    private Font f1, f2, f3, f4;
    private ImageIcon ic, icon;

    public AdminPass() {
        super("Hospital Management System");
        setBounds(650, 250, 700, 445);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(null);
        c1 = new Color(255, 255, 255);
        panel.setBackground(c1);

        icon = new ImageIcon(getClass().getResource(".\\images\\hospital.png"));
        setIconImage(icon.getImage());

        lb1 = new JLabel("CHANGE NAME AND PASSWORD");
        lb1.setBounds(120, 10, 600, 60);
        f1 = new Font("Cambria", Font.BOLD, 30);
        lb1.setForeground(Color.BLACK);
        lb1.setFont(f1);
        panel.add(lb1);

        lb2 = new JLabel("New Username");
        lb2.setBounds(195, 100, 150, 60);
        f2 = new Font("Cambria", Font.BOLD, 20);
        lb2.setFont(f2);
        panel.add(lb2);

        tf1 = new JTextField();
        tf1.setBounds(360, 114, 180, 30);
        tf1.setFont(f2);
        panel.add(tf1);

        lb3 = new JLabel("New Password");
        lb3.setBounds(195, 170, 320, 60);
        f3 = new Font("Cambria", Font.BOLD, 20);
        lb3.setFont(f3);
        panel.add(lb3);

        pf1 = new JPasswordField();
        pf1.setBounds(360, 182, 180, 30);
        pf1.setEchoChar('*');
        pf1.setFont(f3);
        panel.add(pf1);

        bt1 = new JButton("Close");
        bt1.setBounds(210, 245, 130, 35);
        bt1.setBackground(Color.RED);
        bt1.setForeground(Color.WHITE);
        bt1.addActionListener(this);
        f4 = new Font("Segoe UI Black", Font.PLAIN, 20);
        bt1.setFont(f4);
        panel.add(bt1);

        bt2 = new JButton("Change");
        bt2.setBounds(375, 245, 130, 35);
        bt2.setBackground(Color.decode("#39DA19"));
        bt2.setForeground(Color.WHITE);
        bt2.addActionListener(this);
        bt2.setFont(f4);
        panel.add(bt2);


		ic= new ImageIcon(".\\images\\bg.jpg");
		lb4= new JLabel (ic);
		lb4.setBounds(0,0,700,445);
		panel.add(lb4);
        

        super.add(panel);
    
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == bt1) {
            AdminPanel obj1 = new AdminPanel();
            obj1.setVisible(true);
            this.setVisible(false);
        } else if (ae.getSource() == bt2) {
            String name = tf1.getText();
            String pass = new String(pf1.getPassword());

            if (name.isEmpty() || pass.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill up all the info!");
            } else {
                AdminAccount admin = new AdminAccount();
                boolean updated = admin.updateAdminCredentials(name, pass);
                if (updated) {
                    JOptionPane.showMessageDialog(this, "Admin security details successfully changed!");
					AdminPanel obj1 = new AdminPanel();
					obj1.setVisible(true);
					this.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to update security details. Try again.");
                }
            }
			
        }
		
	}
}