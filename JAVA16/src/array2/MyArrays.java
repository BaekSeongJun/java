package array2;

public class MyArrays implements IntArray{

	@Override
	public boolean isSorted(int[] a) {
		for(int i = 1; i < a.length; i++) {
			if(a[i] < a[i-1])
				return false;
			}
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void print(int[] a) {
		System.out.print("{" + a[0]);
		for(int i = 1; i < a.length; i++) 
			System.out.print(", " + a[i]);
		System.out.println("}");
		// TODO Auto-generated method stub
		
	}

	private static java.util.Random random = new java.util.Random();
	public int[] randomInts(int n, int range) {
		int[] a = new int[n];
		for(int i = 0; i < a.length; i++)
			a[i] = random.nextInt(range);
		// TODO Auto-generated method stub
		return a;
	}

	@Override
	public int[] resize(int[] a, int n) {
		int[] an = new int[a.length + n];
		for(int i = 0; i < a.length; i++)
			an[i] = a[i];
		// TODO Auto-generated method stub
		return an;
	}

	@Override
	public void swap(int[] a, int i, int j) {
		int ai , aj;
		ai = a[i];
		aj = a[j];
		if(a[i] != a[j]) {
			a[i] = aj;
			a[j] = ai;
		}
		// TODO Auto-generated method stub
	}
	

}
