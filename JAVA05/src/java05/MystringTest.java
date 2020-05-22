package java05;

class Mystring{
	String s = "Hello";
	
	public void Concat() {
		s = s.concat("World");
		System.out.println(s);
		
	}
	
	public void toUpperCase() {
		s = s.toUpperCase();
		System.out.println(s);
		
	}
	
	public void reverse() {
		String str = "";
		for(int i = s.length() - 1; i >= 0; i--) {
			str += s.charAt(i);
		}
		System.out.println(str);
	}
	
}


public class MystringTest {
	public static void main (String args[]) {
		Mystring myString = new Mystring();
		myString.Concat();
		myString.toUpperCase();
		myString.reverse();
	}

}
