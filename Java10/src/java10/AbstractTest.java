package java10;

abstract class Shape{
	int x, y;
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public abstract void draw();
}

class Rectangle extends Shape{
	int width, height;
	public void draw() {
		System.out.println("�簢�� �׸��� �޼ҵ�");
	}
}

class Circle extends Shape{
	int radius;
	public void draw() {
		System.out.println("�� �׸��� �޼ҵ�");
	}
}

public class AbstractTest {
	public static void main(String args[]) {
		
	}
}
