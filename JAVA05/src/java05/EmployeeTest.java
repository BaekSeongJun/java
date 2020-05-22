package java05;

class Employee{
	private String name;
	private String phonenum;
	private int money;

	public void setname(String n) {
		name = n;
	}
	public String getname() {
		return name;
	}
	
	public void setphonenum(String s) {
		phonenum = s;
	}
	
	public String getphonenum(){
		return phonenum;
	}
	
	public void setmoney(int m) {
		money = m;
	}
	public int getmoney() {
		return money;
	}
}
public class EmployeeTest {
	public static void main(String args[]) {
		
		Employee MyEmp = new Employee();
		MyEmp.setname("직원");
		System.out.println("직원의 이름은 " + MyEmp.getname());
		MyEmp.setphonenum("010-123-4567");
		System.out.println("직원의 전화번호는 "+MyEmp.getphonenum());
		MyEmp.setmoney(100000);
		System.out.println("직원의 연봉은 " + MyEmp.getmoney());
	}
}
