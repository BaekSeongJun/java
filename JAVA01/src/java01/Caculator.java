package java01;

import java.util.Scanner;

public class Caculator {
	public static void main(String args[]) {
		double x;
		double f;
		
		Scanner input = new Scanner(System.in);
		System.out.print("x�ǰ��� �Է��Ͻÿ� : ");
		x = input.nextDouble();
		
		f = (x <= 0 ) ? (x*x*x-9*x+2) : (7*x + 2);
		System.out.println("��� : " + f);
	
		
		
	}
}
