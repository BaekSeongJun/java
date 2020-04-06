package java01;

import java.util.Scanner;

public class Box {
	public static void main(String args[]) {
		double w;
		double h;
		double area;
		double perimeter;
		Scanner input = new Scanner(System.in);
		
		System.out.print("가로의 길이를 입력하세요 : ");
		w = input.nextDouble();
		
		System.out.print("세로의 길이를 입력하세요 : ");
		h = input.nextDouble();
		
		area = w*h;
		perimeter = 2*(w+h);
		
		System.out.print("사각형의 넓이 : ");
		System.out.println(area);
		System.out.print("사각형의 둘레 : ");
		System.out.println(perimeter);
	}
}
