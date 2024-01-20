package com.java.swingDemo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

public class JPanelDemo {

	// JPanel
	public JPanelDemo() {
		
		JFrame frame = new JFrame();
		
		// NOT RECOMMENDED
//		JPanel newPanel = new JPanel(); // a FlowLayout manager is created by default
//		newPanel.setLayout(new GridBagLayout());
		
		// RECOMMENED jpanel along with the layout
		JPanel newPanel = new JPanel(new GridBagLayout());
		
		
		// Use the add(Component) method for the following layout managers: 
		// FlowLayout, BoxLayout, GridLayout, or SpringLayout. For example:
//		JLabel label = new JLabel("Enter username:");
//		JTextField userName = new JTextField(20);
//		newPanel.add(label);
//		newPanel.add(userName);
			 
			
		// Use the add(Component comp, Object constraints) method for the following layout managers:
		// BorderLayout, CardLayout or GridBagLayout. For example:
		
//		JPanel newPanel = new JPanel(new BorderLayout());
		
		JLabel label = new JLabel("Enter username:");
		JTextField userName = new JTextField(20);
		
		JLabel labelPass = new JLabel("Enter password:");
		JPasswordField pass = new JPasswordField(20);

		JButton b = new JButton("Login");
		
		
		
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.anchor = GridBagConstraints.WEST;
		constraints.insets = new Insets(10, 10, 10, 10);
		constraints.gridx = 0;
		constraints.gridy = 0;
		newPanel.add(label, constraints);
		
		constraints.gridx = 1;
		constraints.gridy = 0;
		newPanel.add(userName, constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 1;
		newPanel.add(labelPass, constraints);
		
		
		constraints.gridx = 1;
		constraints.gridy = 1;
		newPanel.add(pass, constraints);
		
		constraints.gridx = 1;
		constraints.gridy = 2;
		newPanel.add(b, constraints);
		
		
		
		
		
		
			 
//		newPanel.add(label, BorderLayout.NORTH);
//		newPanel.add(userName, BorderLayout.SOUTH);
		
//		newPanel.add(label);
//		newPanel.add(userName);
		
		
		
		
		
		
		newPanel.setBackground(Color.CYAN);
		newPanel.setOpaque(false);  // make transparent background
		
		newPanel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		
		newPanel.setBorder(BorderFactory.createEtchedBorder());
		
		newPanel.setBorder(BorderFactory.createLineBorder(Color.RED));
		
		newPanel.setBorder(BorderFactory.createTitledBorder(
		        BorderFactory.createEtchedBorder(), "Login Panel"));




		frame.add(newPanel);

		frame.pack();
		frame.setLayout(new FlowLayout());
//		frame.setSize(400, 400);
//		frame.setBounds(400, 200, 600, 400);
		frame.setLocation(300, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		new JPanelDemo();
		
	}

}
