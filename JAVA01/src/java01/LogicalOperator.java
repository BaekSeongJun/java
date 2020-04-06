package java01;

public class LogicalOperator {
	public static void main(String args[]) {
		int x = 3;
		int y = 4;
		System.out.println((x==3) && (y==4)); //true
		System.out.println((x==3) || (y==5)); //true
		
		int max_value = (x > y) ? x : y;
		int min_value = (x < y) ? x : y;
		System.out.println(max_value); // 4
		System.out.println(min_value); // 3
	}

}
