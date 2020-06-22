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
		Human h1 = new Human("춘향");
		Human h2 = new Human("춘향");
		Human h3 = new Human("사또");
		if(h1.toString().equals(h2.toString())) {
			System.out.println("h1 과 h2는 같습니다.");
		}
		else {
			System.out.println("h1과 h2는 다릅니다.");
		}
		if(h1 == h2) {
			System.out.println("h1과 h2는 같습니다.");
		}
		else {
			System.out.println("h1과 h2는 다릅니다.");
		}
	}

}
