import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PaymentBikash extends JFrame implements ActionListener
{
	private JPanel panel; 
	private JLabel label1,label2,label3;
	private Font font1,font2,font3,font4;
	private JTextField text1;
	private JPasswordField passfield1;
	private JButton button1,button2,button3;
	private ImageIcon icon;
	private Color color1,color2;
	
	public PaymentBikash()
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
		font1 = new Font("Segoe UI Black",Font.BOLD,50);
		font2 = new Font("Calibri Light",0,20);
		font3 = new Font("Segoe UI Black",Font.BOLD,22);
		font4 = new Font("Calibri Light",Font.BOLD,35);
		
		label1 = new JLabel("Enter Your Bikash Details");
		label1.setBounds(190,110,800,50);
		label1.setFont(font1);
		panel.add(label1);
		
		label2 = new JLabel("Number");
		label2.setBounds(280,215,200,50);
		label2.setFont(font4);
		panel.add(label2);
		
		label3 = new JLabel("Pin Code");
		label3.setBounds(280,280,200,50);
		label3.setFont(font4);
		panel.add(label3);
		
		text1 = new JTextField();
		text1.setBounds(465,220,320,43);
		text1.setFont(font2);
		panel.add(text1);
		
		passfield1 = new JPasswordField();
		passfield1.setBounds(465,280,320,43);
		passfield1.setFont(font3);
		passfield1.setEchoChar('*');
		panel.add(passfield1);
		
		button1 = new JButton("Exit");
		button1.setBounds(180,490,210,40);
		color1 = new Color(192,0,0);
		button1.setFont(font3);
		button1.setBackground(color1);
		button1.setForeground(Color.WHITE);
		button1.addActionListener(this);
		panel.add(button1);
		
		button2 = new JButton("Confirm");
		button2.setBounds(690,490,210,40);
		color2 = new Color(46,117,182);
		button2.setFont(font3);
		button2.setBackground(color2);
		button2.setForeground(Color.WHITE);
		button2.addActionListener(this);
		panel.add(button2);
		
		button3 = new JButton("Back");
		button3.setBounds(435,490,210,40);
		color2 = new Color(46,117,182);
		button3.setFont(font3);
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
			String number = text1.getText();
			String pin = passfield1.getText();
			
			if(number.isEmpty() || pin.isEmpty())
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