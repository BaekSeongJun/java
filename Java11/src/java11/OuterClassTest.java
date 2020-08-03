package java11;

class OuterClass{
	private String secret = "Time is Money";
	
	public OuterClass() {
		InnerClass obj = new InnerClass();
		obj.print();
	}
	
	private class InnerClass{
		public InnerClass() {
			System.out.println("���� Ŭ���� �������Դϴ�.");
		}
		
		public void print() {
			System.out.println(secret);
		}
	}
}

public class OuterClassTest {
	public static void main(String args[]) {
		new OuterClass();
	}

}
