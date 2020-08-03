package java11;

import java.awt.FlowLayout;
import javax.swing.*;

class MyFrame3 extends JFrame{
	public MyFrame3() {
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("안녕하세요?");
		JButton button = new JButton("버튼");
		panel.add(label);
		panel.add(button);
		add(panel);
		setVisible(true);
	}
}
public class MyFrameTest3 {
	public static void main(String[] args) {
		MyFrame3 f = new MyFrame3();
	}
}
