package java01;

import java.util.Scanner;

public class Circle {
	public static void main(String args[]) {
		double radius ;
		double circle;
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("반지름을 입력하시오 : ");
		radius = input.nextDouble();
		
		circle = radius * radius * radius * 4 / 3;
		
		System.out.println("구의 부피 : "+circle);
		
		
	}

}
