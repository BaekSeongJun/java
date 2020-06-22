package java09;


class Car {
	int speed;
	int gear;
	public String color;
	
	public void speedUP(int increment) {
		speed += increment;
	}
	
	public void speedDown(int decrement) {
		speed += decrement;
	}
}

class SportsCar extends Car{
	boolean turbo;
	
	public void setTurbo(boolean newValue) {
		turbo = newValue;
	}
}

public class CarTest {
	public static void main(String[] args) {
		SportsCar c = new SportsCar();
		c.color = "Red";
		c.speedUP(100);
		c.speedDown(30);
		c.setTurbo(true);
	}
}