package array;

public class TestJavaUtilArrays {
	public static void main(String[] args) {
		int[] a = {77, 44, 55, 22, 99, 66, 33, 88};
		print(a);
		java.util.Arrays.sort(a);
		print(a);
		test(a,55);
		test(a,60);
		test(a,88);
		test(a,90);

	}
	
	static void test(int[] array,int target) {
		int i = java.util.Arrays.binarySearch(array, target);
		System.out.print("target=" + target + ", i = " + i );
		if(i >= 0)
			System.out.println("\ta[" + i + "]=" + array[i]);
		else
			System.out.println("\tInsert" + target + " at a [" + (-i-1) + "]");
	}
	
	public static void print(int[] objects){
		System.out.print("{" + objects[0]);
		for(int i = 1; i <objects.length; i++)
			System.out.print("," + objects[i]);
		System.out.println("}");
	}
	

}
