package java01;

import java.util.Scanner;

public class F_to_c {
	public static void main(String args[]) {
		double f;
		double c;
		Scanner input = new Scanner(System.in);
		
		System.out.print("ȭ���µ��� �Է��Ͻÿ�:");
		f = input.nextDouble();
		
		c = (f-32)*5/9;
		
		System.out.println("ȭ���µ��� "+ f + "�� �����µ��� "+c+"�Դϴ�.");
	}

}
