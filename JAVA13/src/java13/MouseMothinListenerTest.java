package java13;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame5 extends JFrame implements MouseListener, MouseMotionListener{
	public MyFrame5() {
		setTitle("Mouse Event");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.addMouseListener(this);
		panel.addMouseMotionListener(this);
		add(panel);
		setVisible(true);
		
		
	}
	
	public void mousePressed(MouseEvent e) {
		display("Mouse Pressed (# of clicks : " + e.getClickCount() + ")" , e);	
	}
	
	public void mouseReleased(MouseEvent e) {
		display("Mouse Released (# of clicks : " + e.getClickCount() + ")" , e);
	}
	
	public void mouseEntered(MouseEvent e) {
		display("MouseEntered", e);
	}
	public void mouseExited(MouseEvent e) {
		display("MouseExited ", e);
	}
	
	public void mouseClicked(MouseEvent e) {
		display("MouseClicked (# of clicks : " + e.getClickCount() + ")" , e);
	}
	public void mouseDragged(MouseEvent e) {
		display("MouseDragged ", e);
	}
	public void mouseMoved(MouseEvent e) {
		display("MouseMoved ", e);
	}
	
	protected void display(String s, MouseEvent e) {
		System.out.println(s + "X = " + e.getX() + " Y = " + e.getY());
	}
}

public class MouseMothinListenerTest {
	public static void main(String[] args) {
		MyFrame5 f = new MyFrame5();
	}

}
