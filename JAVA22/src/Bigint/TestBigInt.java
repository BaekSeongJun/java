package Bigint;

public class TestBigInt {
	public static void main(String[] args) {
		BigInt x = new BigInt(25);
		BigInt y = new BigInt(8);
		BigInt z = x.times(y);
		System.out.println("25 * 8 = " + x.times(y));
	}

}
