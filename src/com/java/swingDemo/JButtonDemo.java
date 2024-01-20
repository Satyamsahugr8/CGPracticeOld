package com.java.swingDemo;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class JButtonDemo {

	JFrame frame;
	JButton button;

	JButtonDemo() {

		JFrame frame = new JFrame();

		JTextField textField = new JTextField(20);

		JButton button = new JButton("Click me");

		JLabel label = new JLabel("Result:");
		JLabel label2 = new JLabel("___________");

//		button.setBounds(150, 100, 30, 20);
		button.setBounds(50, 50, 90, 50);

		button.addActionListener(e -> {
			if (textField.getText().isEmpty()) {
				JOptionPane.showMessageDialog(frame, "TextField is empty");
			} else {
				String content = textField.getText();
				label2.setText(content);
			}
		});

		frame.add(textField);
		frame.add(button);
		frame.add(label);
		frame.add(label2);

		// JButtonDemo

		JButton button1 = new JButton("Edit");
//	    JButton button2 = new JButton(new ImageIcon("C:\\\\Users\\\\satya\\\\eclipse-workspace\\\\CAPGEMINI-Learning\\\\src\\\\com\\\\java\\\\swingDemo\\\\images\\\\android.png"));
//      JButton button3 = new JButton("Start", new ImageIcon("C:\\\\Users\\\\satya\\\\eclipse-workspace\\\\CAPGEMINI-Learning\\\\src\\\\com\\\\java\\\\swingDemo\\\\images\\\\android.png"));

//	    Adding event listener for JButton
//		Adding an event listener using anonymous class (shortcut way):

//		button1.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//
//			}
//		});

		// Recommended ActionListener
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// do everything here...

				JOptionPane.showMessageDialog(frame, "Edit Button is Clicked");

			}
		});

		// Setting a JButton as the default button
		frame.getRootPane().setDefaultButton(button);

		frame.add(button1);

		// JButton

		JButton but1 = new JButton("Button one");
		JButton but2 = new JButton("Button two");
		JButton but3 = new JButton("Button three");
		JButton but4 = new JButton("Button four");
		JButton but5 = new JButton("Button five");

//		frame.setLayout(new GridBagLayout());
//		GridBagConstraints gbc = new GridBagConstraints();
//
//		gbc.fill = GridBagConstraints.HORIZONTAL;
//		gbc.gridx = 0;
//		gbc.gridy = 0;
//		frame.add(but1, gbc);
//		gbc.gridx = 1;
//		gbc.gridy = 0;
//		frame.add(but2, gbc);
//		gbc.gridx = 0;
//		gbc.gridy = 1;
//		frame.add(but3, gbc);
//		gbc.gridx = 1;
//		gbc.gridy = 1;
//		frame.add(but4, gbc);
//		gbc.gridx = 0;
//		gbc.gridy = 2;
//		gbc.fill = GridBagConstraints.HORIZONTAL;
//		gbc.gridwidth = 2;
//		frame.add(but5, gbc);
//		
//		gbc.gridx = 2;
//		gbc.gridy = 2;
//		frame.add(textField,gbc);
//		gbc.gridx = 3;
//		gbc.gridy = 2;
//		frame.add(button, gbc);
//		
//		gbc.gridx = 0;
//		gbc.gridy = 4;
//		frame.add(label, gbc);

		// Customise Button

		button1.setFont(new java.awt.Font("Arial", Font.BOLD, 14));
		button1.setBackground(Color.YELLOW);
		button1.setForeground(Color.BLUE);

//		frame.setSize(300, 200);
		frame.setLayout(new FlowLayout());
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new JButtonDemo();
	}

}
