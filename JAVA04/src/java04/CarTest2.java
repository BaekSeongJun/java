package java04;

class Car1 {
	private int speed;
	
	public void setSpeed(int s) {
		speed = s;
		System.out.println("���� ���� ȣ��");
		
	}
	
	public void setSpeed(double s) {
		speed = (int)s;
		System.out.println("�Ǽ� ���� ȣ��");
	}
	
}
public class CarTest2 {
	public static void main(String args[]) {
		Car1 myCar = new Car1();
		myCar.setSpeed(100);
		myCar.setSpeed(79.2);
	}

}
