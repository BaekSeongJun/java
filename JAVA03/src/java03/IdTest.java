package java03;

import java.util.Scanner;

public class IdTest {
	public static void main(String[] args) {
		String a = "a";
		String b;
		System.out.print("아이디를 입력하시오 : ");
		Scanner scn = new Scanner(System.in);
		b = scn.next();
		if(b.equals(a)) 
			System.out.println("아이디가 일치합니다.");
		else
			System.out.println("아이디가 일치하지 않습니다.");
		if(b == a) 
			System.out.println("아이디가 일치합니다");
		else
			System.out.println("아이디가 일치하지 않습니다.");
				
		}
	}

