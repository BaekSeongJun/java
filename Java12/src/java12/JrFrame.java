package java12;

import java.awt.*;
import javax.swing.*;

class MyFrame extends JFrame{
	public MyFrame() {
		setSize(500,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		
		JPanel p1 = new JPanel();
		JLabel f1 = new JLabel("�ڹ� ���ڿ� ���Ű��� ȯ���մϴ�. ������ ������ �����Ͻÿ�.");
		
		JPanel p2 = new JPanel();
		JButton b1 = new JButton("�޺� ����");
		JButton b2 = new JButton("�������� ����");
		JButton b3 = new JButton("�Ұ�� ����");
		
		JPanel p3 = new JPanel();
		
		p1.setBackground(Color.blue);
		p3.setBackground(Color.yellow);
		p2.setBackground(Color.green);
		
		p3.add(f1);
		
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		
		p1.add(p3);
		p1.add(p2);
		add(p1);
		setVisible(true);
	}
}
public class JrFrame {
	public static void main(String[] args) {
		MyFrame f1 = new MyFrame();
	}

}
