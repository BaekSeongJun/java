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
		JOptionPane.showMessageDialog(null, "���� �Ҹ��� ������ �����ϼ���!");
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
			System.out.println("ī���Ͱ� ����Ǿ����ϴ�.");
			Toolkit.getDefaultToolkit().beep();
		}
		else {
			System.out.println("���� ī���� ���� " + counter + "�Դϴ�.");
			Date d = new Date();
			String s = d.toString();
			System.out.println("����ð��� " + s + "�Դϴ�.");
		}
	}
}
