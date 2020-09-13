package array5;

public class TestBinarySearch {
	public static void main(String[] args) {
		int[] a = {22, 33, 44, 55, 66, 77 ,88, 99 };
		System.out.println("search(a," + 55 + ")" + serach(a,55));
		System.out.println("search(a," + 50 + ")" + serach(a,50));
		
	}
	
	static int serach(int[] a, int x) {
		int p = 0, q = a.length-1;
		while(p <= q) {
			int i = (p+q)/2;
			if(a[i] == x) return i;
			if(a[i] < x) p = i+1;
			else
				q = i-1;
		}
		return -p-1;
	}

}
