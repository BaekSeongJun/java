package deleete;

class Node{
	public int data;
	public Node next;
	
	public Node(int data) {
		this.data = data;
	}

  Node delete(Node start,int x) {
	if(start == null || start.data > x)
		return start;
	if(start.data == x) 
		return start = start.next;
	for(Node p = start; p.next != null; p = p.next) {
		if(p.next.data > x)break;
		if(p.next.data == x) {
			p.next = p.next.next;
			break;
		}
	}
	return start;
 }
}

public class DeleteTest {
	public static void main(String args[]) {
		Node start;
		Node p = start = new Node(22);
		p.next = new Node(33);
		p = p.next;
		p.next = new Node(44);
		p = p.next;
		p.next = new Node(55);
		p = p.next;
		p.next = new Node(66);
		p = p.next;
		start = p.delete(start, 22);
		p.delete(start, 55);
		for(p = start; p != null; p =p.next)
			System.out.println(p.data);
		
	}

}
