package java01;

import java.util.Scanner;

public class MIle {
	public static void main(String args[]) {
		double mile;
		double km;
		Scanner input = new Scanner(System.in);
		
		System.out.print("������ �Է��Ͻÿ� : ");
		mile = input.nextDouble();
		
		km = mile * 1.609;
		System.out.println(mile + "������ "+ km + "ų�ι��� �Դϴ�.");
	}

}
