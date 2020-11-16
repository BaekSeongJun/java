package Bag;

class Node {
	Object data;
	Node next;
	public Node() {
		
	}
	
	public Node(Object data) {
		this.data = data;
	}
}
public class ArrayBag implements Bag{
	private Node start;
	private Node p = start = new Node();
	private int count = 0;
	
	public boolean contains(Object object) {
		for(p = start; p.next != null; p = p.next) {
			if(p.data.equals(object))
				return true;
		}
		// TODO Auto-generated method stub
		return false;
	}

	public Object getFirst() {
		// TODO Auto-generated method stub
		return start.next;
	}

	public Object getNext() {
		// TODO Auto-generated method stub
		return p.next;
	}

	public int size() {
		count = 0;
		for(p = start; p.next != null; p = p.next) {
			count++;
		}
		// TODO Auto-generated method stub
		return count;
	}

	public void add(Object object) {
		p.next = new Node(object);
		p = p.next;
		// TODO Auto-generated method stub
		
	}

	public boolean remove(Object object) {
		Node l = new Node();
		for(p = start; p.next != null; p = p.next) {
			if(p.next.data.equals(object)) {
				l= p.next.next;
				p.next = l;
				break;
			}
				
		}
		// TODO Auto-generated method stub
		return false;
	}

	public void print() {
		for(p = start; p.next != null; p = p.next)
			System.out.print(p.next.data + " ");
		// TODO Auto-generated method stub
		System.out.println();
	}

}
