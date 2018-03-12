import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

public class ClockGui extends JFrame {
	Chomusuke c;
	JPanel p1;
	JLabel hr, mn;
	JTextField hour, minute;
	JButton b1;

	public ClockGui() {
		super("Chomusuke");
		this.setSize(604, 750);

		initComp();
		addComp();

		c.repaint();
		this.setVisible(true);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public void initComp() {
		p1 = new JPanel();
		c = new Chomusuke();
		hr = new JLabel("Time: ");
		mn = new JLabel(": ");
		hour = new JTextField(2);
		minute = new JTextField(2);
		b1 = new JButton("Go");
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					int h = Integer.parseInt(hour.getText());
					int m = Integer.parseInt(minute.getText());
					if (m > 60 | m < 0 | h > 24 | h < 0)
						throw new NumberFormatException();
					c.setHours(h);
					c.setMinutes(m);
					c.repaint();
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Invalid input");
				}

			}
		});
	}

	public void addComp() {
		this.setLayout(new BorderLayout());
		this.setResizable(false);
		p1.setLayout(new FlowLayout());
		this.add(c, BorderLayout.CENTER);
		this.add(p1, BorderLayout.NORTH);
		p1.setBackground(Color.lightGray);
		p1.add(hr);
		p1.add(hour);
		p1.add(mn);
		p1.add(minute);
		p1.add(b1);
	}

	public static void main(String[] args) {
		new ClockGui();

	}

}
