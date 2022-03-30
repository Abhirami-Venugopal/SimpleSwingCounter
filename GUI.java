package firstGUI;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener {
	
	private int count = 0;
	private JLabel label;
	private JFrame frame;
	private JPanel panel;
	
	public GUI() {
		JFrame frame = new JFrame(); 
		
		JButton button = new JButton("Click me");
		button.addActionListener(this);
		
		label = new JLabel("Number of clicks: " );
		
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30)); //top, bottom, left, right
		panel.setLayout(new GridLayout(0, 1));//rows, columns
		panel.add(button);
		panel.add(label);
		
		frame.add(panel, BorderLayout.CENTER); // add the panel to the frame 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set what happens when they close the frame
		frame.setTitle("Our GUI"); // set the title
		frame.pack(); // set the window to match a certain size 
		frame.setVisible(true); // set window to be visible and in focus
		 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GUI(); //create a GUI object 
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		count++;
		label.setText("Numeber of clicks: " + count);
	}

}
