package Java02;

import java.util.Scanner;

public class LoopExample {
	public static void main(String args[]) {
		int n;
		int i = 1;
		System.out.print("������ �߿��� ����ϰ� ���� ���� �Է��Ͻÿ� : ");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		while(i <= 9) {
			System.out.println(n + "*" + i + "=" + n*i);
			i++;
		}
	}

}
