package java11;
import java.awt.*;
import javax.swing.*;

class MyFrame5 extends JFrame{
	public MyFrame5() {
		setSize(500,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("테스트 프레임");
		
		JPanel panel = new JPanel();
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		t2.setEditable(false);
		
		panel.add(t1);
		panel.add(t2);
		
		add(panel);
		setVisible(true);
	}
}
public class MyFrameTest5 {
	public static void main(String[] args) {
		MyFrame5 f = new MyFrame5();
	}
}
