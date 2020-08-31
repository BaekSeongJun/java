package Alarm;

import java.util.Scanner;

public class MyAlarm implements Alarm{
	private String day;
	private int h, m;
	Scanner sc = new Scanner(System.in);
	
	public void Day() {
		while(true) {
			System.out.print("요일을 입력하세요.");
			day = sc.next();			
		if (day.equals("월")  || day == "화" || day == "수" || day == "목" || day == "금" || day == "토" || day == "일" ) {
			break;
		}
		else {
			System.out.println("요일을 잘못 입력하셨습니다. 다시 입력하세요");
			continue;
		}
	}
}
	public void hour() {
		while(true) {
			System.out.print("시간을 입력하세요.");
			h = sc.nextInt();
		if (h >= 0 && h < 24) {
			break;
		}
		else {
			System.out.println("시간을 잘못 입력하셨습니다. 다시 입력하세요");
			continue;
		}
		}
		}
	
	
	public void min () {
		while(true) {
			System.out.print("분을 입력하세요.");
			m = sc.nextInt();
		if(m >= 0 && m < 60) {
			break;
		}
		else {
			System.out.println("분을 잘못 입력하셨습니다. 다시 입력하세요");
			continue;}
		}
	}
	
	public String getTime() {
		return ("설정된 시간은  "  + day + "요일 " + h + "시" + m + "분 입니다.");
	}
	
	public String ChangeAmPm() {
		if(h >= 0 && h < 12 ) {
			h += 12;
		}
		else
			h -= 12;
		return ("오전 오후를 변경했습니다.");
	}
	
}
	

