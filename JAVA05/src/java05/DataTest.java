package java05;

import java.util.Scanner;

class Data { 
	int year, month, day;
	
	public void print1() {
		System.out.println(year + "." + month + "." + day);
	}
	
	public void print2() {
		String stmon = " " ;
		switch(month) {
		case 1 : stmon = "Jan";
				break;
		case 2 : stmon = "Feb";
				break;
		case 3 : stmon = "";
				break;
		case 4 : stmon = "Apr";
				break;
		case 5 : stmon = "";
				break;
		case 6 : stmon = "Jun";
				break;
		case 7 : stmon = "July";
				break;
		}
		System.out.println(stmon + " " +day + ", " + year);
		}
}


public class DataTest {
	public static void main(String args[]) {
		Data da = new Data();
		System.out.print("년도를 입력해주세요 : ");
		Scanner sc = new Scanner(System.in);
		da.year = sc.nextInt();
		
		System.out.print("달을 입력해주세요 : ");
		da.month = sc.nextInt();
		
		System.out.print("일을 입력해주세요 : ");
		da.day = sc.nextInt();
		
		da.print1();
		
		da.print2();
		
	}
}
