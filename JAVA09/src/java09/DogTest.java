package java09;

class Animal {
	public void sound() {
		System.out.println("�۸�!");
	}
}

class Dog extends Animal {
	@Override
	public void sound() {
		System.out.println("�۸�!");
	}
}

public class DogTest {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.sound();
	}

}
