package com.java.swingDemo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class JLabelDemo {

	public JLabelDemo() {
		JFrame frame = new JFrame();
		
		JLabel label = new JLabel("L1This is a basic label");
		JLabel label2 = new JLabel(new ImageIcon("C:\\Users\\SATYASAH\\Downloads\\attention.jpg"));
		
		// Create a label with both text and icon and horizontal alignment is center:
		JLabel label3 = new JLabel("L3A label with icon and text",
		        new ImageIcon("C:\\Users\\SATYASAH\\Downloads\\attention.jpg"),
		        SwingConstants.CENTER);
		
		// In this case, we can set the gap between the icon and the text as follows:
		label2.setIconTextGap(10);
		
		JLabel label4 = new JLabel("L4Enter first name:", SwingConstants.RIGHT);
		 
		JLabel label5 = new JLabel(new ImageIcon("C:\\\\Users\\\\SATYASAH\\\\Downloads\\\\attention.jpg"),
		                            SwingConstants.LEFT);
		
		
		// Customizing JLabel’s appearance
		// Change font style, background color and foreground color of the label:
	
		label.setFont(new java.awt.Font("Arial", Font.ITALIC, 16));
		label.setOpaque(true);
		label.setBackground(Color.WHITE);
		label.setForeground(Color.BLUE);
		
		
//		label4.setText("<html><font color=red size=4><b>WARNING!</b></html>");
		
		JLabel label6 = new JLabel("<html><i>This label has <br>two lines</i><html>");
		
		
		JTextField textEmail = new JTextField(20);
		 
		JLabel label7 = new JLabel("L7Enter e-mail address:");
		label7.setLabelFor(textEmail);
		label7.setDisplayedMnemonic('E');

		frame.add(label);
		frame.add(label2);
		frame.add(label3);
		frame.add(label4);
		frame.add(label5);
		frame.add(label6);
		frame.add(label7);
		frame.add(textEmail);
		
		
		
		
		

		frame.setLayout(new GridBagLayout());
//		frame.setSize(300, 400);
		frame.pack();
		frame.setLocation(300,200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new JLabelDemo();
	}

}
