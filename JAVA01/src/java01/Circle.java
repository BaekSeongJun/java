package java01;

import java.util.Scanner;

public class Circle {
	public static void main(String args[]) {
		double radius ;
		double circle;
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("�������� �Է��Ͻÿ� : ");
		radius = input.nextDouble();
		
		circle = radius * radius * radius * 4 / 3;
		
		System.out.println("���� ���� : "+circle);
		
		
	}

}
