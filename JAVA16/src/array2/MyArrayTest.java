package array2;

public class MyArrayTest {
	public static void main(String[] args) {
		int[] a;
		MyArrays m = new MyArrays();
		a = m.randomInts(5, 100);
		m.print(a);
		m.isSorted(a);
		m.swap(a, 2, 4);
		a = m.resize(a, 4).clone();
		m.print(a);
	}

}
