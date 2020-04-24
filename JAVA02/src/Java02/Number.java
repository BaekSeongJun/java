package Java02;

import java.util.Scanner;
public class Number {
	public static void main(String args[]) {
		int number;
		
		Scanner input = new Scanner(System.in);
		System.out.print("숫자를 입력하시오 : ");
		number = input.nextInt();
		switch (number) {
		case 0:
			System.out.println("없음");
			break;
		case 1:
			System.out.println("하나");
			break;
		case 2:
			System.out.println("둘");
			break;
		default:
			System.out.println("많음");
			break;
		}
	}

}
