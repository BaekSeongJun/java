package java03;

import java.util.Scanner;

public class IfElse {
	public static void main(String args[]) {
		int i, j, k;
		Scanner scn = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		i = scn.nextInt();
		System.out.print("������ �Է��ϼ��� : ");
		j = scn.nextInt();
		System.out.print("������ �Է��ϼ��� : ");
		k = scn.nextInt();
		
		if (i > j && i > k) {
			if(j > k) {
				System.out.printf("%d %d %d",k , j , i);
			}
			else
				System.out.printf("%d %d %d",j , k, i);
		}
		else if(i > j && i < k && j < k) {
			System.out.printf("%d %d %d",j, i, k);
		}
		else if( i < j && i > k && j > k) {
			System.out.printf("%d %d %d",k,i,j);
		}
		else if( i < j && i < k && j < k) {
			System.out.printf("%d %d %d",i , j , k);
			}
		else
			System.out.printf("%d %d %d", i, k ,j);
		}
}
