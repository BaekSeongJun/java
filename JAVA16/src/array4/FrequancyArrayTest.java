package array4;

public class FrequancyArrayTest {
	public static void main(String[] args) {
		FrequancyArray f = new FrequancyArray();
		int[] a = {1, 2, 3, 399, 28843, 32423, 333, 321, 2};
		//int[] b = f.frequancy(a);
		int[] c = f.generate(a);
		//int[] d = f.mysort(a);
		print(a);
		//print(b);
		print(c);
		//print(d);
	}
	public static void print(int[] array) {
		System.out.print("{" + array[0]);
		for(int i = 1; i < array.length; i++) 
			System.out.print(", " + array[i]);
		System.out.println("}");
		}
	
}
