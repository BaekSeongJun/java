package java01;

import java.util.Scanner;

public class Box {
	public static void main(String args[]) {
		double w;
		double h;
		double area;
		double perimeter;
		Scanner input = new Scanner(System.in);
		
		System.out.print("������ ���̸� �Է��ϼ��� : ");
		w = input.nextDouble();
		
		System.out.print("������ ���̸� �Է��ϼ��� : ");
		h = input.nextDouble();
		
		area = w*h;
		perimeter = 2*(w+h);
		
		System.out.print("�簢���� ���� : ");
		System.out.println(area);
		System.out.print("�簢���� �ѷ� : ");
		System.out.println(perimeter);
	}
}
