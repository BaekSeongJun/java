package java01;

import java.util.Scanner;
public class Caculator2 {
	public static void main(String args[]) {
		int x;
		int y;
		int v;
		int w;
		Scanner input = new Scanner(System.in);
		
		System.out.print("������ �Է��Ͻÿ� : ");
		x = input.nextInt();
		System.out.print("������ �Է��Ͻÿ� : ");
		y = input.nextInt();
		
		v = (x > y) ? (x/y) : (y/x);
		w = (x > y) ? (x%y) : (y%x);
		
		System.out.printf("%d�� %d�� ���� ���� %d�̰� �������� %d�Դϴ�.",(x > y)? x : y,(x > y)? y : x,v,w);
	}
}
