package java09;

public class Rectangle extends Shape2 {
	public Rectangle() {
		System.out.println("Rectangle 持失切()");
	}
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
	}

}
class Shape2 {
	public Shape2() {
		System.out.println("Shape2税 持失切 ()");
	}
}

