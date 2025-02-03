import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gynecology extends JFrame implements ActionListener {
    private JPanel panel;
    private JLabel label1, label2, label3, label4, label5, label6, label7, lb4;
    private JRadioButton rd1, rd2;
    private Font f1, f2;
    private ButtonGroup bg;
    private JButton bt1, bt2;
    private ImageIcon ic,icon;
    private int selectedFee = 0;

    public Gynecology() {
        super("Hospital Management System");
        super.setBounds(480, 180, 1000, 600);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new JPanel();
		super.setResizable(false);
        panel.setLayout(null);

        // Doctor's List Title
        label1 = new JLabel("Doctor's List");
        label1.setBounds(420, 10, 700, 100);
        f1 = new Font("Segoe", Font.PLAIN, 35);
        label1.setFont(f1);
        panel.add(label1);
		
		icon = new ImageIcon(getClass().getResource(".\\images\\hospital.png"));
        this.setIconImage(icon.getImage());;

        // First Doctor (Prof. Dr. Muna Shalima Jahan)
        rd1 = new JRadioButton("Name : Prof. Dr. Muna Shalima Jahan");
        rd1.setBounds(80, 130, 500, 100);
        f2 = new Font("Segoe", Font.PLAIN, 25);
        rd1.setOpaque(false);
        rd1.setFont(f2);
        panel.add(rd1);

        label2 = new JLabel("Specialization : Gynecology");
        label2.setBounds(100, 190, 700, 100);
        label2.setFont(f2);
        panel.add(label2);

        label3 = new JLabel("Time : 12 PM");
        label3.setBounds(100, 250, 700, 100);
        label3.setFont(f2);
        panel.add(label3);

        label4 = new JLabel("Consultation fees : 1500 BDT");
        label4.setBounds(100, 310, 700, 100);
        label4.setFont(f2);
        panel.add(label4);

        // Second Doctor (Dr. Samira Zaman)
        rd2 = new JRadioButton("Name : Dr. Samira Zaman");
        rd2.setBounds(600, 130, 700, 100);
        rd2.setOpaque(false);
        rd2.setFont(f2);
        panel.add(rd2);

        label5 = new JLabel("Specialization : Gynecology");
        label5.setBounds(620, 190, 700, 100);
        label5.setFont(f2);
        panel.add(label5);

        label6 = new JLabel("Time : 3 PM");
        label6.setBounds(620, 250, 700, 100);
        label6.setFont(f2);
        panel.add(label6);

        label7 = new JLabel("Consultation fees : 1200 BDT");
        label7.setBounds(620, 310, 700, 100);
        label7.setFont(f2);
        panel.add(label7);

        // Button Group to select one doctor at a time
        bg = new ButtonGroup();
        bg.add(rd1);
        bg.add(rd2);

        // Get Appointment Button
        bt1 = new JButton("Get Appointment");
        bt1.setBounds(200, 470, 270, 50);
        bt1.setFont(f2);
        bt1.setBackground(Color.decode("#2E75B6"));
        bt1.setOpaque(true);
        bt1.setForeground(Color.WHITE);
        bt1.addActionListener(this);
        panel.add(bt1);

        // Exit Button
        bt2 = new JButton("Back");
        bt2.setBounds(500, 470, 270, 50);
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
        if (me.getSource() == bt1) {
            String selectedDoctor = null;

            if (rd1.isSelected()) {
                selectedDoctor = "Prof. Dr. Muna Shalima Jahan";
                selectedFee = 1500;
            } else if (rd2.isSelected()) {
                selectedDoctor = "Dr. Samira Zaman";
                selectedFee = 1200;
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

        if (me.getSource() == bt2) {
            Default obj1 = new Default();
            obj1.setVisible(true);
            this.setVisible(false);
        }
    }

}
