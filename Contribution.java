import javax.swing.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;

public class Contribution extends JFrame implements MouseListener, ActionListener
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
	
	public Contribution(){
		super("Hospital Management System");
        super.setBounds(700, 120, 520, 750);
		super.setResizable(false);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
        panel.setLayout(null);
		//c5 = new Color(110, 210, 90); //(R, G, B)
		//panel.setBackground(c5);
		icon = new ImageIcon(getClass().getResource(".\\images\\hospital.png"));
        this.setIconImage(icon.getImage());;
		
		ic = new ImageIcon (".\\images\\contribution.png");
		label2 = new JLabel(ic);
		label2.setBounds(0,0,500,620); 
		label2.setOpaque(true);
		panel.add(label2);
		
		jb1 = new JButton("OK");
        jb1.setBounds(100, 640, 300, 40);
		jb1.addMouseListener(this);
		jb1.addActionListener(this);
		f1 = new Font("Segoe UI", Font.BOLD , 25);
        jb1.setFont(f1);
		panel.add(jb1);
		c1 = new Color (30,115,205);
        jb1.setBackground(c1);
        jb1.setOpaque(true);
        jb1.setForeground(Color.WHITE);
		
		
		super.add(panel);
	}
	
	public void mouseEntered(MouseEvent me) 
	{
		if (me.getSource() == jb1)
		{
			jb1.setBackground(Color.RED);
			jb1.setForeground(Color.WHITE);
		}
	}
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me) {}
	public void mouseReleased(MouseEvent me) {}
	 public void mouseExited(MouseEvent me) 
	 {
		 if (me.getSource() == jb1)
		{
			jb1.setBackground(c1);
			jb1.setForeground(Color.WHITE);
		}
		else {}
	 }
	public void actionPerformed(ActionEvent me)
	{
		if(me.getSource() == jb1)
		{
			Welcome obj1 = new Welcome();
			obj1.setVisible(true);
			this.setVisible(false);
		}
	}
	}