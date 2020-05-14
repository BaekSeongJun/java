package java04;

class DeskLamp {
	private boolean isOn;
	
	public void turnOn() {
		isOn = true;
	}
	
	public void turnOff() {
		isOn = false;
	}
	
	public String toString() {
		return "���� ���´�" + (isOn == true ? "����" : "����");
	}
	
}
public class DeskLampTest {
	public static void main(String[] args) {
		DeskLamp myLamp = new DeskLamp();
		myLamp.turnOn();
		System.out.println(myLamp);
		myLamp.turnOff();
		System.out.println(myLamp);
	}
	
}
