package java11;

class Shape{
	protected int x, y;
	public void draw() {
		System.out.println("Shape Draw");
	}
}

class Rectangle extends Shape{
	private int width, height;
	public void draw() {
		System.out.println("Rectangle Draw");
	}
}

class Triangle extends Shape{
	private int base, height;
	public void draw() {
		System.out.println("Triangle Draw");
	}
}

class Circle extends Shape{
	private int radius;
	public void draw() {
		System.out.println("Circle Draw");
	}
}

public class ShapeTest2 {
	private static Shape arrayOfShapes[];
	public static void main(String args[]) {
		init();
		drawA11();
	}
	
	public static void init() {
		arrayOfShapes = new Shape[3];
		arrayOfShapes[0] = new Rectangle();
		arrayOfShapes[1] = new Triangle();
		arrayOfShapes[2] = new Circle();
	}
	
	public static void drawA11() {
		for(int i = 0; i < arrayOfShapes.length ; i++) {
			arrayOfShapes[i].draw();
		}
	}

}
