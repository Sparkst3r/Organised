package com.sparkst3r.organised;

import java.awt.Rectangle;

import javax.swing.SwingUtilities;

import com.sparkst3r.Library;
import com.sparkst3r.organised.gui.ContentPanel;
import com.sparkst3r.window.SparkFrame;
import com.sparkst3r.window.SparkPanel;

public class Organised {
	
	public SparkFrame frame = new SparkFrame();
	public ContentPanel panel = new ContentPanel();
	public static Rectangle size = new Rectangle(Library.SCREENSIZE.width / 2, Library.SCREENSIZE.height / 2);
	
	public Organised(String[] args) {
		frame.addElement(panel, new Rectangle(0,0, size.width, size.height));
		
		frame.setLayout(null);
		frame.setBounds((Library.SCREENSIZE.width / 2) - (size.width / 2), (Library.SCREENSIZE.height / 2) - (size.height / 2), size.width, size.height);
		frame.setDefaultCloseOperation(SparkFrame.EXIT_ON_CLOSE);
		frame.setUndecorated(true);
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
