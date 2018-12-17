package guis_cspik3;

import java.awt.*;
import javax.swing.*;

public class Simple_window {

	public static void main(String[] args) {
		JFrame frame = new JFrame();			// call up jframe constructor
		FlowLayout layout = new FlowLayout();	// manages layout
				
		frame.setLayout(layout);				// object 'layout' is layout manager
		frame.setTitle("simple window");		// title
		frame.setSize(1800, 600);				//size
		frame.setLocation(100,200);			//location on monitor
		// gives the window the ability to close
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);					// sets visibility to true
		
		JLabel label = new JLabel("Label of Labels");
		frame.add(label);		// adds to screen
		
		JButton button = new JButton("Button of Buttons");
		frame.add(button);
		button.setEnabled(true);		// enables or disables buttons
		//frame.pack();		// packs everything together
		
		JButton button1 = new JButton("Button 1");
		frame.add(button1);
		
		JButton button2 = new JButton("Button 2");
		frame.add(button2);
		
		JButton button3 = new JButton("Button 3");
		frame.add(button3);
		
		JButton button4 = new JButton("Button 4");
		frame.add(button4);
		
		JButton button5 = new JButton("Button 5");
		frame.add(button5);
		
		frame.setVisible(true);	
	}

}
