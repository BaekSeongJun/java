package java13;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame3 extends JFrame {
		private JButton button1;
		private JButton button2;
		private JPanel panel;
		MyListener listener = new MyListener();
	
		public MyFrame3() {
			this.setSize(300,200);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setTitle("ActionListenerTest");
			panel = new JPanel();
			button1 = new JButton("노란색");
			button1.addActionListener(listener);
			panel.add(button1);
			button2 = new JButton("분홍색");
			button2.addActionListener(listener);
			panel.add(button2);
			
			this.add(panel);
			this.setVisible(true);
		}
		
		private class MyListener implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button1) {
					panel.setBackground(Color.YELLOW);
				}
				else if (e.getSource() == button2) {
					panel.setBackground(Color.PINK);
				}
				
			}
		}
	
}

public class ActionListenerTest3 {
	public static void main(String[] args) {
		MyFrame3 f = new MyFrame3();
	}
}
