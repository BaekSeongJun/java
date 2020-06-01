package java07;

public class ArrayTest6 {
	public static void main(String[] args) {
		int[][] array = { {10,20,30,40} , {50,60,70,80} , {90, 100, 110, 120} };
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.println(i + "За" + j + "ї­" + array[i][j]);
			}
		}
	}

}
