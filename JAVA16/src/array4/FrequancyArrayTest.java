package array4;

public class FrequancyArrayTest {
	public static void main(String[] args) {
		FrequancyArray f = new FrequancyArray();
		int[] a = {1,2,3,1,5,2,3};
		int[] b = f.frequancy(a);
		int[] c = f.generate(b);
		int[] d = f.mysort(a);
		print(a);
		print(b);
		print(c);
		print(d);
	}
	public static void print(int[] a) {
		System.out.print("{" + a[0]);
		for(int i = 1; i < a.length; i++) 
			System.out.print(", " + a[i]);
		System.out.println("}");
		}
	
}
