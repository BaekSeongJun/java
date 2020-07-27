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
		Novel n1 = new Novel(1,"소설1","저자1");
		Novel n2 = new Novel(2,"소설2","저자2");
		Poet p1 = new Poet(3,"시1","저자3");
		Poet p2 = new Poet(4, "시2" , "저자4");
		ScienceFiction s1 = new ScienceFiction(5,"공1","저자5");
		ScienceFiction s2 = new ScienceFiction(5,"공1","저자5");
		
		if(n1.equals(n2)) {
			System.out.println("책 번호 : " + n1.getNumber() + " 책 제목 : " + n1.getTitle() + " 책 저자 :" + n1.getAuthor() );
			System.out.println("이미 같은 책의 정보를 출력했습니다.");
		}
		else {
			System.out.println("책 번호 : " + n1.getNumber() + " 책 제목 : " + n1.getTitle() + " 책 저자 :" + n1.getAuthor() );
			System.out.println("책 번호 : " + n2.getNumber() + " 책 제목 : " + n2.getTitle() + " 책 저자 :" + n2.getAuthor() );
		}
		
		if(s1.equals(s2)) {
			System.out.println("책 번호 : " + s1.getNumber() + " 책 제목 : " + s1.getTitle() + " 책 저자 :" + s1.getAuthor() );
			System.out.println("이미 같은 책의 정보를 출력했습니다.");
		}
		else {
			System.out.println("책 번호 : " + s1.getNumber() + " 책 제목 : " + s1.getTitle() + " 책 저자 :" + s1.getAuthor() );
			System.out.println("책 번호 : " + s2.getNumber() + " 책 제목 : " + s2.getTitle() + " 책 저자 :" + s2.getAuthor() );
		}

	}
}
