package java07;

import java.util.Scanner;

public class ArrayTest4 {
	public static void main(String[] args) {
		int total = 0;
		int size;
		Scanner scan = new Scanner(System.in);
		System.out.print("�迭�� ũ�⸦ �Է��Ͻÿ� : ");
		size = scan.nextInt();
		int[] scores = new int[size];
		
		for(int i = 0; i < scores.length; i++ ) {
			System.out.print("������ �Է��Ͻÿ� : ");
			scores[i] = scan.nextInt();
		}
		for(int i = 0; i < scores.length; i++)
			total += scores[i];
		System.out.println("��� ������ " + total / scores.length + " �Դϴ�.");
	}

}
