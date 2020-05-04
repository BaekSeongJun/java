package java03;

import java.util.Scanner;

public class PIbo {
	public static void main(String args[]) {
		int funi = 0;
		int funj = 1;
		int funk = 0;
		int j = 0;
		System.out.print("횟수를 입력하시오 :");
		Scanner scn = new Scanner(System.in);
		j = scn.nextInt();
		for(int i = 1; i <= j; i ++) {
			if(i == 1) {
				System.out.println(funi);
			}
			else if (i == 2) {
				System.out.println(funj);
			}
			else {
			funk = funi + funj ;
			funi = funj;
			funj = funk;
			System.out.println(funk);
			}
		}
	String s;}
}
