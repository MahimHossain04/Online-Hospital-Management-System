import javax.swing.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;

public class Welcome extends JFrame implements MouseListener, ActionListener
{
	private JPanel panel;
	private ImageIcon ic,ic1;
	private JLabel label1,label2,label3;
	private JButton jb1,jb2,jb3,jb4;
	private Color c1,c2,c3,c4,c5;
	private Font f1,f2,f3,f4,f5;
	private ImageIcon icon;
	
	public Welcome()
	{
		super("Hospital Management System");
        super.setBounds(630, 300, 700, 450);
		super.setResizable(false);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        panel = new JPanel();
        panel.setLayout(null);
		
		
		icon = new ImageIcon(getClass().getResource(".\\images\\hospital.png"));
        this.setIconImage(icon.getImage());;
		
		ic = new ImageIcon(".\\images\\welcome1.png");
		label1 = new JLabel(ic);
		label1.setBounds(60,0,552,375); 
		panel.add(label1);
		
		
		
		//Buttons
		jb1 = new JButton("Exit");
        jb1.setBounds(50, 310, 150, 50);
		jb1.addMouseListener(this);
		jb1.addActionListener(this);
		f1 = new Font("Cambria", Font.BOLD , 25);
        jb1.setFont(f1);
        
        jb1.setBackground(Color.decode("#2E75B6"));
		jb1.setForeground(Color.WHITE);
        jb1.setOpaque(true);
		panel.add(jb1);
        

        jb2 = new JButton("Contribution");
        jb2.setBounds(235, 310, 200, 50);
		jb2.addActionListener(this);
		jb2.addMouseListener(this);
		f2 = new Font("Cambria", Font.BOLD , 25);
        jb2.setFont(f2);
		
        jb2.setBackground(Color.decode("#2E75B6"));
        jb2.setForeground(Color.WHITE);
		jb2.setOpaque(true);
        panel.add(jb2);
		
		
		jb3 = new JButton("Next");
        jb3.setBounds(470, 310, 150, 50);
		jb3.addMouseListener(this);
		jb3.addActionListener(this);
		f3 = new Font("Cambria", Font.BOLD , 25);
        jb3.setFont(f3);
		jb3.setOpaque(true);
		panel.add(jb3);

        jb3.setBackground(Color.decode("#2E75B6"));
        jb3.setForeground(Color.WHITE);
		
		
		ic1 = new ImageIcon(".\\images\\bg.jpg");
		label3 = new JLabel(ic1);
		label3.setBounds(0,0,750,450); 
		label3.setOpaque(true);
		panel.add(label3);
		
		
		super.add(panel);
	}
	public void mouseClicked(MouseEvent me){ }
	public void mouseEntered(MouseEvent me) 
	{
		if (me.getSource() == jb1)
		{
			jb1.setBackground(Color.RED);
			jb1.setForeground(Color.WHITE);
		}
		if (me.getSource() == jb2)
		{
			jb2.setBackground(Color.decode("#21C75E"));
			jb2.setForeground(Color.WHITE);
		}
		if (me.getSource() == jb3)
		{
			jb3.setBackground(Color.decode("#E55F1C"));
			jb3.setForeground(Color.WHITE);
		}
	}

    public void mouseExited(MouseEvent me) 
	{
		if (me.getSource() == jb1)
		{
			jb1.setBackground(Color.decode("#2E75B6"));
			jb1.setForeground(Color.WHITE);
		}
		if (me.getSource() == jb2)
		{
			jb2.setBackground(Color.decode("#2E75B6"));
			jb2.setForeground(Color.WHITE);
		}
		if (me.getSource() == jb3)
		{
			jb3.setBackground(Color.decode("#2E75B6"));
			jb3.setForeground(Color.WHITE);
		}
		else {}
	}

    public void mousePressed(MouseEvent me) {}

    public void mouseReleased(MouseEvent me) 
	{
		if (me.getSource() == jb3)
		{
			jb3.setBackground(Color.GREEN);
			jb3.setForeground(Color.BLACK);
		}
	}
	
	public void actionPerformed (ActionEvent me)
	{
		if(me.getSource()==jb1)
		{
			System.exit(0);
		}
		if (me.getSource()== jb3)
		{
			Hospital obj1 = new Hospital();
			obj1.setVisible(true);
			this.setVisible(false);
		}
		if (me.getSource()== jb2)
		{
			Contribution obj1 = new Contribution();
			obj1.setVisible(true);
			this.setVisible(false);
		}
	}
	
}
