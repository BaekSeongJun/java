package array4;

public class equals {
	public static int find(int[] a, int x) {
		for(int i = 0; i <a.length; i++) {
			if(a[i] == x)
				return i;
		}
		return -1;
	}
	
	public static  void main(String[] args) {
		int[] a = {11, 22, 33, 44, 55};
		System.out.println(find(a,33));
		System.out.println(find(a,10));
	}

}
