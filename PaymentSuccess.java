import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class PaymentSuccess extends JFrame implements ActionListener
{
	private JPanel panel; 
	private JLabel label1,label2,label3;
	private ImageIcon icon, image1;
	private Font font1,font2;
	private JButton button1;
	private Color color1;
	
	
	public PaymentSuccess()
	{
		super ("Online Hospital Management");
		super.setBounds(400,100,1110,700);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setResizable(false);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		
		image1 = new ImageIcon(".\\images\\Appoinment.png");
		label1 = new JLabel(image1);
		label1.setBounds(220,5,620,400);
		panel.add(label1);
		
		icon = new ImageIcon(getClass().getResource(".\\images\\hospital.png"));
        this.setIconImage(icon.getImage());;
		
		//Fonts
		font1 = new Font("Segoe UI",Font.PLAIN,40);
		font2 = new Font("Segoe UI Black",Font.PLAIN,22);
		
		label2 = new JLabel("You have booked your appoinment successfully ! ");
		label2.setBounds(115,410,900,80);
		label2.setFont(font1);
		panel.add(label2);
		
		label3 = new JLabel("Hope you will have a nice experience with us. ");
		label3.setBounds(142,460,900,80);
		label3.setFont(font1);
		panel.add(label3);
		
		button1 = new JButton("Exit");
		button1.setBounds(440,570,210,40);
		color1 = new Color(192,0,0);
		button1.setFont(font2);
		button1.setBackground(color1);
		button1.setForeground(Color.WHITE);
		button1.addActionListener(this);
		panel.add(button1);
		
		super.add(panel);
	}
	public void actionPerformed(ActionEvent me)
	{
		if(me.getSource() == button1) 
		{
			System.exit(0);
		}
	}
}