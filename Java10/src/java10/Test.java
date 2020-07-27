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
		System.out.println("TV가 켜졌습니다.");
		// TODO Auto-generated method stub

	}

	@Override
	public void turnOff() {
		System.out.println("TV가 꺼졌습니다.");
		
		// TODO Auto-generated method stub

	}

}
class Refrigerator implements RemoteControl{
	
	@Override
	public void turnOn() {
		System.out.println("냉장고가 켜졌습니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("냉장고가꺼졌습니다.");
	}
	
}
