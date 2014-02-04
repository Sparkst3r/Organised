package com.sparkst3r.organised;

import java.awt.Color;
import java.awt.Rectangle;

import javax.swing.SwingUtilities;

import com.extlib.ComponentMover;
import com.sparkst3r.Library;
import com.sparkst3r.organised.gui.ContentPanel;
import com.sparkst3r.window.SparkFrame;
import com.sparkst3r.window.SparkPanel;

/**
 * Organised
 * 
 * Main class of the program
 * 
 * @author Josh Lockheed {Sparkst3r}
 * @since 4 Feb 2014 00:40:18
 *
 */
public class Organised {
	public static Rectangle size = new Rectangle(700, 500);
	
	public SparkFrame frame = new SparkFrame();
	public ContentPanel panel = new ContentPanel(frame, size);
	
	
	/**
	 * Constructor, entry point into the program
	 * @param args Command prompt arguments passed to the program
	 */
	public Organised(String[] args) {
		frame.setBounds((Library.SCREENSIZE.width / 2) - (size.width / 2), (Library.SCREENSIZE.height / 2) - (size.height / 2), size.width, size.height);

		
		frame.addElement(panel, new Rectangle(0, 0, size.width, size.height));
		
		
		

		frame.setDefaultCloseOperation(SparkFrame.EXIT_ON_CLOSE);
		frame.setUndecorated(true);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	
	public static void main(final String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Organised(args);
			}
		});
	}
	

	
	
	
}
