package java01;

import java.util.Scanner;

public class F_to_c {
	public static void main(String args[]) {
		double f;
		double c;
		Scanner input = new Scanner(System.in);
		
		System.out.print("화씨온도를 입력하시오:");
		f = input.nextDouble();
		
		c = (f-32)*5/9;
		
		System.out.println("화씨온도는 "+ f + "는 섭씨온도로 "+c+"입니다.");
	}

}
