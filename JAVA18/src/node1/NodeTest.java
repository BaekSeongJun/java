package node1;

class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
	}
	
	Node(int data, Node next){
		this.data = data;
		this.next = next;
	}
}


public class NodeTest {
	static void insert(Node start, int x) {
		Node p = start;
		while(p.next != null) {
			if(p.next.data > x)break;
			p = p.next;
		}
		p.next = new Node(x, p.next);
	}
	
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
		insert(start,50);
		for(p = start; p != null; p = p.next) {
			System.out.println(p.data);
		}
		
	}

}
