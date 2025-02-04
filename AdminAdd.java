import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdminAdd extends JFrame implements ActionListener {
    private JPanel panel;
    private JLabel labelheader, labelusername, labelemail, labelgender, labelage, labelpassword;
    private JTextField tfusername, tfemail, tfage;
    private JPasswordField pfpassword;
    private JRadioButton rdmale, rdfemale;
    private ButtonGroup bgGender;
	private ImageIcon icon;
	private Font f1, f2, f3, f4;
    private JButton btback, btadd;
    private Color c1;

    public AdminAdd() {
        super("Hospital Management System");
        setBounds(620, 240, 600, 450);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(null);
        c1 = new Color(255, 255, 255);
        panel.setBackground(c1);
        super.add(panel);
		
		// Fonts
        f1 = new Font("Segoe UI Black", Font.PLAIN, 35);
        f2 = new Font("Segoe UI Black", Font.PLAIN, 25);
        f3 = new Font("Segoe UI Semibold", Font.PLAIN, 20);
        f4 = new Font("Segoe UI", Font.PLAIN, 18);

		
		icon = new ImageIcon(getClass().getResource(".\\images\\hospital.png"));
        this.setIconImage(icon.getImage());;

        labelheader = new JLabel("Enter Information");
        labelheader.setFont(new Font("Cambria", Font.PLAIN, 30));
        labelheader.setBounds(160, 10, 400, 80);
        panel.add(labelheader);

        labelusername = new JLabel("User Name : ");
        labelusername.setBounds(130, 100, 200, 30);
        panel.add(labelusername);

        tfusername = new JTextField();
        tfusername.setBounds(270, 100, 200, 30);
        panel.add(tfusername);

        labelemail = new JLabel("Email : ");
        labelemail.setBounds(130, 140, 200, 30);
        panel.add(labelemail);

        tfemail = new JTextField();
        tfemail.setBounds(270, 140, 200, 30);
        panel.add(tfemail);

        labelgender = new JLabel("Gender : ");
        labelgender.setBounds(130, 180, 200, 30);
        panel.add(labelgender);

        rdmale = new JRadioButton("Male");
        rdmale.setBounds(270, 180, 80, 30);
		rdmale.setBackground(Color.WHITE);
        panel.add(rdmale);

        rdfemale = new JRadioButton("Female");
        rdfemale.setBounds(380, 180, 80, 30);
		rdfemale.setBackground(Color.WHITE);
        panel.add(rdfemale);

        bgGender = new ButtonGroup();
        bgGender.add(rdmale);
        bgGender.add(rdfemale);

        labelage = new JLabel("Age:");
        labelage.setBounds(130, 220, 200, 30);
        panel.add(labelage);

        tfage = new JTextField();
        tfage.setBounds(270, 220, 200, 30);
        panel.add(tfage);

        labelpassword = new JLabel("Password:");
        labelpassword.setBounds(130, 260, 200, 30);
        panel.add(labelpassword);

        pfpassword = new JPasswordField();
        pfpassword.setBounds(270, 260, 200, 30);
        panel.add(pfpassword);

        btback = new JButton("Back");
        btback.setBounds(130, 320, 150, 40);
        btback.setForeground(Color.WHITE);
        btback.setBackground(Color.decode("#2E75B6"));
		btback.setFont(f2);
        btback.addActionListener(this);
        panel.add(btback);

        btadd = new JButton("Add");
        btadd.setBounds(310, 320, 150, 40);
        btadd.setForeground(Color.WHITE);
        btadd.setBackground(Color.decode("#2E75B6"));
		btadd.setFont(f2);
        btadd.addActionListener(this);
        panel.add(btadd);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == btback) {
            UserData obj1 = new UserData();
            obj1.setVisible(true);
            this.setVisible(false);
        }

        if (ae.getSource() == btadd) {
            String username = tfusername.getText();
            String email = tfemail.getText();
            String age = tfage.getText();
            String password = String.valueOf(pfpassword.getPassword());
            String gender = "";

            if (rdmale.isSelected()) {
                gender = "Male";
            } else if (rdfemale.isSelected()) {
                gender = "Female";
            }

            if (username.isEmpty() || email.isEmpty() || age.isEmpty() || password.isEmpty() || gender.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill out all fields!");
                return;
            }

            Account newAccount = new Account(username, email, age, gender, password);

            if (newAccount.isUsernameTaken()) {
                JOptionPane.showMessageDialog(this, "Username is already taken. Please choose another.");
            } else {
                newAccount.addAccount();
                JOptionPane.showMessageDialog(this, "User added successfully!");
                UserData obj1 = new UserData();
                obj1.setVisible(true);
                this.setVisible(false);
            }
        }
    }
}
