package java03;

import java.util.Scanner;

public class Day {
	public static void main(String args[]) {
		int year, month, day, total_days = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��Ͻÿ� : ");
		year = sc.nextInt();
		System.out.print("���� �Է��Ͻÿ� : ");
		month = sc.nextInt();
		System.out.print("���� �Է��Ͻÿ� : ");
		day = sc.nextInt();
		
		total_days += (year-1900)*365;
		total_days += (year-1900)/4;
		
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ) {
			if(month == 1 || month == 2)
				total_days -= 1;
		}
		
			
		for(int i = 1; i < month ; i++ ) {
			if(i == 2)
				total_days += 28  ;
			else if (i == 4 || i == 6 || i == 9 || i == 11)
				total_days += 30 ;
			else
				total_days += 31 ;
		}
		total_days += day;
		switch (total_days % 7) {
		case 0:
			System.out.println("�Ͽ���");
			break;
		case 1:
			System.out.println("������");
			break;
		case 2:
			System.out.println("ȭ����");
			break;
		case 3:
			System.out.println("������");
			break;
		case 4:
			System.out.println("�����");
			break;
		case 5:
			System.out.println("�ݿ���");
			break;
		case 6:
			System.out.println("�����");
			break;
		}

	}

}
