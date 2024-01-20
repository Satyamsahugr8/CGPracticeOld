package com.java.swingProjects;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class FoodPlaza {
	static float amount = 0;  
    static String msg = "";  
	public FoodPlaza() {
		
		JFrame frame = new JFrame();
		JLabel label = new JLabel("Food Order System");
		JCheckBox checkBoxPizza = new JCheckBox("Pizza @ 100");
		JCheckBox checkBoxBurger = new JCheckBox("Burger @ 30");
		JCheckBox checkBoxTea = new JCheckBox("Tea @ 10");
		JButton button = new JButton("Total");
		
		
		
		checkBoxPizza.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(checkBoxPizza.isSelected()){  
		            amount+=100;  
		            msg="Pizza: 100\n";  
		        }  
				
			}
		});
		
		checkBoxBurger.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(checkBoxBurger.isSelected()){  
		            amount+=30;  
		            msg+="Burger: 30\n";  
		        }   
				
			}
		});
		
		checkBoxTea.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(checkBoxTea.isSelected()){  
		            amount+=10;  
		            msg+="Tea: 10\n";  
		        } 
				
			}
		});

		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, msg+"Total: "+ amount);
				
			}
		});


	
		frame.setLayout(new GridBagLayout());

		// adding into frame
		
		GridBagConstraints g = new GridBagConstraints();
//		g.fill = GridBagConstraints.HORIZONTAL;
		g.anchor = GridBagConstraints.WEST;
		g.insets = new Insets(10, 10, 10, 10);
		
		g.gridx = 0;
		g.gridy = 0;
		g.anchor = GridBagConstraints.CENTER;
		frame.add(label, g);
		
//		g.gridx = 1;
		g.gridy = 1;
		frame.add(checkBoxPizza, g);
		
//		g.gridx = 0;
		g.gridy = 2;
		frame.add(checkBoxBurger, g);
		
//		g.gridx = 1;
		g.gridy = 3;
		frame.add(checkBoxTea, g);
		
//		g.gridx = 1;
		g.gridy = 4;
		frame.add(button, g);
		
		frame.setSize(300, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new FoodPlaza();
	}

}
