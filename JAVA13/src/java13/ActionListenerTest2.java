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
		label = new JLabel("마직 버튼이 눌러지지 않았습니다.");
		button = new JButton("버튼을 누르시오");
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button) {
					label.setText("마침내 버튼이 눌러졌습니다.");
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
