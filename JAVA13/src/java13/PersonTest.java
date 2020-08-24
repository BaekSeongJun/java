package java13;

class Person implements Comparable{
	private String name;
	private int h;
	
	public Person() {
		name = "È«±æµ¿";
		h = 0;
		
	}
	public Person(String s, int i) {
		name = s;
		h = i;
	}
	
	@Override
	public int compareTo(Object o) {
		Person p = (Person) o;
		if (this.h > p.h)
			return 1;
		else if (this.h < p.h)
			return -1;
		else
			return 0;
	}
	
	public void printPerson() {
		System.out.println("ÀÌ¸§ : " + this.name + " Å° : " + this.h);
	}
	
}


public class PersonTest {
	static Person max;

	public static Person getMaximum(Person[] array) {
		Person p = new Person();
		for(int i = 0; i < 4; i++) {
			if(array[i].compareTo(p) >= 0 ) {
				p = array[i];
			}
		}
		return p;
	}
	
	public static void main(String[] args) {
		
		Person arrayOfPerson[] = new Person[5];
		arrayOfPerson[0] = new Person("±è³ª´Ï", 182);
		arrayOfPerson[1] = new Person("³ª±è´Ï", 129);
		arrayOfPerson[2] = new Person("´Ï³ª±è", 158);
		arrayOfPerson[3] = new Person("´Ï³ª±è", 163);
		arrayOfPerson[4] = new Person("ÇÒ¹Ì", 179);
		
		max = getMaximum(arrayOfPerson);
		max.printPerson();
	}
}
