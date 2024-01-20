package com.java.swingDemo;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JComboBoxDemo {

	public JComboBoxDemo() {

		JFrame frame = new JFrame();

		// JComboBoxDemo

		String[] bookTitles = new String[] { "Effective Java", "Head First Java", "Thinking in Java",
				"Java for Dummies" };

		//1
		JComboBox<String> bookList = new JComboBox<>(bookTitles);
		// add more books
		bookList.addItem("Java Generics and Collections");
		bookList.addItem("Beginnning Java 7");
		bookList.addItem("Java I/O");

		//2
		JButton comboButton = new JButton("Show ComboBox selected");
		//3
		JLabel labelCombo = new JLabel("ComboBox is");

		comboButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				// do everything here...
				// get the selected item:
				String selectedBook = (String) bookList.getSelectedItem();
				System.out.println("You seleted the book: " + selectedBook);
				labelCombo.setText(selectedBook + " ");
			}
		});
		
		//1,2,3
		frame.add(bookList);
		frame.add(comboButton);
		frame.add(labelCombo);

		// 1
		JComboBox<String> myTitles = new JComboBox<String>();
		JComboBox<Integer> myNumbers = new JComboBox<Integer>();

		// create an empty combo box with items of type String
		JComboBox<String> comboLanguage = new JComboBox<String>();
		// add items to the combo box
		comboLanguage.addItem("English");
		comboLanguage.addItem("French");
		comboLanguage.addItem("Spanish");
		comboLanguage.addItem("Japanese");
		comboLanguage.addItem("Chinese");

		// 2
		comboLanguage.setEditable(true);

		// 5
		// remove an item of type String
		bookList.removeItem("Thinking in Java");

		// remove an item of a custom type Job
		// the Job class must override the equals() method

//	    Job consultantJob = new Job("Consultant");
//		jobList.removeItem(consultantJob);

		// remove an item at a given index:

//		jobList.removeItemAt(2);

//      Removing all items (using the removeAllItems()method):
//		bookList.removeAllItems();

		// get the selected item as an object
		String selectedBook = (String) bookList.getSelectedItem();
		System.out.println(selectedBook);

		// 6
		bookList.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				JComboBox<String> combo = (JComboBox<String>) event.getSource();
				String selectedBook = (String) combo.getSelectedItem();

				if (selectedBook.equals("Effective Java")) {
					System.out.println("Good choice!");
				} else if (selectedBook.equals("Head First Java")) {
					System.out.println("Nice pick, too!");
				}
			}
		});

		bookList.setForeground(Color.BLUE);
		bookList.setBackground(Color.WHITE);
		bookList.setFont(new Font("Arial", Font.BOLD, 14));
		// And limit the maximum number of items displayed in the drop-down list:
		bookList.setMaximumRowCount(5); // scroller

		String[] countries = new String[] { "India", "Japan", "USA", "Canada" };
//			        private String[][] countries = {{"USA", "us.png"},{"India", "in.png"},{"Vietnam", "vn.png"},{"Germany", "de.png"},{"Canada", "ca.png"},{"Japan", "jp.png"},{"Great Britain", "gb.png"},{"France", "fr.png"}};

		JComboBox<String> countriess = new JComboBox<String>(countries);

//			        CountryComboBox customCombobox = new CountryComboBox();
//			        customCombobox.setPreferredSize(new Dimension(120, 30));
//			        customCombobox.setEditable(true);
//			        customCombobox.addItems(countryList);

		countriess.addItem(selectedBook);
//			        countriess.setMaximumRowCount(3);
		countriess.setBackground(Color.ORANGE);
		countriess.setFont(new Font("Arial", Font.BOLD, 14));

		
        frame.add(comboLanguage);
		frame.add(countriess);

		frame.setLayout(new FlowLayout());
		frame.setSize(300, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new JComboBoxDemo();
	}

}
