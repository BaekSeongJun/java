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
		
		System.out.println("���� �ڵ����� ������ " + myCar.getColor());
		System.out.println("���� �ڵ����� �ӵ���" + myCar.getSpeed());
		System.out.println("���� �ڵ����� �ž�� " + myCar.getGear());
	}
}
