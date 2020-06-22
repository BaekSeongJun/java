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
		s.setName("ȫ�浿");
		s.setAge(20);
		s.setGrade(1);
		
		Teacher t = new Teacher();
		t.setName("�Ӳ���");
		t.setAge(40);
		t.setCl("��ǻ��");
		
		System.out.println("�̸� : " + s.getName() + " ���� : " + s.getAge() + " �г� : " + s.getGrade());
		System.out.println("�̸� : " + t.getName() + " ���� : " + t.getAge() + " ���� : " + t.getCl());
	}
}
