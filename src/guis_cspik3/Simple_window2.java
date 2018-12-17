package guis_cspik3;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;		// adds event

public class Simple_window2 implements ActionListener{

	public static void main(String[] args) {
		new Simple_window2();
	}
	
	public Simple_window2() {
		JFrame frame = new JFrame();
		FlowLayout layout = new FlowLayout();
				
		frame.setLayout(layout);
		frame.setTitle("simple window");
		frame.setSize(1800, 600);
		frame.setLocation(100,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("Label of Labels");
		frame.add(label);
		
		JButton button = new JButton("Button of Buttons");
		button.addActionListener(this);		// allows button to do something
		frame.add(button);
		
		frame.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "commit game end");
		
	}

}
