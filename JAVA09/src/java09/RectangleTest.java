package java09;

class Shape {
	public Shape(String msg) {
		System.out.println("Shape �� ������ ()" + msg);
	}
}

public class RectangleTest extends Shape {
	public RectangleTest() {
		super ("from TectangleTest");
		System.out.println("RectangleTest ������()");
	}
	public static void main(String[] args) {
		RectangleTest r = new RectangleTest();
	}

}
