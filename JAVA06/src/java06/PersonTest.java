package java06;

class Person {
	private String lastname;
	private String firstname;
	
	String getLastname() {
		return lastname;
	}
	
	String getFirstname() {
		return firstname;
	}
	
	public Person(String lastname, String firstname) {
		this.lastname = lastname;
		this.firstname = firstname;
	}
	
	public String buildname() {
		return String.format("%s %s\n" , this.getLastname(), this.getFirstname());
	}
}

public class PersonTest {
	public static void main(String[] args) {
		Person person = new Person("ȫ","�浿");
		System.out.println(person.buildname());
	}

}
