package Java02;

import java.util.Scanner;

public class LoopExample2 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = 0;
		int i = 1;

		while (true) {
			System.out.print("����ϰ� ���� �������� �Է��Ͻÿ� : (0�� ������ ����)");
			n = scan.nextInt();
			if (n != 0) {
				while (i <= 9) {
					System.out.println(n + "*" + i + "=" + n * i);
					i++;
				}
				i = 1;
			} 
			else {
				System.out.println("�ݺ��� �����մϴ�.");
				break;
			}
		}
	}
}
