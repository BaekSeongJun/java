package java09;

class Animal {
	public void sound() {
		System.out.println("港港!");
	}
}

class Dog extends Animal {
	@Override
	public void sound() {
		System.out.println("港港!");
	}
}

public class DogTest {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.sound();
	}

}
