package java01;

public class UnaryOperator {
	public static void main(String arga[]) {
		int x = 1;
		int y = 1;
		
		int nextx = ++x;
		int nexty = y++;
		System.out.println("nextx : "+nextx); //2
		System.out.println("nexty : "+nexty); //1
		System.out.println("x : "+x); //2
		System.out.println("y : "+y); //2
		
		int backx = --x;
		int backy = y--;
		
		System.out.println("backx : "+backx); //1
		System.out.println("backy : "+backy); //2
		System.out.println("x : "+x); //1
		System.out.println("y : "+y); //1
		}
	

}
