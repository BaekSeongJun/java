package java06;

class Point { 
	private int x, y;
	
	public Point (int a, int b) {
		x = a;
		y = b;
	}
}

class Circle {
	private int radius = 0;
	private Point center;
	
	public Circle(Point p, int r) {
		center = p;
		radius = r;
	}
}
public class CircleTest {
	public static void main(String args[]) {
		
		Point p = new Point(25, 78);
		Circle c = new Circle(p , 10);
	}

}
