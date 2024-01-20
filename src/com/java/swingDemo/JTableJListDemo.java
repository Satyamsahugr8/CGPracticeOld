package com.java.swingDemo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableJListDemo {

	public JTableJListDemo() {
		
		JFrame frame = new JFrame();

		// Jtable

//		String data[][] = { { "101", "Amit", "670000" }, { "102", "Jai", "780000" }, { "101", "Sachin", "700000" }, };
//		String column[] = { "ID", "NAME", "SALARY" };
//		//1
//		JTable jt = new JTable(data, column);
//		jt.setBounds(30, 40, 200, 300);
//		//2
//		JScrollPane sp = new JScrollPane(jt);
//
////				gbc.gridx = 0;
//
//		frame.add(jt);
//		frame.add(sp);

		
		
		
		
		// JList

		
		DefaultListModel<String> l1 = new DefaultListModel<>();
		l1.addElement("Item1");
		l1.addElement("Item2");
		l1.addElement("Item3");
		l1.addElement("Item4");

		JList<String> list = new JList<>(l1);
		list.setBounds(100, 100, 75, 75);
		frame.add(list);

		final JLabel label = new JLabel("list:");
		label.setSize(500, 100);
		
		//1
		JButton b = new JButton("Show");
		b.setBounds(200, 150, 80, 30);
		final DefaultListModel<String> l11 = new DefaultListModel<>();
		l11.addElement("C");
		l11.addElement("C++");
		l11.addElement("Java");
		l11.addElement("PHP");
		
		//2
		final JList<String> list1 = new JList<>(l1);
		list1.setBounds(100, 100, 75, 75);
		DefaultListModel<String> l2 = new DefaultListModel<>();
		l2.addElement("Turbo C++");
		l2.addElement("Struts");
		l2.addElement("Spring");
		l2.addElement("YII");
		
		//3
		final JList<String> list2 = new JList<>(l2);
		list2.setBounds(100, 200, 75, 75);

		frame.add(list1);
		frame.add(list2);
		frame.add(b);
		frame.add(label);

		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data = "";
				if (list1.getSelectedIndex() != -1) {
					data = "Programming language Selected: " + list1.getSelectedValue();
					label.setText(data);
				}
				if (list2.getSelectedIndex() != -1) {
					data += ", FrameWork Selected: ";
					for (Object frame : list2.getSelectedValues()) {
						data += frame + " ";
					}
				}
				label.setText(data);
			}
		});

//		frame.setSize(400, 400);
//		frame.pack();
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new JTableJListDemo();
	}
}
