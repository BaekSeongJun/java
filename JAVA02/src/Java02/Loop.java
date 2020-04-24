package Java02;

public class Loop {
	public static void main(String args[]) {
		int n = 12;
		while(n > 0) {
			n = n -2;
			if(n == 6)
				break;
			System.out.println(n);
		}
		int m = 12;
		while(m > 0 ) {
			m = m - 2;
			if(m == 6)
				continue;
			
			System.out.println(m);
		}
	}

}
