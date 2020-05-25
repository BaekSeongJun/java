package java06;

class Car {
	private String color;
	private int speed;
	private int gear;
	private int id;
	private static int numberOfcars = 0;
	
	public Car(String c, int s, int g) {
		color = c;
		speed = s;
		gear = g;
		
		id = ++numberOfcars;
	}
	
	public static int getNumberOfCars() {
		return numberOfcars;
	}
}

public class CarTest {
	public static void main (String args[]) {
		Car c1 = new Car("blue", 100, 1);
		Car c2 = new Car("white", 0, 1);
		int n = Car.getNumberOfCars();
		System.out.println("지금까지 생성된 자동차의 수 = " + n);
	}
}

