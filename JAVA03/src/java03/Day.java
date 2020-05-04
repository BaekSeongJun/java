package java03;

import java.util.Scanner;

public class Day {
	public static void main(String args[]) {
		int year, month, day, total_days = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("연도를 입력하시오 : ");
		year = sc.nextInt();
		System.out.print("월을 입력하시오 : ");
		month = sc.nextInt();
		System.out.print("일을 입력하시오 : ");
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
			System.out.println("일요일");
			break;
		case 1:
			System.out.println("월요일");
			break;
		case 2:
			System.out.println("화요일");
			break;
		case 3:
			System.out.println("수요일");
			break;
		case 4:
			System.out.println("목요일");
			break;
		case 5:
			System.out.println("금요일");
			break;
		case 6:
			System.out.println("토요일");
			break;
		}

	}

}
