package Main;

public class Main {
	private int m = 22;
	public Main() {
		Nested nested = new Nested();
		System.out.println("Outside of Nested; nested.n = " + nested.n);
		nested.f();
	}
	public static void main(String[] args) {
		new Main();
	}
	private class Nested{
		private int n = 44;
		private void f() {
			System.out.println("Inside of Nested; m = " + m);
		}
	}

}
