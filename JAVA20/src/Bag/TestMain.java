package Bag;

public class TestMain {
	public static void main(String args[]) {
		ArrayBag arrayBag = new ArrayBag();
		
		arrayBag.add("CA");
		arrayBag.add("US");
		arrayBag.add("MX");
		arrayBag.add("RU");
		arrayBag.add("US");
		arrayBag.add("MX");
		arrayBag.print();
		
		System.out.println("Size : " + arrayBag.size() + "\n");
		
		arrayBag.remove("US"); arrayBag.print();
		arrayBag.remove("MX"); arrayBag.print();
		arrayBag.remove("RU"); arrayBag.print();
		System.out.println("Size : " + arrayBag.size());
		
	}

}
