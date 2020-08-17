package java12;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class MyFrame7 extends JFrame{
	JPanel p1;
	public MyFrame7() {
		setSize(300,200);
		setTitle("MY Frame");
		p1 = new JPanel();
		p1.setLayout(new FlowLayout());
		for(int i = 0; i < 10; i ++)
			p1.add(new JButton("Button" + i));
		add(p1);
		
		setVisible(true);
	}
}
public class MyFrameTest3 {
	public static void main(String[] args) {
		MyFrame7 f = new MyFrame7();
	}
}
