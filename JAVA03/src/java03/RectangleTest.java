package java03;

import java.util.Scanner;

class Rectangle{
	int w;
	int h;
	
	void area() {
		System.out.println("�簢���� ���̴� : "+ w*h + "�Դϴ�.");
	}
	void perimeter() {
		System.out.println("�簢���� �ѷ��� : " + 2*(w+h) + "�Դϴ�.");
	}
}
public class RectangleTest {
	public static void main(String args[]) {
		Rectangle rec = new Rectangle();
		System.out.print("������ ���̸� �Է��Ͻÿ� : ");
		Scanner scn = new Scanner(System.in);
		rec.w = scn.nextInt();
		System.out.print("������ ���̸� �Է��Ͻÿ� : ");
		rec.h = scn.nextInt();
		rec.area();
		rec.perimeter();
	}

}
