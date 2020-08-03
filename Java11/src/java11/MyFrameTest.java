package java11;

import java.awt.FlowLayout;
import javax.swing.*;

class MyFrame extends JFrame{
	public MyFrame() {
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		
		setLayout(new FlowLayout());
		JButton button = new JButton("¹öÆ°");
		this.add(button);
		setVisible(true);
	}
}

public class MyFrameTest {
	public static void main(String args[]) {
		MyFrame f = new MyFrame();
	}
}
