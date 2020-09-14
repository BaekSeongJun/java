package array3;

public class ArrayTest {
	public static void main(String[] args) {
		int[][] b = { {22, 44, 66, 88} ,
				{0, 0, 0, 0} ,
				{33, 55, 77, 0}};
		
		for(int i = 0; i < b.length; i++) {
			for(int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j] + " ");
			}
		}
	}

}
