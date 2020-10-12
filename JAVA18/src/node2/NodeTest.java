package node2;

class Node{
	int data;
	Node next;
	
	public Node(int data) {
		this.data = data;
	}
	Node(int data, Node next){
		this.data = data;
		this.next = next;
}}

public class NodeTest {
	 static Node insert(Node start, int x) {
		if(start == null || start.data > x) {
			start = new Node(x,start);
			return start;
		}
		Node p = start;
		while(p.next != null){
			if(p.next.data > x) break;
			p = p.next;
		}
		p.next = new Node(x,p.next);
		return start;
	}
	
	public static void main(String args[]) {
		Node start;
		Node p = start = new Node(22);
		p.next = new Node(33);
		start = insert(start,20);
		for(p = start; p != null; p = p.next)
			System.out.println(p.data);
	}

}
