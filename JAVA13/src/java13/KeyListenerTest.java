package java13;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame4 extends JFrame implements KeyListener{
	
	public MyFrame4() {
		setTitle("이벤트 예제");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextField tf = new JTextField(20);
		tf.addKeyListener(this);
		
		add(tf);
		setVisible(true);
	}
	
	public void keyTyped(KeyEvent e) {
		display(e , "keyTyped");
	}
	
	public void keyPressed(KeyEvent e) {
		display(e, "keyPressed");
	}
	
	public void keyReleased(KeyEvent e) {
		display(e, "keyReleased");
	}
	
	protected void display(KeyEvent e , String s) {
		char c = e.getKeyChar();
		int keyCode = e.getKeyCode();
		
		String modifiers = e.isAltDown() + " " + e.isControlDown() + " " + e.isShiftDown();
		System.out.println(s + " " + c + " " + keyCode + " " + modifiers);
		
	}

}

public class KeyListenerTest {
	public static void main(String[] args) {
		MyFrame4 f = new MyFrame4();
	}

}
