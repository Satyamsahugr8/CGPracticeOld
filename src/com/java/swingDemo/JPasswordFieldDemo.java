package com.java.swingDemo;

import java.awt.FlowLayout;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;

public class JPasswordFieldDemo {
	public JPasswordFieldDemo() {
		
		JFrame frame = new JFrame();

		// JPasswordField

		//1
		JPasswordField passwordField = new JPasswordField(20);
//		passwordField.setText("SaTyaM");
		//2
		JPasswordField passwordField2 = new JPasswordField("Enter password");
		//3
		JPasswordField passwordField3 = new JPasswordField("Enter Password", 20);
//		passwordField.setText("secret");

		//4
		JButton buttonPass = new JButton("passCheck");
		passwordField.selectAll();
		passwordField.setEchoChar('*');

		buttonPass.addActionListener(e -> {
			char[] password = passwordField.getPassword();
			char[] correctPass = new char[] { 's', 'e', 'c', 'r', 'e', 't' };

			if (password.length < 8) {
				System.out.println("Password must contain at least 8 characters!");
		    }
			if (Arrays.equals(password, correctPass)) {
				System.out.println("Password is correct");
			} else {
				System.out.println("Incorrect password");
			}
		});

		// Adding Components

		//1,2,3,4
		frame.add(passwordField);
		frame.add(buttonPass);
		frame.add(passwordField2);
		frame.add(passwordField3);
		
		frame.setLayout(new FlowLayout());
		frame.setSize(300, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new JPasswordFieldDemo();
	}

}
