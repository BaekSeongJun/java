package java05;

class Date{
	private int year;
	private String month;
	private int day;
	
	public Date() {
		month = "1월";
		day = 1;
		year = 2009;
	}
	
	public Date(int year, String month, int day) {
		setDate(year,month,day);
	}
	public Date(int year) {
		setDate(year, "1월", 1);
	}
	public Date(String month, int day) {
		setDate(2009,month,day);
	}
	
	public void setDate(int year, String month, int day) {
		this.month = month;
		this.day = day;
		this.year = year;
	}
}
public class DateTest {
	public static void main(String[] args) {
		Date date1 = new Date(2009,"3월",2);
		Date date2 = new Date(2010);
		Date date3 = new Date();
		Date date4 = new Date("3월",11);
	}

}
