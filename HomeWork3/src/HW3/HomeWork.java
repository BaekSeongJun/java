package HW3;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class HomeWork {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int counter ;
		counter = sc.nextInt();
		
		ActionListener listener = new Counter(counter);
		Timer t = new Timer(1000 , listener);
		t.start();
		JOptionPane.showMessageDialog(null, "비프 소리를 들으면 종료하세요!");
		System.exit(0);
		

	}
}

class Counter implements ActionListener{
	int counter = 10;
	
	public Counter(int c) {
		counter = c;
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		counter--;
		if(counter <= 0) {
			counter = 0;
			System.out.println("카운터가 조욜되었습니다.");
			Toolkit.getDefaultToolkit().beep();
		}
		else {
			System.out.println("현재 카운터 값은 " + counter + "입니다.");
			Date d = new Date();
			String s = d.toString();
			System.out.println("현재시각은 " + s + "입니다.");
		}
	}
}
