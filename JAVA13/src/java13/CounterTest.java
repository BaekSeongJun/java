package java13;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyCounter extends JFrame implements ActionListener{
	private JLabel label, label1;
	private JButton button1, button2, button3;
	private int count = 0;
	
	public MyCounter() {
		JPanel panel = new JPanel();
		label = new JLabel("Counter");
		panel.add(label);
		
		label1 = new JLabel("" + count);
		label1.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 100));
		panel.add(label1);
		
		button1 = new JButton("카운터 증가");
		panel.add(button1);
		button1.addActionListener(this);
		
		button2 = new JButton("카운터 초기화");
		panel.add(button2);
		button2.addActionListener(this);
		
		button3 = new JButton("카운터 감소");
		panel.add(button3);
		button3.addActionListener(this);
		
		add(panel);
		setSize(600,200);
		setTitle("MyCounter");
		
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button1) {
			count++;
			label1.setText(count + "");
		}
		else if (e.getSource() == button2) {
			count = 0;
			label1.setText(count + "");
		}
		else if (e.getSource() == button3) {
			count--;
			label1.setText(count + "");
		}
	}
}

public class CounterTest {
	public static void main(String[] args) {
		MyCounter c = new MyCounter();
	}

}
