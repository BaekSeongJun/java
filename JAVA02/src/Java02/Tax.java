package Java02;

import java.util.Scanner;

public class Tax {
	public static void main(String args[]) {
		int income;
		int tax;
		System.out.print("���� ǥ�� �ݾ��� �Է��Ͻÿ� : ");
		Scanner input = new Scanner(System.in);
		income = input.nextInt();
		
		if(income < 8000) {
			tax = (int) (0.27 * income);
			if(income <= 4000) {
				tax = (int) (0.18 * income);
				if(income <= 1000) {
					tax = (int) (0.09 * income);
				}
			}
		else
			tax = (int) (0.36 * income);
			
			System.out.println("�ҵ漼�� " + tax + "�Դϴ�.");
		}
		
	}

}
