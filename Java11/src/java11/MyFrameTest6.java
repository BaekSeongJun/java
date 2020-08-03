package java11;

import java.awt.*;
import javax.swing.*;

class MyFrame6 extends JFrame{
	public MyFrame6() {
		setSize(500,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		
		JPanel panel = new JPanel();
		JButton b1 = new JButton("왼쪽 버튼");
		JButton b2 = new JButton("중앙 버튼");
		JButton b3 = new JButton("오른쪽 버튼");
		b3.setEnabled(false);
		
		JPanel panel2 = new JPanel();
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		t2.setEnabled(false);
		
		panel2.add(t1);
		panel2.add(t2);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		
		panel.add(panel2);
		add(panel);
		setVisible(true);
		
	}
	
}


public class MyFrameTest6 {
	public static void main(String[] args) {
		MyFrame6 f = new MyFrame6();
	}

}
