package java01;

import java.util.Scanner;
public class Caculator2 {
	public static void main(String args[]) {
		int x;
		int y;
		int v;
		int w;
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오 : ");
		x = input.nextInt();
		System.out.print("정수를 입력하시오 : ");
		y = input.nextInt();
		
		v = (x > y) ? (x/y) : (y/x);
		w = (x > y) ? (x%y) : (y%x);
		
		System.out.printf("%d를 %d로 나눈 몫은 %d이고 나머지는 %d입니다.",(x > y)? x : y,(x > y)? y : x,v,w);
	}
}
