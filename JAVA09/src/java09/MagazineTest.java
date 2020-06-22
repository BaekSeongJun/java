package java09;

class Book {
	private String name;
	private int pages;
	private String author;
	
	public void setName(String name) {
		this.name =name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPages(int p) {
		pages = p;
	}
	
	public int getPages() {
		return pages;
	}
	
	public void setAuthor(String a) {
		author = a;
	}
	
	public String getAuthor() {
		return author;
	}
}

class Magazine extends Book{
	private String date;
	
	public void setDate(String d) {
		date = d;
	}
	
	public String getDate() {
		return date;
	}
}

public class MagazineTest {
	public static void main(String[] args) {
		Magazine m = new Magazine();
		m.setName("Power Java");
		m.setPages(700);
		m.setAuthor("ȫ�浿");
		m.setDate("2015-11-23");
		
		System.out.println("���� : " + m.getName());
		System.out.println("������ �� : " + m.getPages());
		System.out.println("���� : " + m.getAuthor());
		System.out.println("������ : " + m.getDate());
	}

}
