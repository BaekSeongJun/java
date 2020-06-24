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
		
		System.out.println("반지름 : " + obj1.getRaduis() + " 원 넓이 : " + obj1.getArea() + " 원 기둥 높이 : " + obj1.getHeight() + " 부피 : " + obj1.getVolume());
		System.out.println("반지름 : " + obj2.getRaduis() + " 원 넓이 : " + obj2.getArea() + " 원 기둥 높이 : " + obj2.getHeight() + " 부피 : " + obj2.getVolume());
	}

}
