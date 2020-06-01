package java07;

import java.util.Scanner;

class Employee {
	private String name;
	private String address;
	private int money;
	private String num;
	
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	public void setAddress(String a) {
		address = a;
	}
	public String getAddress() {
		return address;
	}
	public void setMoney(int m) {
		money = m;
	}
	public int getMoney() {
		return money;
	}
	public void setNum(String n) {
		num = n;
	}
	public String getNum() {
		return num;
	}
}
public class EmployeeTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int NUM_EMP = 3;
		Employee[] employees = new Employee[NUM_EMP];
		for(int i = 0; i < NUM_EMP; i++) {
			employees[i] = new Employee();
			System.out.print("직원이름을 입력 : ");
			employees[i].setName(scan.next());
			System.out.print("직원주소를 입력 : ");
			employees[i].setAddress(scan.next());
			System.out.print("직원월급을 입력 : ");
			employees[i].setMoney(scan.nextInt());
			System.out.print("직원전화번호를 입력 : ");
			employees[i].setNum(scan.next());
		}
		
		for(int i = 0; i < NUM_EMP; i ++) {
			System.out.println("주소 : " + employees[i].getAddress() + " 이름  : " + employees[i].getName() + "월급 : " + employees[i].getMoney() + "전화번호 : " + employees[i].getNum()); 
		}
	}

}
