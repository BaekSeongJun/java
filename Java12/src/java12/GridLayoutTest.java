package java12;

import java.awt.*;
import javax.swing.*;

class MyFrame4 extends JFrame{
	public MyFrame4() {
		setTitle("GridLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(0 , 3));
		
		add(new JButton("Button1"));
		add(new JButton("Button2"));
		add(new JButton("Button3"));
		add(new JButton("B4"));
		add(new JButton("Long Button5"));
		
		pack();
		setVisible(true);
	}
}

public class GridLayoutTest {
	public static void main(String[] args) {
		MyFrame4 f = new MyFrame4();
	}
}
