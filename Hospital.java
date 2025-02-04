import javax.swing.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;

public class Hospital extends JFrame implements  ActionListener
{
	private JPanel panel;
	private ImageIcon ic,ic1;
	private JLabel label1,label2,label3;
	private JButton jb1,jb2,jb3,jb4;
	private Color c1,c2,c3,c4,c5;
	private Font f1,f2,f3,f4,f5;
	private ImageIcon icon;
	 public Hospital()
    {
      
        super("Hospital Management System");
        super.setBounds(630, 100, 679, 800);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        panel = new JPanel();
        panel.setLayout(null);
		//c5 = new Color(5, 242, 194); //(R, G, B)
		//panel.setBackground(c5);
		
		icon = new ImageIcon(getClass().getResource(".\\images\\hospital.png"));
        this.setIconImage(icon.getImage());;
		
		ic = new ImageIcon(".\\images\\Frame2.PNG");
		label1 = new JLabel(ic);
		label1.setBounds(-5,0,679,367); 
		panel.add(label1);
		
		label2 = new JLabel("Where healthcare meets smart solutions");
		label2.setBounds(47,400,600,30);
		f5 = new Font("Arial", Font.BOLD, 30); //(name, style, size)
		label2.setFont(f5);
		c5 = new Color (30,117,205);
		label2.setForeground(c5);
		label2.setOpaque(true); //for color overlapping
		panel.add(label2);
		
		
		
		jb1 = new JButton("Login");
        jb1.setBounds(110, 550, 200, 50);
		jb1.addActionListener(this);

		f1 = new Font("Cambria", Font.BOLD , 25);
        jb1.setFont(f1);
        
        c1 = new Color (30,117,205);
        jb1.setBackground(c1);
        jb1.setOpaque(true);
        jb1.setForeground(Color.WHITE);
		panel.add(jb1);
        

        jb2 = new JButton("Register");
        jb2.setBounds(360, 550, 200, 50);
		jb2.addActionListener(this);
		f2 = new Font("Cambria", Font.BOLD , 25);
        jb2.setFont(f2);
		
        c2 = new Color (30,117,205);
        jb2.setBackground(c2);
        jb2.setOpaque(true);
        jb2.setForeground(Color.WHITE);
        panel.add(jb2);
		
		
		jb3 = new JButton("Exit");
        jb3.setBounds(110, 630, 200, 50);
		jb3.addActionListener(this);
		f3 = new Font("Cambria", Font.BOLD , 25);
        jb3.setFont(f3);
        
        c3 = new Color (226,21,21);
        jb3.setBackground(c3);
        jb3.setOpaque(true);
        jb3.setForeground(Color.WHITE);
		panel.add(jb3);
		
		jb4 = new JButton("Admin Login");
        jb4.setBounds(360, 630, 200, 50);
		f3 = new Font("Cambria", Font.BOLD , 25);
		jb4.addActionListener(this);
        jb4.setFont(f3);
		
        c4 = new Color (30,117,205);
        jb4.setBackground(c4);
        jb4.setOpaque(true);
        jb4.setForeground(Color.WHITE);
        panel.add(jb4);
		
		
		ic1= new ImageIcon(".\\images\\bgForLogin.jpg");
		label3= new JLabel (ic1);
		label3.setBounds(0,0,679,800);
		panel.add(label3);

		super.add(panel);
	}
		
		public void actionPerformed(ActionEvent me)
		{
			if (me.getSource() == jb3)
			{
				System.exit(0);
			}
			if (me.getSource() == jb1)
			{
				Login obj2 = new Login(); 
				obj2.setVisible(true);
				this.setVisible(false);
				JOptionPane.showMessageDialog(this, "If you have not completed the registration form, \n" + "you must first complete the registration form, \n" +" then you will receive a username and password\n"+" for login access.");
			}
			if (me.getSource() == jb2)
			{
				Registration obj2 = new Registration(); 
				obj2.setVisible(true);
				this.setVisible(false);
			}
			
			if (me.getSource() == jb4)
			{
				
				AdminLogin obj2 = new AdminLogin(); 
				obj2.setVisible(true);
				this.setVisible(false);
				JOptionPane.showMessageDialog(this, "By default, Admin Name and Password is : 'admin'");
			}
			
		}
	
}