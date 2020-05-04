package java03;

import java.util.Scanner;

public class pie2 {
	public static void main(String args[]) {
		int i = 0;
		double pi = 0, k = 0, l = 0, m = 0;
		System.out.print("최대 반복 횟수를 입력하시오 :");
		Scanner scn = new Scanner(System.in);
		i = scn.nextInt();
		scn.close();
		for(int j = 1; j <= i; j++) {
			if(j == 1) {
				pi = 3;
			}
			else if(j %2 == 0) {
				pi = pi + 4.0/(k*l*m);
			}
			else {
				pi = pi - 4.0/(k*l*m);
			}
			k += 2;
			l = k + 1;
			m = l + 1;
		}
		System.out.println("pie : " + pi);
	}

}
