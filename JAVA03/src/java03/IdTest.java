package java03;

import java.util.Scanner;

public class IdTest {
	public static void main(String[] args) {
		String a = "a";
		String b;
		System.out.print("���̵� �Է��Ͻÿ� : ");
		Scanner scn = new Scanner(System.in);
		b = scn.next();
		if(b.equals(a)) 
			System.out.println("���̵� ��ġ�մϴ�.");
		else
			System.out.println("���̵� ��ġ���� �ʽ��ϴ�.");
		if(b == a) 
			System.out.println("���̵� ��ġ�մϴ�");
		else
			System.out.println("���̵� ��ġ���� �ʽ��ϴ�.");
				
		}
	}

