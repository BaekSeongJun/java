package array2;

public class Max {
	public static int max(int[] a) {
		int m = 0;
		for(int i = 1; i < a.length; i++)
			if(a[i] > a[m])
				m = i;
		
		return m;
	}
	
	public static void swap(int[] a,int i, int j) {
		int ai = a[i], aj =a[j];
		if(ai == aj)return;
		a[i] = aj;
		a[j] = ai;
	}
	public static void main(String[] args) {
		int[] a = {10, 6, 12, 9, 11};
		System.out.println(a[max(a)]);
		swap(a,1,3);
		for(int i = 0; i <a.length; i++) {
			System.out.println(a[i]);
		}
		
	}

}
