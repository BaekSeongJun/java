package java13;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame2 extends JFrame{
	JButton button;
	JLabel label;
	public MyFrame2() {
		this.setTitle("ActionListenerTest");
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		label = new JLabel("���� ��ư�� �������� �ʾҽ��ϴ�.");
		button = new JButton("��ư�� �����ÿ�");
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button) {
					label.setText("��ħ�� ��ư�� ���������ϴ�.");
				}
			}
		});
		panel.add(button);
		panel.add(label);
		this.add(panel);
		this.setVisible(true);
	
	}
}

public class ActionListenerTest2 {
	public static void main(String[] args) {
		MyFrame2 f = new MyFrame2();
	}

}
