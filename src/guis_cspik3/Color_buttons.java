package guis_cspik3;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Color_buttons implements ActionListener{
	JButton red_button = null;		// importing red button
	JButton green_button = null;	// importing green button
	JFrame this_frame = null;		// imports this frame
	
	
	public static void main(String[] args) {
		new Color_buttons();	// create instance of color buttons
		
	}
	
	public Color_buttons() {
		this_frame = new JFrame();
		FlowLayout layout = new FlowLayout();		// import a layout
		
		this_frame.setLayout(layout);				// set manager for layout
		this_frame.setTitle("Choose Your Color");	// gives window title
		this_frame.setSize(550, 150);				// sets window size
		this_frame.setLocation(200, 300);			// sets window location
		this_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// exit
		
		red_button = new JButton("Red");
		green_button = new JButton("Green");
		
		// buttons are added to the action listener
		red_button.addActionListener(this);
		green_button.addActionListener(this);
		
		// adds buttons to the frame
		this_frame.add(red_button);
		this_frame.add(green_button);
		
		this_frame.setVisible(true);	// makes buttons visible
	}

	public void actionPerformed(ActionEvent event) {
		Object control = event.getSource();	// get sources of events
		
		if (control == red_button) {	// if red button is clicked
			this_frame.getContentPane().setBackground(Color.red);
		} else if (control == green_button) {	// if green button is clicked
			this_frame.getContentPane().setBackground(Color.green);
		}
		
		
	}

}
