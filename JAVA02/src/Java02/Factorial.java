package Java02;

import java.util.Scanner;

public class Factorial {
	public static void main(String args[]) {
		long fact = 1;
		int n;
		
		System.out.print("������ �Է��Ͻÿ� : ");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		
		for(int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.printf("%d!�� %d�Դϴ�.\n",n,fact);
	}
}
