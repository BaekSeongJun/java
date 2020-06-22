package java09;

class Shape {
	public Shape(String msg) {
		System.out.println("Shape 税 持失切 ()" + msg);
	}
}

public class RectangleTest extends Shape {
	public RectangleTest() {
		super ("from TectangleTest");
		System.out.println("RectangleTest 持失切()");
	}
	public static void main(String[] args) {
		RectangleTest r = new RectangleTest();
	}

}
