package java12;

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;

class MyListener implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		button.setText("마침내 버튼이 눌러졌습니다.");
	}
}
class MyFrame9 extends JFrame{
	private JButton button;
	public MyFrame9() {
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("이벤트 예제");
		this.setLayout(new FlowLayout());
		button = new JButton("버튼을 누르시오");
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
