import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dentist extends JFrame implements ActionListener {
    private JPanel panel;
    private JLabel label1, label2, label3, label4, label5, label6, label7, lb4;
    private JButton bt1, bt2;
    private JRadioButton rd1, rd2;
    private Font f1, f2;
    private ButtonGroup bg;
    private ImageIcon ic,icon;
    private int selectedFee = 0;

    public Dentist() {
        super("Hospital Management System");
        super.setBounds(480, 180, 1000, 600);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setResizable(false);
        panel = new JPanel();
        panel.setLayout(null);

        // Title
        label1 = new JLabel("Doctor's List");
        label1.setBounds(420, 10, 700, 100);
        f1 = new Font("Segoe", Font.PLAIN, 35);
        label1.setFont(f1);
        panel.add(label1);

		icon = new ImageIcon(getClass().getResource(".\\images\\hospital.png"));
        this.setIconImage(icon.getImage());;
		
		
        // First Doctor
        rd1 = new JRadioButton("Name : Dr. M. Ashraf Ali");
        rd1.setBounds(100, 130, 500, 100);
        f2 = new Font("Segoe", Font.PLAIN, 25);
        rd1.setFont(f2);
        rd1.setOpaque(false);
        panel.add(rd1);

        label2 = new JLabel("Specialization : Dentistry");
        label2.setBounds(120, 190, 700, 100);
        label2.setFont(f2);
        panel.add(label2);

        label3 = new JLabel("Time : 7 PM");
        label3.setBounds(120, 250, 700, 100);
        label3.setFont(f2);
        panel.add(label3);

        label4 = new JLabel("Consultation fees : 1300 BDT");
        label4.setBounds(120, 310, 700, 100);
        label4.setFont(f2);
        panel.add(label4);

        // Second Doctor
        rd2 = new JRadioButton("Name : Dr. Romeo Tanbin");
        rd2.setBounds(600, 130, 700, 100);
        rd2.setFont(f2);
        rd2.setOpaque(false);
        panel.add(rd2);

        label5 = new JLabel("Specialization : Dentistry");
        label5.setBounds(620, 190, 700, 100);
        label5.setFont(f2);
        panel.add(label5);

        label6 = new JLabel("Time : 9 PM");
        label6.setBounds(620, 250, 700, 100);
        label6.setFont(f2);
        panel.add(label6);

        label7 = new JLabel("Consultation fees : 900 BDT");
        label7.setBounds(620, 310, 700, 100);
        label7.setFont(f2);
        panel.add(label7);

        // Button Group
        bg = new ButtonGroup();
        bg.add(rd1);
        bg.add(rd2);

        // Get Appointment Button
        bt1 = new JButton("Get Appointment");
        bt1.setBounds(220, 470, 230, 50);
        bt1.setFont(f2);
        bt1.setBackground(Color.decode("#2E75B6"));
        bt1.setOpaque(true);
        bt1.setForeground(Color.WHITE);
        bt1.addActionListener(this);
        panel.add(bt1);

        // Back Button
        bt2 = new JButton("Back");
        bt2.setBounds(530, 470, 230, 50);
        bt2.setFont(f2);
        bt2.setBackground(Color.decode("#C00000"));
        bt2.setOpaque(true);
        bt2.setForeground(Color.WHITE);
        bt2.addActionListener(this);
        panel.add(bt2);

        // Background Image
        ic = new ImageIcon(".\\images\\bg1.jpg");
        lb4 = new JLabel(ic);
        lb4.setBounds(0, 0, 1000, 600);
        lb4.setOpaque(true);
        panel.add(lb4);

        super.add(panel);
    }

    public void actionPerformed(ActionEvent me) {
        // Get Appointment Logic
        if (me.getSource() == bt1) {
            String selectedDoctor = null;

            if (rd1.isSelected()) {
                selectedDoctor = "Dr. M. Ashraf Ali";
                selectedFee = 1300;
            } else if (rd2.isSelected()) {
                selectedDoctor = "Dr. Romeo Tanbin";
                selectedFee = 900;
            }

            if (selectedDoctor == null) {
                JOptionPane.showMessageDialog(this, "Please select a doctor.");
            } else {
                JOptionPane.showMessageDialog(this,
                        "Your appointment with " + selectedDoctor + " has a fee of: " + selectedFee + " BDT.\n"
                                + "To complete the procedure, please make your payment first!",
                        "Appointment Confirmation",
                        JOptionPane.INFORMATION_MESSAGE);
						Payment obj2 = new Payment();
						obj2.setVisible(true);
						this.setVisible(false);
            }
        }

        // Back Button Logic
        if (me.getSource() == bt2) {
            Default obj1 = new Default(); // Assuming Default is another screen
            obj1.setVisible(true);
            this.setVisible(false);
        }
    }
}
