package java06;

import java.util.*;

class Employee {
	private String name;
	private double salary;
	int age;
	
	public Employee(String n, int a, double s) {
		name = n;
		age = a;
		salary = s;
	}
	public String getName() {
		return name;
	}
	
	private double getSalary() {
		return salary;
	}
	
	int getAge() {
		return age;
	}
}

public class EmployeeTest {
	public static void main(String args[]) {
		Employee e;
		e = new Employee("ȫ�浿",0,3000);
		//e.salary = 300;
		e.age = 26;
		//int sa = e.getSalary();
		String s = e.getName();
		int a = e.getAge();
	}

}
