package java10;

class Book{
	protected int number;
	protected String title;
	protected String author;
	
	public void setNumber(int n) {
		number = n;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setTitle(String t) {
		title = t;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setAuthor(String a) {
		author = a;
	}
	
	public String getAuthor () {
		return author;
	}
	
	public Book() {
		
	}
	
	public Book(int n , String t ,String a ) {
		number = n;
		title = t;
		author = a;
	}
	
	public boolean equals(Book o) {
		if (this.getNumber() == o.getNumber()) {
			return true;
		}
		else 
			return false;
	}
}

 class Novel extends Book{
	 public Novel (int n , String t, String a) {
		 	number = n;
			title = t;
			author = a;
	 }
	 
	 public int getLateFees(int d) {
		 return 300 * d;
	 }
 }
 
 class Poet extends Book{
	 public Poet(int n, String t, String a) {
		 	number = n;
			title = t;
			author = a;
	 }
	 public int getLateFees(int d) {
		 return 200 * d;
	 }
 }
 
 class ScienceFiction extends Book{
	 public ScienceFiction(int n, String t, String a) {
		 	number = n;
		 	title = t;
		 	author = a;
	 }
	 public int getLasteFees(int d) {
		 return 600 * d;
	 }
 }
 

public class BookTest {
	public static void main (String args[]) {
		Novel n1 = new Novel(1,"�Ҽ�1","����1");
		Novel n2 = new Novel(2,"�Ҽ�2","����2");
		Poet p1 = new Poet(3,"��1","����3");
		Poet p2 = new Poet(4, "��2" , "����4");
		ScienceFiction s1 = new ScienceFiction(5,"��1","����5");
		ScienceFiction s2 = new ScienceFiction(5,"��1","����5");
		
		if(n1.equals(n2)) {
			System.out.println("å ��ȣ : " + n1.getNumber() + " å ���� : " + n1.getTitle() + " å ���� :" + n1.getAuthor() );
			System.out.println("�̹� ���� å�� ������ ����߽��ϴ�.");
		}
		else {
			System.out.println("å ��ȣ : " + n1.getNumber() + " å ���� : " + n1.getTitle() + " å ���� :" + n1.getAuthor() );
			System.out.println("å ��ȣ : " + n2.getNumber() + " å ���� : " + n2.getTitle() + " å ���� :" + n2.getAuthor() );
		}
		
		if(s1.equals(s2)) {
			System.out.println("å ��ȣ : " + s1.getNumber() + " å ���� : " + s1.getTitle() + " å ���� :" + s1.getAuthor() );
			System.out.println("�̹� ���� å�� ������ ����߽��ϴ�.");
		}
		else {
			System.out.println("å ��ȣ : " + s1.getNumber() + " å ���� : " + s1.getTitle() + " å ���� :" + s1.getAuthor() );
			System.out.println("å ��ȣ : " + s2.getNumber() + " å ���� : " + s2.getTitle() + " å ���� :" + s2.getAuthor() );
		}

	}
}
