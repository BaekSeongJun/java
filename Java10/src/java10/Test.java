package java10;

public class Test{
	public static void main(String[] args) {
		Televisoin t1 = new Televisoin();
		Refrigerator r1 = new Refrigerator();
		t1.turnOn();
		t1.turnOff();
		r1.turnOn();
		r1.turnOff();
	}
	
}

class Televisoin implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("TV�� �������ϴ�.");
		// TODO Auto-generated method stub

	}

	@Override
	public void turnOff() {
		System.out.println("TV�� �������ϴ�.");
		
		// TODO Auto-generated method stub

	}

}
class Refrigerator implements RemoteControl{
	
	@Override
	public void turnOn() {
		System.out.println("����� �������ϴ�.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("������������ϴ�.");
	}
	
}
