package com.java.swingDemo;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Arrays;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class JTextfieldDemo {

	public JTextfieldDemo() {

		JFrame frame = new JFrame();

		// JTextField

		JTextField textField = new JTextField(20);
		textField.setToolTipText("Please enter some text here");

		JButton button = new JButton("Click");
		JLabel label = new JLabel("Result:");

//	        Setting input focus for JTextField
//	        Normally, the text field gets focused when the user is clicking on it or pressing the TAB key. 
//	        To set input focus programmatically, use the following code:
//	        Setting input focus initially just after the container (such as a JFrame) is displayed:

		textField.requestFocusInWindow();

		frame.add(textField);
		frame.add(button);
		frame.add(label);

//		frame.setSize(400, 400);
		frame.setLayout(new FlowLayout());
//		frame.pack();
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new JTextfieldDemo();
	}

}
