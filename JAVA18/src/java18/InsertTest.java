package java18;

public class InsertTest {

	static int[] insert(int[] a, int n, int x) {
		int i =0;
		while(i < n && a[i] <= x)
			++i;
		System.arraycopy(a,i,a,i+1,n-i);
		a[i] = x;
		return a;
	}
	
	static void print(int[] a) {
		System.out.print("{" + a[0]);
		 for(int i = 1; i <a.length - 1; i++) {
			 System.out.print("," + a[i]);
		 }
		 System.out.println("," + a[a.length-1] +"}" );
	}
	
	public static void main(String args[]) {
		int[] n = new int[6];
		n[0] = 1;
		n[1] = 3;
		n[2] = 5;
		n[3] = 7;
		n[4] = 9;
		int[] a = insert(n,5,8);
		print(a);
	}
}
