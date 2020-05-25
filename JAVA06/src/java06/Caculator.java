package java06;

public class Caculator {
	private int Num1;
	private int Num2;
	
	public int add() {
		return Num1 + Num2 ;	
	}
	
	public int sub() {
		return Num1 - Num2;
	}
	
	public int mul() {
		return Num1 * Num2;
	}
	
	public int div() {
		if (Num1 > Num2) {
			return Num1 / Num2;
		}
		else
			return Num2 / Num1;
	}
	
	public void setNum(int x) {
		Num1 = x;
	}
	
	public void setNum(int x, int y) {
		Num1 = x;
		Num2 = y;
	}

	public static void main(String args[]) {
		Caculator c = new Caculator();
		c.setNum(10, 2);
		System.out.println(c.add());
		System.out.println(c.sub());
		System.out.println(c.mul());
		System.out.println(c.div());
		
		
		
	}
}
