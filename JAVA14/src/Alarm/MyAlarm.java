package Alarm;

import java.util.Scanner;

public class MyAlarm implements Alarm{
	private String day;
	private int h, m;
	Scanner sc = new Scanner(System.in);
	
	public void Day() {
		while(true) {
			System.out.print("������ �Է��ϼ���.");
			day = sc.next();			
		if (day.equals("��")  || day == "ȭ" || day == "��" || day == "��" || day == "��" || day == "��" || day == "��" ) {
			break;
		}
		else {
			System.out.println("������ �߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���");
			continue;
		}
	}
}
	public void hour() {
		while(true) {
			System.out.print("�ð��� �Է��ϼ���.");
			h = sc.nextInt();
		if (h >= 0 && h < 24) {
			break;
		}
		else {
			System.out.println("�ð��� �߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���");
			continue;
		}
		}
		}
	
	
	public void min () {
		while(true) {
			System.out.print("���� �Է��ϼ���.");
			m = sc.nextInt();
		if(m >= 0 && m < 60) {
			break;
		}
		else {
			System.out.println("���� �߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���");
			continue;}
		}
	}
	
	public String getTime() {
		return ("������ �ð���  "  + day + "���� " + h + "��" + m + "�� �Դϴ�.");
	}
	
	public String ChangeAmPm() {
		if(h >= 0 && h < 12 ) {
			h += 12;
		}
		else
			h -= 12;
		return ("���� ���ĸ� �����߽��ϴ�.");
	}
	
}
	

