package com.java.swingDemo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class JCheckBoxJRadioButtonDemo {

	public JCheckBoxJRadioButtonDemo() {

		JFrame frame = new JFrame();

		// JCheckBox

		//1
		JCheckBox checkBox1 = new JCheckBox("C++");
//		        checkBox1.setBounds(100, 100, 50, 50);  
		//2 
		JCheckBox checkBox2 = new JCheckBox("Java", true);
//		        checkBox2.setBounds(100, 150, 50, 0);  
		//3
		JLabel label2 = new JLabel();

		//1,2,3
		frame.add(checkBox1);
		frame.add(checkBox2);
		frame.add(label2);

		checkBox1.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				label2.setText("C++ Checkbox: " + (e.getStateChange() == 1 ? "checked" : "unchecked"));
			}
		});
		
		checkBox2.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				label2.setText("Java Checkbox: " + (e.getStateChange() == 1 ? "checked" : "unchecked"));
			}
		});

		
		
		// JRadioButton

		//1
		JRadioButton r1 = new JRadioButton("A) Male");
		//2
		JRadioButton r2 = new JRadioButton("B) Female");
		r1.setBounds(75, 50, 100, 30);
		r2.setBounds(75, 100, 100, 30);
		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);

		//1,2
		frame.add(r1);
		frame.add(r2);

		//3
		JButton button2 = new JButton("Radio");
		
		String msg = "";
		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (r1.isSelected()) {
					JOptionPane.showMessageDialog(frame, msg + "Radio: " + r1.getText());
				} else if (r2.isSelected()) {
					JOptionPane.showMessageDialog(frame, msg + "Radio: " + r2.getText());
				} else
					JOptionPane.showMessageDialog(frame, msg + "Radio: " + "No Option Selected");
			}
		});

		//3,
		frame.add(button2);

		frame.setLayout(new FlowLayout());
		frame.setSize(300, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	}
	public static void main(String[] args) {
		new JCheckBoxJRadioButtonDemo();
	}
}
