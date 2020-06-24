package HW2;

class Circle{
	private double radius;
	
	public Circle() {
		radius = 1.0;
	}
	public Circle(double r) {
		radius = r;
	}
	
	public double getRaduis() {
		return radius;
	}
	
	public double getArea() {
		return radius * radius * 3.14;
	}
}

class Cylinder extends Circle{
	private double height;
	
	public Cylinder() {
		height = 1.0;
	}
	
	public Cylinder(double r) {
		super (r);
		height = 1.0;
	}
	
	public Cylinder(double r, double h) { 
		super (r);
		height = h;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getVolume() {
		return  getArea() * height;
	}
	
	
	
}

public class TestCylinder {
	public static void main(String[] args) {
		Cylinder obj1 = new Cylinder();
		Cylinder obj2 = new Cylinder(5.0 , 3.0);
		
		System.out.println("������ : " + obj1.getRaduis() + " �� ���� : " + obj1.getArea() + " �� ��� ���� : " + obj1.getHeight() + " ���� : " + obj1.getVolume());
		System.out.println("������ : " + obj2.getRaduis() + " �� ���� : " + obj2.getArea() + " �� ��� ���� : " + obj2.getHeight() + " ���� : " + obj2.getVolume());
	}

}
