package java03;

import java.util.Scanner;

public class Pie {
	public static void main(String args[]) {
		int j;
		double p = 0;
		double k = 1;
		
		
		System.out.print("최대자릿수 입력 : ");
		Scanner scn = new Scanner(System.in);
		j = scn.nextInt();
		
		for(int i = 1 ; i <= j; i++ ) {
			
			if (i % 2 == 0) {
				p = p - (double)(4/k);
				System.out.println("pie : " + p);
			}
			else{
				p = p + (double)(4/k);
				System.out.println("pie : " + p);
			}
			k += 2;
			
		}
		System.out.println("pie : " + p);
	}

}
