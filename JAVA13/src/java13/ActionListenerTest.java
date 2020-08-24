package java13;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame extends JFrame implements ActionListener{
	JButton button;
	JLabel label;
	public MyFrame() {
		this.setTitle("ActionListenerTest");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,200);
		JPanel panel = new JPanel();
		button = new JButton("��ư�� �����ÿ�");
		label = new JLabel("���� ��ư�� �������� �ʾҽ��ϴ�.");
		button.addActionListener(this);
		
		panel.add(button);
		panel.add(label);
		this.add(panel);
		this.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			label.setText("��ħ�� ��ư�� ���������ϴ�.");
		}
	}
}

public class ActionListenerTest {
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}
}
