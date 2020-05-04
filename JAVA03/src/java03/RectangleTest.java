package java03;

import java.util.Scanner;

class Rectangle{
	int w;
	int h;
	
	void area() {
		System.out.println("사각형의 넓이는 : "+ w*h + "입니다.");
	}
	void perimeter() {
		System.out.println("사각형의 둘레는 : " + 2*(w+h) + "입니다.");
	}
}
public class RectangleTest {
	public static void main(String args[]) {
		Rectangle rec = new Rectangle();
		System.out.print("가로의 길이를 입력하시오 : ");
		Scanner scn = new Scanner(System.in);
		rec.w = scn.nextInt();
		System.out.print("세로의 길이를 입력하시오 : ");
		rec.h = scn.nextInt();
		rec.area();
		rec.perimeter();
	}

}
