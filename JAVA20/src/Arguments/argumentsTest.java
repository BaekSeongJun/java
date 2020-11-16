package Arguments;

public class argumentsTest {
	public static void main(String args[]) {
		int argumentsSize = args.length;
		
		for(int i = 0; i < argumentsSize; i++) {
			System.out.println("args[" + i +"] : " + args[i]);
		}
	}

}
