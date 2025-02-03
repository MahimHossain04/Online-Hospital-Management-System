import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PaymentCard extends JFrame implements ActionListener
{
	private JPanel panel; 
	private JLabel label1,label2,label3,label4,label5;
	private Font font1,font2,font3,font4;
	private JTextField text1,text2,text3;
	private JPasswordField passfield1;
	private JButton button1,button2,button3;
	private ImageIcon icon;
	private Color color1,color2;
	
	public PaymentCard()
	{
		super("Hospital Management System");
		super.setBounds(400,100,1110,700);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setResizable(false);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		
		icon = new ImageIcon(getClass().getResource(".\\images\\hospital.png"));
        this.setIconImage(icon.getImage());;
		
		//Fonts
		font1 = new Font("Segoe UI Black",Font.PLAIN,50);
		font2 = new Font("Calibri Light",Font.BOLD,30);
		font3 = new Font("Calibri Light",0,20);
		font4 = new Font("Segoe UI Black",Font.BOLD,22);
		
		label1 = new JLabel("Enter Your Credit Card Details");
		label1.setBounds(190,110,800,80);
		label1.setFont(font1);
		panel.add(label1);
		
		label2 = new JLabel("Name On Card");
		label2.setBounds(285,190,800,80);
		label2.setFont(font2);
		panel.add(label2);
		
		label3 = new JLabel("Card Number");
		label3.setBounds(285,235,800,80);
		label3.setFont(font2);
		panel.add(label3);
		
		label4 = new JLabel("Expiry Date");
		label4.setBounds(285,280,800,80);
		label4.setFont(font2);
		panel.add(label4);
		
		label5 = new JLabel("CVC Code");
		label5.setBounds(285,325,800,80);
		label5.setFont(font2);
		panel.add(label5);
		
		text1 = new JTextField();
		text1.setBounds(505,212,260,33);
		text1.setFont(font3);
		panel.add(text1);
		
		text2 = new JTextField();
		text2.setBounds(505,258,260,33);
		text2.setFont(font3);
		panel.add(text2);
		
		text3 = new JTextField();
		text3.setBounds(505,303,260,33);
		text3.setFont(font3);
		panel.add(text3);
		
		passfield1 = new JPasswordField();
		passfield1.setBounds(505,348,260,33);
		passfield1.setFont(font4);
		passfield1.setEchoChar('*');
		panel.add(passfield1);
		
		//Colors
		color1 = new Color(192,0,0);
		color2 = new Color(46,117,182);
		
		button1 = new JButton("Exit");
		button1.setBounds(180,490,210,40);
		button1.setFont(font4);
		button1.setBackground(color1);
		button1.setForeground(Color.WHITE);
		button1.addActionListener(this);
		panel.add(button1);
		
		button2 = new JButton("Confirm");
		button2.setBounds(690,490,210,40);
		button2.setFont(font4);
		button2.setBackground(color2);
		button2.setForeground(Color.WHITE);
		button2.addActionListener(this);
		panel.add(button2);
		
		button3 = new JButton("Back");
		button3.setBounds(435,490,210,40);
		button3.setFont(font4);
		button3.setBackground(color2);
		button3.setForeground(Color.WHITE);
		button3.addActionListener(this);
		panel.add(button3);
		
		super.add(panel);
	}
	public void actionPerformed(ActionEvent me)
	{
		if(me.getSource() == button1) 
		{
			System.exit(0);
		}
		if(me.getSource() == button3)
		{
			Payment obj1 = new Payment();
			obj1.setVisible(true);
			this.setVisible(false);
		}
		if(me.getSource() == button2) 
		{
			String name,number,expire,cvc;
			
			name = text1.getText();
			number = text2.getText();
			expire = text3.getText();
			cvc = passfield1.getText();
			
			if(name.isEmpty() || number.isEmpty() || expire.isEmpty() || cvc.isEmpty())
			{
				JOptionPane.showMessageDialog(this,"Please fill up all the information");
			}
			else
			{
				PaymentSuccess obj1 = new PaymentSuccess();
				obj1.setVisible(true);
				this.setVisible(false);
			}
			
		}
	}
}