package java01;

import java.util.Scanner;

public class Metro {
	public static void main(String args[]) {
		boolean iscapital;
		int citizens;
		int riches;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Դϱ�?(���� : 1 �����ƴ� : 0)");
		iscapital = (sc.nextInt() ==1 ) ? true : false;
		System.out.print("�α�(���� : �鸸 )");
		citizens = sc.nextInt();
		System.out.print("������ �� (���� : �鸸)");
		riches = sc.nextInt();
		
		boolean isMetro = (iscapital && citizens >= 100) || (riches >= 50);
		System.out.println("��Ʈ�������� ���� : "+isMetro);
		
	}
}
