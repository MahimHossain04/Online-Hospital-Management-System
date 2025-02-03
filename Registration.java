import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Registration extends JFrame implements MouseListener, ActionListener {
    private JPanel panel;
    private JLabel labelic,labelHeader, labelUsername, labelEmail, labelGender, labelAge, labelPassword;
    private JTextField tfUsername, tfEmail, tfAge;
    private JPasswordField pfPassword;
	private Font f1, f2, f3, f4, f5, f6;
    private JRadioButton rdMale, rdFemale;
    private ButtonGroup bgGender;
	private ImageIcon icon,ic;
	private Color c1;
    private JButton btnRegister, btnReset, btnBack, btnExit,bntShow;

    public Registration() {
        super("Hospital Management System");
        setBounds(400, 120, 1100, 700);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(null);
		
		//Font
		f1 = new Font("Segoe UI Black", Font.PLAIN, 35);
        f2 = new Font("Segoe UI Black", Font.PLAIN, 25);
        f3 = new Font("Segoe UI Semibold", Font.PLAIN, 35);
        f4 = new Font("Segoe UI", Font.PLAIN, 25);
        f5 = new Font("Segoe UI", Font.PLAIN, 19);
        f6 = new Font("Segoe UI", Font.PLAIN, 25);
		
		//Logo
		icon = new ImageIcon(getClass().getResource(".\\images\\hospital.png"));
        this.setIconImage(icon.getImage());;
		
		//Icon
		ic = new ImageIcon(".\\images\\register.png");
		labelic = new JLabel(ic);
		labelic.setBounds(0,0,600,600); 
		panel.add(labelic);

        // Header
        labelHeader = new JLabel("Enter Your Information");
        labelHeader.setFont(new Font("Segoe UI Black", Font.PLAIN, 35));
        labelHeader.setBounds(650, 50, 500, 50);
        panel.add(labelHeader);

        // Username
        labelUsername = new JLabel("User Name");
        labelUsername.setFont(f4);
        labelUsername.setBounds(650, 150, 200, 30);
        panel.add(labelUsername);

        tfUsername = new JTextField();
        tfUsername.setFont(f5);
        tfUsername.setBounds(850, 150, 200, 30);
        panel.add(tfUsername);

        // Email
        labelEmail = new JLabel("Email");
        labelEmail.setFont(f4);
        labelEmail.setBounds(650, 200, 200, 30);
        panel.add(labelEmail);

        tfEmail = new JTextField();
        tfEmail.setFont(f5);
        tfEmail.setBounds(850, 200, 200, 30);
        panel.add(tfEmail);

        // Gender
        labelGender = new JLabel("Gender");
        labelGender.setFont(f4);
        labelGender.setBounds(650, 250, 200, 30);
        panel.add(labelGender);

        rdMale = new JRadioButton("Male");
        rdMale.setFont(f5);
        rdMale.setBounds(850, 250, 80, 30);
        panel.add(rdMale);

        rdFemale = new JRadioButton("Female");
        rdFemale.setFont(f5);
        rdFemale.setBounds(950, 250, 100, 30);
        panel.add(rdFemale);

        bgGender = new ButtonGroup();
        bgGender.add(rdMale);
        bgGender.add(rdFemale);

        // Age
        labelAge = new JLabel("Age");
        labelAge.setFont(f4);
        labelAge.setBounds(650, 300, 200, 30);
        panel.add(labelAge);

        tfAge = new JTextField();
        tfAge.setFont(f5);
        tfAge.setBounds(850, 300, 200, 30);
        panel.add(tfAge);

        // Password
        labelPassword = new JLabel("Password");
        labelPassword.setFont(f4);
        labelPassword.setBounds(650, 350, 200, 30);
        panel.add(labelPassword);

        pfPassword = new JPasswordField();
        pfPassword.setFont(f5);
        pfPassword.setBounds(850, 350, 200, 30);
		pfPassword.setEchoChar('*');
        panel.add(pfPassword);

        // Buttons
        btnRegister = new JButton("Register");
        btnRegister.setFont(f2);
        btnRegister.setBounds(870, 450, 180, 40);
		btnRegister.setForeground(Color.WHITE);
        btnRegister.setBackground(Color.decode("#2E75B6"));
        btnRegister.addActionListener(this);
        panel.add(btnRegister);

        btnReset = new JButton("Reset");
        btnReset.setFont(f2);
        btnReset.setBounds(650, 450, 180, 40);
		btnReset.setForeground(Color.WHITE);
        btnReset.setBackground(Color.decode("#2E75B6"));
        btnReset.addActionListener(this);
        panel.add(btnReset);

        btnBack = new JButton("Back");
        btnBack.setFont(f2);
        btnBack.setBounds(650, 500, 180, 40);
		btnBack.setForeground(Color.WHITE);
        btnBack.setBackground(Color.decode("#2E75B6"));
        btnBack.addActionListener(this);
        panel.add(btnBack);

        btnExit = new JButton("Exit");
        btnExit.setFont(f2);
        btnExit.setBounds(870, 500, 180, 40);
		btnExit.setForeground(Color.WHITE);
		btnExit.setBackground(Color.decode("#C00000"));
        btnExit.addActionListener(this);
        panel.add(btnExit);
		
		
		
		//Password show button
		bntShow = new JButton("Show password");
		bntShow.setBounds(850, 390, 200, 20);
		bntShow.addMouseListener(this);
		bntShow.setForeground(Color.BLACK);
		bntShow.setBackground(Color.decode("#B1DCF9"));
		panel.add(bntShow);

        super.add(panel);
    }

	
	public void mouseClicked(MouseEvent me)
	{
		if (me.getSource() == bntShow )
		{
			bntShow.setText("Show password");
			String s1 = pfPassword.getText();
			pfPassword.setText(s1);
		}
		else {}
	}
	public void mousePressed(MouseEvent me) {
    if (me.getSource() == bntShow) {
        pfPassword.setEchoChar((char) 0); // Show password
    }
	}

	public void mouseReleased(MouseEvent me) {
    if (me.getSource() == bntShow) {
        pfPassword.setEchoChar('*'); // Hide password
    }
	}

	public void mouseEntered(MouseEvent me) {
		if (me.getSource() == bntShow){
			bntShow.setForeground(Color.BLACK);
			bntShow.setBackground(Color.decode("#45C75F"));
		}
	}
	public void mouseExited(MouseEvent me) {
		if (me.getSource() == bntShow){
			bntShow.setForeground(Color.BLACK);
			bntShow.setBackground(Color.decode("#B1DCF9"));
		}
	}
   
   public void actionPerformed(ActionEvent e) {
	   
        if (e.getSource() == btnRegister) {
            String username = tfUsername.getText();
            String email = tfEmail.getText();
            String age = tfAge.getText();
            String password = String.valueOf(pfPassword.getPassword());
            String gender = "";

            // Determine gender
            if (rdMale.isSelected()) {
                gender = "Male";
            } else if (rdFemale.isSelected()) {
                gender = "Female";
            }

            // Validate fields
            if (username.isEmpty() || email.isEmpty() || age.isEmpty() || password.isEmpty() || gender.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill out all fields!");
                return;
            }

            Account account = new Account(username, email, age, gender, password);

            if (account.isUsernameTaken()) {
                JOptionPane.showMessageDialog(this, "Username already exists!");
            } else {
                account.addAccount();
                JOptionPane.showMessageDialog(this, "Registration Successful!");
                resetFields();
            }
		}
			if (e.getSource() == btnExit)
			{
				System.exit(0);
			}
         else if (e.getSource() == btnReset) {
            resetFields();
        } else if (e.getSource() == btnBack) {
            new Login().setVisible(true);
            this.setVisible(false);
        }
    }

    private void resetFields() {
        tfUsername.setText("");
        tfEmail.setText("");
        tfAge.setText("");
        pfPassword.setText("");
        bgGender.clearSelection();
    }
}
