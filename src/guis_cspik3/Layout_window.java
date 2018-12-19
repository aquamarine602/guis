package guis_cspik3;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;

public class Layout_window {
	JFrame this_frame;
	JPanel contentPane;
	FlowLayout f_layout;
	GridLayout g_layout;
	BorderLayout bLayout;
	BoxLayout xLayout;
	JPanel this_panel;
	
	
	JButton pear = new JButton("Pear");
	JButton orange = new JButton("Orange");
	JButton apple = new JButton("Apple");
	JButton banana = new JButton("Banana");

	public static void main(String[] args) {
		new Layout_window();

	}
	
	public Layout_window() {
		// create new objects
		this_frame = new JFrame();
		f_layout = new FlowLayout();		// flows
		g_layout = new GridLayout(3, 2);	// rows and columns
		g_layout.setHgap(5);				// gaps between buttons
		g_layout.setVgap(10);
		bLayout = new BorderLayout(5,10);	// borders window
		// xLayout = new BoxLayout(this_panel, BoxLayout.X_AXIS);	// is having issues
		
		// setting a border
		Border this_border = BorderFactory.createLineBorder(Color.RED, 4);
		this_panel.setBorder(this_border);
		
		
		// jpane set up
		// contentPane = (JPanel)this_frame.getContentPane();		// default
		// or
		this_panel = new JPanel();		// calling up your own pane
		this_frame.setContentPane(this_panel);
		
		this_frame.setTitle("Layout Window Example");
		this_frame.setSize(400, 200);
		this_frame.setLocation(200, 300);
		this_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// set up layout
		this_panel.setLayout(g_layout);
		
		// adding this to the jpane
		this_panel.add((pear), BorderLayout.PAGE_START);		//, BorderLayout.PAGE_START, BorderLayout.PAGE_END
		this_panel.add((orange), BorderLayout.PAGE_END);		//, BorderLayout.LINE_START, BorderLayout.LINE_END
		this_panel.add((apple), BorderLayout.LINE_START);
		this_panel.add(new JButton("Banana"), BorderLayout.CENTER);		// adds button directly to panel
		
		this_frame.setVisible(true);
		
	}

}
