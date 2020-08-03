package java11;
import java.awt.*;
import javax.swing.*;

class MyFrame4 extends JFrame{
	public MyFrame4() {
		setSize(500,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("테스트 프레임");
		
		JPanel panel = new JPanel();
		JButton b1 = new JButton();
		b1.setText("왼쪽 버튼");
		JButton b2 = new JButton("중앙 버튼");
		JButton b3 = new JButton("오른쪽 버튼");
		b3.setEnabled(false);
		
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		add(panel);
		setVisible(true);
	}
}

public class MyFrameTest4 {
	public static void main(String[] args) {
		MyFrame4 f = new MyFrame4();
	}
}
