package com.sparkst3r.organised.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import com.extlib.ComponentMover;
import com.sparkst3r.window.SparkFrame;
import com.sparkst3r.window.SparkPanel;

/**
 * ContentPanel
 * 
 * Contains all elements displayed on the frame
 * 
 * @author Josh Lockheed {Sparkst3r}
 * @since 4 Feb 2014 22:05:18
 *
 */
public class ContentPanel extends SparkPanel {

	public ContentPanel(SparkFrame frame, Rectangle size) {
		this.setBackground(new Color(255, 255, 255));
		
		
		SparkPanel titleBar = new SparkPanel();
		titleBar.setBackground(new Color(255, 255, 255));
		
		
		
		titleBar.addMouseListener(new MouseAdapter() {
		    public void mouseEntered(MouseEvent e) {
		    	((SparkPanel) e.getSource()).setBackground(new Color(240, 240, 240));
		    }
		    public void mouseExited(MouseEvent e) {
		    	((SparkPanel) e.getSource()).setBackground(new Color(255, 255, 255));
		    }
		} );
		
	
		this.addElement(titleBar, new Rectangle(0, 0, (int)size.getWidth(), 45));
		new ComponentMover(frame, titleBar);
		
		
		
		this.setLayout(null);
	}
}
