package java01;

import java.util.Scanner;

public class Metro {
	public static void main(String args[]) {
		boolean iscapital;
		int citizens;
		int riches;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수도입니까?(수도 : 1 수도아님 : 0)");
		iscapital = (sc.nextInt() ==1 ) ? true : false;
		System.out.print("인구(단위 : 백만 )");
		citizens = sc.nextInt();
		System.out.print("부자의 수 (단위 : 백만)");
		riches = sc.nextInt();
		
		boolean isMetro = (iscapital && citizens >= 100) || (riches >= 50);
		System.out.println("메트로폴리스 여부 : "+isMetro);
		
	}
}
