package java08;

import java.util.Scanner;

class Student{
	public String name;
	public int num;
	public int scholarship;
	public static int id = 0;
	public static int count = 0;
	
	public Student(String n, int nu, int sch) {
		name = n;
		num = nu;
		scholarship = sch;
		id += 1;
		count += 1;
	}
	
	public Student(String n, int nu) {
		name = n;
		num = nu;
		id += 1;
		count += 1;
	}
	

}

class Manager {
	private int stdNum = 0;
	private Student[] students;
	private int[][] arrangement = new int[3][4];
	final int MAX = 12;
	
	public void setstdNum(int n) {
		if(n > MAX) {
			System.out.println("최대학생수를 넘기셨습니다.");
			stdNum = 0;
		}
		else
			stdNum = n;
	}
	
	public int getstdNum() {
		return stdNum;
	}
	
	public void setStudents() {
		students = new Student[stdNum];
		for(int i = 0; i < stdNum; i++) {
		System.out.println("학생의 이름, 번호 , 장학금을 순서대로 입력하세요. (ex. 민혜미 3 1000) ");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int num = sc.nextInt();
		int scho = sc.nextInt();
		students[i] = new Student(name,num,scho);
		arrangeStudent(students[i].num ,students[i].id);
		}
	}
	public void setStudnets() {
		students = new Student[stdNum];
		for(int i = 0; i < stdNum; i++) {
		System.out.println("학생의 이름, 번호 , 장학금을 순서대로 입력하세요. (ex. 민혜미 3 1000) ");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int num = sc.nextInt();
		students[i] = new Student(name,num);
		arrangeStudent(students[i].num ,students[i].id);
		}}
	
	public void inputStdNum() {
		while(stdNum == 0) {
		System.out.print("몇 명의 학생을 입력하시겠습니까? ");
		Scanner sc = new Scanner(System.in);
		setstdNum(sc.nextInt());
		}
		
	}
	
	public void arrangeStudent(int n , int m) {
		arrangement[(n-1)/4][(n-1)%4] = m;
	}
	
	public void getArrangement() {
		for(int i = 0; i <= 2; i++) {
			for(int j = 0; j <= 3; j++) {
				System.out.print(arrangement[i][j]);
			}
			System.out.println("");
		}
	}
	
}
public class StudentTest {
	public static void main(String[] args){
		Manager m = new Manager();
		m.inputStdNum();
		m.setStudents();
		m.getArrangement();
		
	}

}
