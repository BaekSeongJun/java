package java04;

class Car {
	private String color;
	private int speed;
	private int gear;
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String c) {
		color = c;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}
	
}

public class CarTest1{
	public static void main(String args[]) {
		Car myCar = new Car();
		
		myCar.setColor("red");
		myCar.setSpeed(100);
		myCar.setGear(10);
		
		System.out.println("현재 자동차의 색상은 " + myCar.getColor());
		System.out.println("현재 자동차의 속도는" + myCar.getSpeed());
		System.out.println("현재 자동차의 거어는 " + myCar.getGear());
	}
}
