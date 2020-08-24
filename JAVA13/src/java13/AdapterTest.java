package java13;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.event.*;
import javax.swing.*;

class Rectangle{
	int x, y, w, h;
}

class MyPanel2 extends JPanel{
	BufferedImage img = null;
	int img_x = 0 , img_y = 0;
	Rectangle[] array = new Rectangle[100];
	int index = 0;
	
	public MyPanel2() {
		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if(index > 100)
					return;
				array[index] = new Rectangle();
				array[index].x = e.getX();
				array[index].y = e.getY();
				array[index].w = 20;
				array[index].h = 20;
				index++;
				repaint();
			}
		});
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for(Rectangle r : array)
			if(r != null)
				g.drawRect(r.x, r.y, r.w, r.h);
	}
}


public class AdapterTest extends JFrame{
	public AdapterTest() {
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MyPanel2());
		setVisible(true);
	}

	public static void main(String[] args) {
		AdapterTest a = new AdapterTest();
	}
}
