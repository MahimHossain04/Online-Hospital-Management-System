import javax.swing.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener
{
	private JPanel panel;
	private ImageIcon ic;
	private JLabel label1,label2,label3,label4;
	private JButton jb1,jb2,jb3,jb4;
	private Color c1,c2,c3,c4,c5;
	private JTextField tf1, tf2;
	private Font f1,f2,f3,f4,f5,f6,f7;
	private JPasswordField pf1;
	private ImageIcon icon;
	
	public Login()
	{
		super("Hospital Management System");
        super.setBounds(630, 100, 679, 800);
		super.setResizable(false);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        panel = new JPanel();
        panel.setLayout(null);
		c5 = new Color(240, 255, 252); //(R, G, B)
		panel.setBackground(c5);
		icon = new ImageIcon(getClass().getResource(".\\images\\hospital.png"));
        this.setIconImage(icon.getImage());;
		
		f1 = new Font("Segoe UI Black", Font.BOLD, 60);
		f2 = new Font("Segoe UI", Font.PLAIN, 20);
		
		label1 = new JLabel();
        label1.setText("User Login");
        label1.setBounds(155, 370, 500, 90);
        label1.setFont(f1);
        panel.add(label1);
		
		ic = new ImageIcon (".\\images\\login.jpeg");
		label2 = new JLabel(ic);
		label2.setBounds(0,0,679,367); 
		label2.setOpaque(true);
		panel.add(label2);
		
		label3 = new JLabel ("Username");
		label3.setBounds(140,497,100,25);
		f5 = new Font("Segoe UI", Font.BOLD, 20); //(name, style, size)
		label3.setFont(f5);
		label3.setBackground(c5);
		label3.setOpaque(true);
		panel.add(label3);
		
		tf1 = new JTextField();
		tf1.setBounds(270,495,250,35);
		tf1.setFont(f2);
		panel.add(tf1);
		
		label4 = new JLabel ("Password");
		label4.setBounds(140,557,100,15);
		f4 = new Font("Arial", Font.BOLD, 20); //(name, style, size)
		label4.setFont(f4);
		label4.setBackground(c5);
		label4.setOpaque(true);
		panel.add(label4);
		
		pf1 = new JPasswordField();
		pf1.setBounds(270,550,250,35);
		pf1.setFont(f2);
		pf1.setEchoChar('*');
		panel.add(pf1);
		
		
		jb1 = new JButton("Exit");
        jb1.setBounds(37, 645, 150, 50);
		jb1.addActionListener(this);
		f3 = new Font("CSegoe UI", Font.BOLD , 25);
        jb1.setFont(f3);
        
        c1 = new Color (226,21,21);
        jb1.setBackground(c1);
        jb1.setOpaque(true);
        jb1.setForeground(Color.WHITE);
		panel.add(jb1);
        

        jb2 = new JButton("Login");
        jb2.setBounds(216, 645, 230, 50);
		f6 = new Font("Segoe UI", Font.BOLD , 25);
		jb2.addActionListener(this);
        jb2.setFont(f6);
		
        c2 = new Color (30,117,205);
        jb2.setBackground(c2);
        jb2.setOpaque(true);
        jb2.setForeground(Color.WHITE);
        panel.add(jb2);
		
		
		jb3 = new JButton("Back");
        jb3.setBounds(475, 645, 150, 50);
		jb3.addActionListener(this);
		f3 = new Font("Segoe UI", Font.BOLD , 25);
        jb3.setFont(f3);
		panel.add(jb3);
		c3 = new Color (30,115,205);
        jb3.setBackground(c3);
        jb3.setOpaque(true);
        jb3.setForeground(Color.WHITE);
		
		
		super.add(panel);
		
	}
	public void actionPerformed(ActionEvent me)
		{
			if (me.getSource() == jb1)
			{
				System.exit(0);
			}
			if (me.getSource() == jb3)
			{
				Hospital obj3 = new Hospital(); 
				obj3.setVisible(true);
				this.setVisible(false);
			}
			if (me.getSource()==jb2)
			{
				String username = tf1.getText();
				String Pass = pf1.getText();
				
				Account acc = new Account (username, Pass);
				if (acc.checkAccount() == true) 
				{
					JOptionPane.showMessageDialog(this,"Login Successfull, Welcome to MedCare360!");
					PatientHome obj1 = new PatientHome();
					obj1.setVisible(true);
					this.setVisible(false);
					
				}
				else 
				{
					JOptionPane.showMessageDialog(this,"Invalid Username or Password");
				}
			}
			
		}
}