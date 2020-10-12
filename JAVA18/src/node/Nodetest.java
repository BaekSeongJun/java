package node;

	class Node{
		public int data;
		public Node next;
		
		public Node(int data) {
			this.data = data;
		}
	}

public class Nodetest {
	public static void insert(Node start, int x) {
		Node q = new Node(x);
		for(Node p = start; p.next != null; p = p.next) {
			if(p.data < x && p.next.data > x) {
				q.next = p.next;
				p.next = q;
			}
		}
	}
	public static void main(String args[]) {
		Node start;
		Node p = start = new Node(22);
		//System.out.println(p.data);
		/*for(int i = 0; i < 4; i++) {
			p = p.next = new Node(33+11*i);
			//System.out.println(p.data);
		}*/
		p.next = new Node (33);
		p = p.next;
		p.next = new Node (44);
		p = p.next;
		p.next = new Node(55);
		p = p.next;
		insert(start,50);
		for(p = start; p != null; p =p.next)
			System.out.println(p.data);
		/*Node p = start;
		p.next = new Node(33);
		System.out.println(p.data);
		p = p.next;
		p.next = new Node(44);
		System.out.println(p.data);
		p = p.next;
		p.next =new Node(55);
		System.out.println(p.data);
		p = p.next;
		p.next = new Node(66);
		System.out.println(p.data);
		System.out.println(p.next.data);*/
	}

}
