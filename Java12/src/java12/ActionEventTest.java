package java12;

import javax.swing.*;
import java.awt.event.*;

class MyFrame10 extends JFrame{
	private JButton button;
	private JLabel label;
	
	public MyFrame10() {
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("�̺�Ʈ ����");
		JPanel panel = new JPanel();
		button = new JButton("��ư�� �����ÿ�");
		label = new JLabel("���� ��ư�� �������� �ʾҽ��ϴ�.");
		button.addActionListener(new MyListener2());
		panel.add(button);
		panel.add(label);
		this.add(panel);
		this.setVisible(true);
		
	}
	private class MyListener2 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button) {
				label.setText("��ħ�� ��ư�� ���������ϴ�.");
			}
		}
	}
}

public class ActionEventTest {
	public static void main(String[] args) {
		MyFrame10 f = new MyFrame10();
	}

}
