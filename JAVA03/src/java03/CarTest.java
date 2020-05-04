package java03;

class Car {
	String color;
	int speed;
	int gear;
	void print() {
		System.out.println("("+color+","+speed+","+gear+")");
	}
}
public class CarTest {
	public static void main(String args[]) {
		Car myCar = new Car();
		myCar.color = "red";
		myCar.speed = 0;
		myCar.gear = 1;
		myCar.print();
		
		Car myCar2 =new Car();
		myCar2.color = "purple";
		myCar2.speed = 20;
		myCar2.gear = 1 ;
		myCar2.print();
	}

}
