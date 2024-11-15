package main;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class GamePanel extends JPanel{
		
	private static final long serialVersionUID = 1L;
	
	int screenWith;
	int screenHeight;
	Color color;
	
	
	public GamePanel(int sW, int sH) {
		this.screenWith = sW;
		this.screenHeight = sH;
		this.setPreferredSize(new Dimension(screenWith, screenHeight));
		this.setBackground(Color.blue);
		this.setDoubleBuffered(true);
		
	}
	
	public GamePanel(int w, int h, Color c) {
		this.screenWith = w;
		this.screenHeight = h;
		this.color = c;
		this.setPreferredSize(new Dimension(screenWith, screenHeight));
		this.setBackground(c);
		this.setDoubleBuffered(true);
		
	}
	
	
	
}
