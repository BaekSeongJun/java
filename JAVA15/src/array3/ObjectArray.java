package array3;

public class ObjectArray {
	public static void main(String[] args) {
		String s = "Mercury";
		Float x = new Float(3.14159);
		java.util.Date d = new java.util.Date();
		int[] a = new int[] {11, 33, 55, 77, 99};
		Object[] objects = {s,x,d,a};
		print(objects);
	}
	
	public static void print(Object[] objects){
		System.out.print("{" + objects[0]);
		for(int i = 1; i <objects.length; i++)
			System.out.print("," + objects[i]);
		System.out.println("}");
	}
}
