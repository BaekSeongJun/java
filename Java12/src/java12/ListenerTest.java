package java12;

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;

class MyListener implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		button.setText("��ħ�� ��ư�� ���������ϴ�.");
	}
}
class MyFrame9 extends JFrame{
	private JButton button;
	public MyFrame9() {
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("�̺�Ʈ ����");
		this.setLayout(new FlowLayout());
		button = new JButton("��ư�� �����ÿ�");
		button.addActionListener(new MyListener());
		this.add(button);
		this.setVisible(true);
		
	}
}

public class ListenerTest {
	public static void main(String[] args) {
		MyFrame9 f = new MyFrame9();
	}

}
