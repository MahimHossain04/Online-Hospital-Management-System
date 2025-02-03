import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class AdminPanel extends JFrame implements ActionListener
{
	private JPanel panel;
	private JLabel label1,label2,label3,label4;
	private JTextField tf1;
	private JPasswordField pf1;
	private JButton bt1,bt2,bt3,bt4;
	private Color c1;
	private Font f1,f2,f3,f4,f5,f6,f7;
	private ImageIcon ic,icon;

    
	public AdminPanel ()
	{
		super("Hospital Management System");
		super.setBounds(650,150,600,700);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel=new JPanel ();
		panel.setLayout(null);
		c1= new Color (255,255,255);
		panel.setBackground(c1);
		
		icon = new ImageIcon(getClass().getResource(".\\images\\hospital.png"));
        this.setIconImage(icon.getImage());;
		
		f1 = new Font("Segoe UI Black", Font.PLAIN, 35);
        f2 = new Font("Segoe UI Black", Font.PLAIN, 25);
        f3 = new Font("Segoe UI Semibold", Font.PLAIN, 35);
        f4 = new Font("Segoe UI", Font.PLAIN, 25);
        f5 = new Font("Segoe UI", Font.PLAIN, 19);
        f6 = new Font("Segoe UI", Font.PLAIN, 25);
		
		ic= new ImageIcon(".\\images\\Image.png");
		label1= new JLabel (ic);
		label1.setBounds(-50,70,679,367);
		panel.add(label1);
		
		label2=new JLabel ("Administration");
		label2.setBounds(130,0,400,150);
		f7=new Font ("Cambria",Font.BOLD,50);
		label2.setFont(f7);
		panel.add(label2);
		
		bt1=new JButton ("User Data");
		bt1.setBounds(90,430,400,40);
		bt1.setBackground(Color.decode("#2E75B6"));
		bt1.setForeground(Color.WHITE);
		bt1.addActionListener(this);
		bt1.setFont(f1);
		panel.add(bt1);
		
		bt2=new JButton ("Admin Password");
		bt2.setBounds(90,480,400,40);
		bt2.setBackground(Color.decode("#2E75B6"));
		bt2.setForeground(Color.WHITE);
		bt2.addActionListener(this);
		bt2.setFont(f1);
		panel.add(bt2);
		
		bt3=new JButton ("Exit");
		bt3.setBounds(90,530,400,40);
		bt3.setBackground(Color.RED);
		bt3.setForeground(Color.WHITE);
		bt3.addActionListener(this);
		bt3.setFont(f1);
		panel.add(bt3);
		
		bt4=new JButton ("Back");
		bt4.setBounds(90,580,400,40);
		bt4.setBackground(Color.decode("#2E75B6"));
		bt4.setForeground(Color.WHITE);
		bt4.addActionListener(this);
		bt4.setFont(f1);
		panel.add(bt4);
		
		super.add(panel);
	}
	
	public void actionPerformed (ActionEvent ae)
	{
		if(ae.getSource () == bt4)
		{
			Hospital obj1 = new Hospital();
			obj1.setVisible(true);
			this.setVisible(false);
		}
		if(ae.getSource() == bt3)
		{
			System.exit(0);
		}
		if(ae.getSource() == bt2)
		{
			AdminPass obj3= new AdminPass();
			obj3.setVisible(true);
			this.setVisible(false);
		}
		if(ae.getSource()== bt1)
		{
			UserData obj2 = new UserData();
			obj2.setVisible(true);
			this.setVisible(false);
		}
		
	}
	

}