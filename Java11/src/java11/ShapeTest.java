package java11;

class Shape2 {
	int x, y;
}

class Rectangle2 extends Shape2{
	int width, height;
}

public class ShapeTest {
	public static void main(String args[]) {
		Shape2 s;
		Rectangle2 r = new Rectangle2();
		s = r;
		s.x = 0;
		s.y = 0;
	}

}
