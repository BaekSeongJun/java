package java01;

import java.util.Scanner;

public class MIle {
	public static void main(String args[]) {
		double mile;
		double km;
		Scanner input = new Scanner(System.in);
		
		System.out.print("마일을 입력하시오 : ");
		mile = input.nextDouble();
		
		km = mile * 1.609;
		System.out.println(mile + "마일은 "+ km + "킬로미터 입니다.");
	}

}
