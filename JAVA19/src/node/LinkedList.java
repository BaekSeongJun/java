package node;

	
public class LinkedList {
	private Node start;
	
	public void insert(int x) {
		if(start == null || start.data > x) {
			start = new Node(x,start);
		}
		Node p = start;
		while (p.next != null) {
			if(p.next.data > x) break;
			p = p.next;
		}
		p.next = new Node(x,p.next);
	}
	
	public void delete(int x) {
		if(start == null || start.data > x)
		if(start.data == x)
			start = start.next;
		for(Node p = start; p.next != null; p = p.next) {
			if(p.next.data > x)break;
			if(p.next.data == x) {
				p.next = p.next.next;
				break;
			}
		}
	}
		
	private static class Node{
		int data;
		Node next;
		Node(int data) {
			this.data = data;
			}
		Node(int data, Node next){
			this.data = data;
			this.next = next;
			
	}
}
}
