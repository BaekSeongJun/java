package Alarm;

public class TestAlarm {
	public static void main(String[] args) {
		MyAlarm alarm = new MyAlarm();
		alarm.Day();
		alarm.hour();
		alarm.min();
		
		System.out.println(alarm.getTime());
		
		System.out.println(alarm.ChangeAmPm());
		
		System.out.println(alarm.getTime());
		
	}
}
