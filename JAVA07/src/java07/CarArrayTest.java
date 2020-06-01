package java07;

class Car {
	public int speed;
	public int gear;
	public String color;
	
	public Car() {
		speed = 0;
		gear = 1;
		color = "red";
	}
	
	public void speedup() {
		speed += 10;
	}
	
	public String toString() {
		return "속도 : " + speed + "기어 : " + gear + "색상 : " + color;
	}
}

public class CarArrayTest {
	public static void main(String[] args) {
		final int NUM_CARS = 5;
		Car[] cars = new Car[NUM_CARS];
		for(int i = 0; i < NUM_CARS; i++)
			cars[i] =new Car();
		for(int i = 0; i < NUM_CARS; i++)
			cars[i].speedup();
		for(int i = 0; i < NUM_CARS; i++)
			System.out.println(cars[i]);
		
	}
}
