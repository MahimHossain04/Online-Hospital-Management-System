import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Payment extends JFrame implements ActionListener
{
	private JPanel panel; 
	private JLabel label1,label2,label3,label4,label5;
	private Font font1,font2,font3;
	private ImageIcon icon,image1,image2,image3;
	private JRadioButton radio1,radio2;
	private ButtonGroup bg1;
	private JButton button1,button2;
	private Color color1,color2;
	
	public Payment ()
	{
		super ("Online Hospital Management");
		super.setBounds(400,100,1110,700);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setResizable(false);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		
		icon = new ImageIcon(getClass().getResource(".\\images\\hospital.png"));
        this.setIconImage(icon.getImage());;
		
		font1 = new Font("Segoe UI Black",Font.BOLD,40);
		font2 = new Font("Calibri Light",Font.BOLD,35);
		font3 = new Font("Segoe UI Black",Font.BOLD,22);
		
		label1 = new JLabel("Complete Your Payment");
		label1.setBounds(500,100,650,80);
		label1.setFont(font1);
		panel.add(label1);
		
		label2 = new JLabel("Choose a Payment Method");
		label2.setBounds(550,190,600,40);
		label2.setFont(font2);
		panel.add(label2);
		
		radio1 = new JRadioButton("");
		radio1.setBounds(580,304,20,30);
		radio1.setBackground(Color.WHITE);
		panel.add(radio1);
		
		radio2 = new JRadioButton("");
		radio2.setBounds(833,300,20,30);
        radio2.setBackground(Color.WHITE);		
		panel.add(radio2);
		
		bg1 = new ButtonGroup();
		bg1.add(radio1);
		bg1.add(radio2);
		
		image1 = new ImageIcon(".\\images\\Bikash.png");
		label3 = new JLabel(image1);
		label3.setBounds(610,289,120,60);
		panel.add(label3);
		
		image2 = new ImageIcon(".\\images\\MasterCard.png");
		label4 = new JLabel(image2);
		label4.setBounds(850,282,120,70);
		panel.add(label4);
		
		button1 = new JButton("Exit");
		button1.setBounds(540,490,210,40);
		color1 = new Color(192,0,0);
		button1.setFont(font3);
		button1.setBackground(color1);
		button1.setForeground(Color.WHITE);
		button1.addActionListener(this);
		panel.add(button1);
		
		button2 = new JButton("Next");
		button2.setBounds(820,490,210,40);
		color2 = new Color(46,117,182);
		button2.setFont(font3);
		button2.setBackground(color2);
		button2.setForeground(Color.WHITE);
		button2.addActionListener(this);
		panel.add(button2);
		
		image3 = new ImageIcon(".\\images\\Payment.png");
		label5 = new JLabel(image3);
		label5.setBounds(40,100,420,420);
		panel.add(label5);
		
		
		super.add(panel);
	}
	public void actionPerformed(ActionEvent me)
	{
		if(me.getSource() == button2)
		{
			if(radio1.isSelected())
			{
				PaymentBikash obj1 = new PaymentBikash();
				obj1.setVisible(true);
				this.setVisible(false); 
			}
			else if (radio2.isSelected())
			{
				PaymentCard obj1 = new PaymentCard();
				obj1.setVisible(true);
				this.setVisible(false);
			}
			else
			{
				JOptionPane.showMessageDialog(this,"Choose a Method First");
			}
			
		}
		if(me.getSource() == button1) 
		{
			System.exit(0);
		}
	}
}