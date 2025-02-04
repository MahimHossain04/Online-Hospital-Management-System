import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class PatientHome extends JFrame implements MouseListener, ActionListener
{
	private JPanel panel;
	private JLabel label1,label2,label3,label4;
	private ImageIcon ic,ic1,icon;
	private Color c1,c2,c3,c4;
	private JRadioButton rd1,rd2;
	private ButtonGroup bg1;
	private JButton bt1,bt2,bt3;
	private Font f1, f2, f3, f4, f5, f6;
	private int pack = 0;

	public PatientHome()
	{
		super("Hospital Management System");
		super.setBounds(530,170,900,600);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setResizable(false);
		panel = new JPanel();
		panel.setLayout(null);
		
		icon = new ImageIcon(getClass().getResource(".\\images\\hospital.png"));
        this.setIconImage(icon.getImage());;
		
		// Fonts
        f1 = new Font("Segoe UI Black", Font.PLAIN, 35);
        f2 = new Font("Segoe UI Black", Font.PLAIN, 20);
        f3 = new Font("Segoe UI Semibold", Font.BOLD, 45);
        f4 = new Font("Segoe UI", Font.PLAIN, 25);
        f5 = new Font("Segoe UI", Font.PLAIN, 19);
        f6 = new Font("Segoe UI", Font.PLAIN, 25);
		
		label1 = new JLabel("Health Plan Options");
		label1.setBounds(440, 60, 700, 200);
		
		label1.setFont(f3);
		panel.add(label1);
		
		ic = new ImageIcon(".\\images\\PatientHome.png");
		label3 = new JLabel(ic);
		label3.setBounds(25,20,375,500);
		panel.add(label3);
		
		rd1 = new JRadioButton("Recommended Set");
		rd1.setBounds(450,250,300,30);
		
		rd1.setFont(f4);
		rd1.addActionListener(this);
		panel.add(rd1);
		
		rd2 = new JRadioButton("Personalized Choice");
		rd2.setBounds(450,310,300,30);
		
		rd2.setFont(f4);
		rd2.addActionListener(this);
		panel.add(rd2);
		
		bg1 = new ButtonGroup();
		bg1.add(rd1);
		bg1.add(rd2);
		
		rd1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pack = 1; // Default packs selected
            }
        });

        rd2.addActionListener(new ActionListener() 
		{
            public void actionPerformed(ActionEvent e) 
			{
                pack = 2; // Self-chosen packs selected
            }
        });
		
		bt1 = new JButton("Exit");
		bt1.setBounds(640,475,180,50);
		
		bt1.setFont(f1);
		bt1.setBackground(Color.decode("#2E75B6"));
		bt1.setOpaque(true);
		bt1.setForeground(Color.WHITE);
		bt1.addMouseListener(this);
		bt1.addActionListener(this);
		panel.add(bt1);
		
		bt2 = new JButton("Back");
		bt2.setBounds(440,475,180,50);
		
		bt2.setFont(f1);
		bt2.setBackground(Color.decode("#2E75B6"));
		bt2.setOpaque(true);
		bt2.addMouseListener(this);
		bt2.addActionListener(this);
		bt2.setForeground(Color.WHITE);
		panel.add(bt2);
		
		bt3 = new JButton("Next");
		bt3.setBounds(440,410,380,50);
		bt3.setFont(f1);
		bt3.setBackground(Color.decode("#2E75B6"));
		bt3.setOpaque(true);
		bt3.setForeground(Color.WHITE);
		bt3.addActionListener(this);
		panel.add(bt3);
		
		
		
		ic1= new ImageIcon(".\\images\\bgPatientHome.jpg");
		label4= new JLabel (ic1);
		label4.setBounds(0,0,900,600);
		panel.add(label4);
		
		
		super.add(panel);
	}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource() == bt1)
		{
			bt1.setBackground(Color.decode("#C00000"));
			bt1.setForeground(Color.WHITE);
		}
		else 
		{
			
		}
		
		if(me.getSource() == bt2)
		{
			bt2.setBackground(Color.decode("#C00000"));
			bt2.setForeground(Color.WHITE);
		}
		else 
		{
			
		}
	}
	
	public void mouseExited(MouseEvent me) 
	{
		if(me.getSource() == bt1)
		{
			bt1.setBackground(Color.decode("#2E75B6"));
			bt1.setForeground(Color.WHITE);
		}
		else 
		{
			
		}
		if(me.getSource() == bt2)
		{
			bt2.setBackground(Color.decode("#2E75B6"));
			bt2.setForeground(Color.WHITE);
		}
		else 
		{
			
		}
	}
		public void mouseClicked(MouseEvent me)
		{
		}
		public void mousePressed(MouseEvent me) 
		{
		}
		public void mouseReleased(MouseEvent me)
		{
		}

	public void actionPerformed(ActionEvent me) {
    if (me.getSource() == bt1) {
        System.exit(0);
    }
	if (me.getSource() == bt2)
	{
		Hospital obj3 = new Hospital(); 
		obj3.setVisible(true);
		this.setVisible(false);
	}
    if (me.getSource() == bt3) { // next button
        if (pack == 2) {
            SelfPack obj1 = new SelfPack();
            obj1.setVisible(true);
            this.setVisible(false);
        } else if (pack == 1) {
			Default obj2 = new Default();
			obj2.setVisible(true);
            this.setVisible(false);
		
        } else {
            JOptionPane.showMessageDialog(this, "Please select a package type!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }
}

	
		
	
}
		
		