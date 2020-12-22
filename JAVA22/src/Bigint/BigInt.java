package Bigint;

public class BigInt {
	private Node start;
	
	private static class Node{
		int digit;
		Node next;
		Node(int digit){this.digit = digit;	}
		
	}
	public BigInt(int n) {
		if(n < 0) throw new IllegalArgumentException(n+"< 0");
		start = new Node(n%10);
		Node p = start;
		n /= 10;
		while(n>0) {
			p= p.next = new Node(n%10);
			n /= 10;
		}
	}
	
	public BigInt(String n) {
		if(n.length() == 0) throw new IllegalArgumentException("empty string");
		start = new Node(digit(n, n.length()-1));
		Node p = start;
		for(int i = n.length()-2; i >= 0; i-- )
			p = p.next = new Node(digit(n,i));
	}
	
	private int digit(String s, int i) {
		String ss = s.substring(i,i+1);
		return Integer.parseInt(ss);
	}
	
	public String toString() {
		StringBuffer buf = new StringBuffer(Integer.toString(start.digit));
	      Node p = start.next;
	      while(p != null) {
	         buf.insert(0, Integer.toString(p.digit));
	         p = p.next;
	      }
	      return buf.toString();
	}
	
	public BigInt times(BigInt y) {
		Node p = this.start;
		Node q = y.start;
		BigInt z = null;
		Node r = start;
		String s;
		int t = 0;
		while(p.next != null) {
			if(t == 0) {
				r = new Node(p.digit * q.digit % 10);
				t = p.digit * q.digit / 10;
			}
			else {
				r = new Node((p.digit * q.digit +t) % 10);
				t = (p.digit * q.digit + t) / 10;
			}
			r = r.next;
			p = p.next;
		}
		s = r.toString();
		
		return z = new BigInt(s);
		/*Node p = this.start;
		Node q = y.start;
		Node r = start;
		int count = 1;
		int t = 0;
		BigInt z ;
		while(p.next != null) {
			while(q.next != null) {
				if(t == 0) {
					r.next = new Node(p.digit * q.digit % 10);
					t = p.digit *q.digit / 10 ;
				}
				else if(p.digit *q.digit %10 + t < 10){
					r.next = new Node(p.digit *q.digit %10 + t);
					t = p.digit *q.digit / 10 ;
					
				}
				else {
					r.next = new Node((p.digit *q.digit %10 + t) %10);
					t = p.digit *q.digit / 10 + 1 ;
					}
				count++;
			q = q.next;
			}
			p = p.next;
		}
		
		z = new BigInt();
	return z;*/	
	}

}
