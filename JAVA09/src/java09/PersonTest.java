package java09;

class Person {
	private String name;
	private int age;
	
	public void setName(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int a) {
		age = a;
	}
	
	public int getAge() {
		return age;
	}
}

class Student extends Person{
	private int grade;
	
	public void setGrade(int g) {
		grade = g;
	}
	
	public int getGrade() {
		return grade;
	}
}

class Teacher extends Person{
	private String cl;
	
	public void setCl(String c) {
		cl = c;
	}
	
	public String getCl() {
		return cl;
	}
}

public class PersonTest {
	public static void main(String[] args) {
		Student s = new Student();
		s.setName("홍길동");
		s.setAge(20);
		s.setGrade(1);
		
		Teacher t = new Teacher();
		t.setName("임꺽정");
		t.setAge(40);
		t.setCl("컴퓨터");
		
		System.out.println("이름 : " + s.getName() + " 나이 : " + s.getAge() + " 학년 : " + s.getGrade());
		System.out.println("이름 : " + t.getName() + " 나이 : " + t.getAge() + " 과목 : " + t.getCl());
	}
}
