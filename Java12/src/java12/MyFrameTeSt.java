package java12;

import java.awt.*;
import javax.swing.*;

class MyFrame2 extends JFrame {
	public MyFrame2() {
		
		setTitle("FlowLayOutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel;
		
		panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		panel.add(new JButton("Button1"));
		panel.add(new JButton("Button2"));
		panel.add(new JButton("Button3"));
		panel.add(new JButton("B4"));
		panel.add(new JButton("Long Button5"));
		
		add(panel);
		pack();
		setVisible(true);
		
		
	}
}


public class MyFrameTeSt {
	public static void main(String[] args) {
		MyFrame2 f = new MyFrame2();
	}
	
}
