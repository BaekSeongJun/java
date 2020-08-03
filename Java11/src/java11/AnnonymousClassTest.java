package java11;

interface RemoteControl2{
	void turnOn();
	void turnOff();
}

public class AnnonymousClassTest {
	public static void main(String args[]) {
		RemoteControl2 ac = new RemoteControl2() {
			public void turnOn() {
				System.out.println("TV turnOn()");
			}
			public void turnOff() {
				System.out.println("TV turnOff()");
			}
		};
		ac.turnOn();
		ac.turnOff();
	}

}
