import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Default extends JFrame implements MouseListener, ActionListener
{
	private JPanel panel;
	private JLabel label1,label2,label3,label4,label5,label6,label7,lb4;
	private Font f1,f2,f3;
	private JButton bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8;
	private ImageIcon icon,ic,ic1,ic2,ic3,ic4,ic5,ic6;
	private Color c1;
	
	public Default()
	{
		super("Hospital Management System");
		super.setBounds(320,60,1200,900);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		super.setResizable(false);
		panel.setLayout(null);
		
		icon = new ImageIcon(getClass().getResource(".\\images\\hospital.png"));
        this.setIconImage(icon.getImage());;
		
		label1 = new JLabel("Please Select One");
		label1.setBounds(400, 0, 700, 200);
		f1 = new Font("Cambria",Font.BOLD,40);
		label1.setFont(f1);
		panel.add(label1);
		
		ic1 = new ImageIcon(".\\images\\Cardio.png");
		label2 = new JLabel(ic1);
		label2.setBounds(0,0,600,600);
		panel.add(label2);
		
		ic2 = new ImageIcon(".\\images\\gyne.png");
		label3 = new JLabel(ic2);
		label3.setBounds(270,0,600,600);
		panel.add(label3);
		
		ic3 = new ImageIcon(".\\images\\Orthopedic.png");
		label4 = new JLabel(ic3);
		label4.setBounds(550,0,600,600);
		panel.add(label4);
		
		ic4 = new ImageIcon(".\\images\\Dental.png");
		label5 = new JLabel(ic4);
		label5.setBounds(0,260,600,600);
		panel.add(label5);
		
		ic5 = new ImageIcon(".\\images\\Eye.png");
		label6 = new JLabel(ic5);
		label6.setBounds(270,260,600,600);
		panel.add(label6);
		
		ic6 = new ImageIcon(".\\images\\Surgon.png");
		label7 = new JLabel(ic6);
		label7.setBounds(550,270,600,600);
		panel.add(label7);
		
		bt1 = new JButton("CARDIOLOGIST");
		bt1.setBounds(180,400,200,40);
		f2 = new Font("Cambria",Font.BOLD,20);
		bt1.setFont(f2);
		bt1.setBackground(Color.decode("#2E75B6"));
		bt1.setOpaque(true);
		bt1.setForeground(Color.WHITE);
		bt1.addMouseListener(this);
		bt1.addActionListener(this);
		panel.add(bt1);
		
		bt2 = new JButton("GYNEC0LOGISTS");
		bt2.setBounds(470,400,200,40);
		f3 = new Font("Cambria",Font.BOLD,20);
		bt2.setFont(f2);
		bt2.setBackground(Color.decode("#2E75B6"));
		bt2.setOpaque(true);
		bt2.setForeground(Color.WHITE);
		bt2.addActionListener(this);
		bt2.addMouseListener(this);
		panel.add(bt2);
		
		bt3 = new JButton("ORTHOPEDICS");
		bt3.setBounds(760,400,200,40);
		f3 = new Font("Cambria",Font.BOLD,20);
		bt3.setFont(f3);
		bt3.setBackground(Color.decode("#2E75B6"));
		bt3.setOpaque(true);
		bt3.setForeground(Color.WHITE);
		bt3.addActionListener(this);
		bt3.addMouseListener(this);
		panel.add(bt3);
		
		bt4 = new JButton("DENTISTS");
		bt4.setBounds(180,680,200,40);
		f3 = new Font("Cambria",Font.BOLD,20);
		bt4.setFont(f3);
		bt4.setBackground(Color.decode("#2E75B6"));
		bt4.setOpaque(true);
		bt4.setForeground(Color.WHITE);
		bt4.addActionListener(this);
		bt4.addMouseListener(this);
		panel.add(bt4);
		
		bt5 = new JButton("EYE SPECIALISTS");
		bt5.setBounds(470,680,200,40);
		f3 = new Font("Cambria",Font.BOLD,20);
		bt5.setFont(f3);
		bt5.setBackground(Color.decode("#2E75B6"));
		bt5.setOpaque(true);
		bt5.setForeground(Color.WHITE);
		bt5.addActionListener(this);
		bt5.addMouseListener(this);
		panel.add(bt5);
		
		bt6 = new JButton("SURGEONS");
		bt6.setBounds(760,680,200,40);
		f3 = new Font("Cambria",Font.BOLD,20);
		bt6.setFont(f3);
		bt6.setBackground(Color.decode("#2E75B6"));
		bt6.setOpaque(true);
		bt6.setForeground(Color.WHITE);
		bt6.addActionListener(this);
		bt6.addMouseListener(this);
		panel.add(bt6);
		
		bt7 = new JButton("BACK");
		bt7.setBounds(380,790,150,40);
		f3 = new Font("Cambria",Font.BOLD,20);
		bt7.setFont(f3);
		bt7.setBackground(Color.decode("#2E75B6"));
		bt7.setOpaque(true);
		bt7.setForeground(Color.WHITE);
		bt7.addActionListener(this);
		panel.add(bt7);
		
		bt8 = new JButton("EXIT");
		bt8.setBounds(590,790,150,40);
		f3 = new Font("Cambria",Font.BOLD,20);
		bt8.setFont(f3);
		//c1 = new Color(102,178,255);
		bt8.setBackground(Color.decode("#C00000"));
		bt8.setOpaque(true);
		bt8.setForeground(Color.WHITE);
		bt8.addActionListener(this);
		panel.add(bt8);
		
		ic= new ImageIcon(".\\images\\bg2.jpg");
		lb4= new JLabel (ic);
		lb4.setBounds(0,0,1200,900);
		lb4.setOpaque(true);
		panel.add(lb4);
		
		super.add(panel);
	}
	
	
	public void mouseClicked(MouseEvent me){ }
	public void mouseEntered(MouseEvent me) 
	{
		if (me.getSource() == bt1)
		{
			bt1.setBackground(Color.decode("#E6824F"));
			bt1.setForeground(Color.WHITE);
		}
		if (me.getSource() == bt2)
		{
			bt2.setBackground(Color.decode("#4FE1E6"));
			bt2.setForeground(Color.WHITE);
		}
		if (me.getSource() == bt3)
		{
			bt3.setBackground(Color.decode("#E5C56D"));
			bt3.setForeground(Color.WHITE);
		}
		if (me.getSource() == bt4)
		{
			bt4.setBackground(Color.decode("#25C5DE"));
			bt4.setForeground(Color.WHITE);
		}
		if (me.getSource() == bt5)
		{
			bt5.setBackground(Color.decode("#ADC4F3"));
			bt5.setForeground(Color.WHITE);
		}
		if (me.getSource() == bt6)
		{
			bt6.setBackground(Color.decode("#37B77C"));
			bt6.setForeground(Color.WHITE);
		}
	}

    public void mouseExited(MouseEvent me) 
	{
		if (me.getSource() == bt1)
		{
			bt1.setBackground(Color.decode("#2E75B6"));
			bt1.setForeground(Color.WHITE);
		}
		if (me.getSource() == bt2)
		{
			bt2.setBackground(Color.decode("#2E75B6"));
			bt2.setForeground(Color.WHITE);
		}
		if (me.getSource() == bt3)
		{
			bt3.setBackground(Color.decode("#2E75B6"));
			bt3.setForeground(Color.WHITE);
		}
		if (me.getSource() == bt4)
		{
			bt4.setBackground(Color.decode("#2E75B6"));
			bt4.setForeground(Color.WHITE);
		}
		if (me.getSource() == bt5)
		{
			bt5.setBackground(Color.decode("#2E75B6"));
			bt5.setForeground(Color.WHITE);
		}
		if (me.getSource() == bt6)
		{
			bt6.setBackground(Color.decode("#2E75B6"));
			bt6.setForeground(Color.WHITE);
		}
	}

    public void mousePressed(MouseEvent me) {}

    public void mouseReleased(MouseEvent me) 
	{
		if (me.getSource() == bt1)
		{
			bt1.setBackground(Color.GREEN);
			bt1.setForeground(Color.BLACK);
		}
	}
	
	
	
	
	public void actionPerformed(ActionEvent me)
	{
		
		if(me.getSource() == bt1) 
		{
			Cardio obj1 = new Cardio(); 
			obj1.setVisible(true);
			this.setVisible(false);
		}
		if(me.getSource() == bt2) 
		{
			Gynecology obj1 = new Gynecology(); 
			obj1.setVisible(true);
			this.setVisible(false);
		}
		if(me.getSource() == bt3) 
		{
			Orthopedics obj1 = new Orthopedics(); 
			obj1.setVisible(true);
			this.setVisible(false);
		}
		if(me.getSource() == bt4) 
		{
			Dentist obj1 = new Dentist(); 
			obj1.setVisible(true);
			this.setVisible(false);
		}
		if(me.getSource() == bt5) 
		{
			Opthalmology obj1 = new Opthalmology(); 
			obj1.setVisible(true);
			this.setVisible(false);
		}
		if(me.getSource() == bt6) 
		{
			Surgeon obj1 = new Surgeon(); 
			obj1.setVisible(true);
			this.setVisible(false);
		}
		if(me.getSource() == bt8) //exit
		{
			System.exit(0);
		}
		if(me.getSource() == bt7) //back
		{
			PatientHome obj1 = new PatientHome();
			obj1.setVisible(true);
			this.setVisible(false);
		}
	
	}
}
