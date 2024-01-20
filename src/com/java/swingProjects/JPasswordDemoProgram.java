package com.java.swingProjects;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class JPasswordDemoProgram {

	public JPasswordDemoProgram() {
		
		JFrame frame = new JFrame("Swing JPasswordField Demo Program");
		
		JLabel label1 = new JLabel("Enter Password");
		JPasswordField passwordField = new JPasswordField(20);
		
		JLabel label2 = new JLabel("Confirm Password");
		JPasswordField passwordField2 = new JPasswordField(20);
		
		JButton button = new JButton("OK");
		
		
		
		frame.setLayout(new GridBagLayout());

		// adding into frame
		
		GridBagConstraints g = new GridBagConstraints();
//		g.fill = GridBagConstraints.HORIZONTAL;
		g.anchor = GridBagConstraints.WEST;
		g.insets = new Insets(10, 10, 10, 10);
		
		g.gridx = 0;
		g.gridy = 0;
		frame.add(label1, g);
		
		g.gridx = 1;
		g.gridy = 0;
		frame.add(passwordField, g);
		
		g.gridx = 0;
		g.gridy = 1;
		frame.add(label2, g);
		
		g.gridx = 1;
		g.gridy = 1;
		frame.add(passwordField2, g);
		
		g.gridx = 1;
		g.gridy = 2;
		frame.add(button, g);
		
		
		





		
//		frame.setSize(300, 400);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);





	}
	
	public static void main(String[] args) {
		new JPasswordDemoProgram();
	}
	
	
	
	
	
	
}
