package java09;

public class Human {
	private String name;
	
	public Human(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
	
	public static void main(String[] args) {
		Human h1 = new Human("����");
		Human h2 = new Human("����");
		Human h3 = new Human("���");
		if(h1.toString().equals(h2.toString())) {
			System.out.println("h1 �� h2�� �����ϴ�.");
		}
		else {
			System.out.println("h1�� h2�� �ٸ��ϴ�.");
		}
		if(h1 == h2) {
			System.out.println("h1�� h2�� �����ϴ�.");
		}
		else {
			System.out.println("h1�� h2�� �ٸ��ϴ�.");
		}
	}

}
