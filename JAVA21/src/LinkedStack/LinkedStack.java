package LinkedStack;

import org.w3c.dom.Node;

public class LinkedStack implements Stack{
	private Node top;
	private int size;
	public boolean isEmpty() {
		return (size == 0);
	}

	public Object peek() {
		if (size == 0) throw new java.util.NoSuchElementException();
		// TODO Auto-generated method stub
		return top.object;
	}
	
	public Object pop() {
		if (size == 0) throw new java.util.NoSuchElementException();
		Object oldTop = top.object;
		top = top.next;
		--size;
		// TODO Auto-generated method stub
		return oldTop;
		
	}
	
	public void push(Object object) {
		top = new Node(object,top);
		++size;
		// TODO Auto-generated method stub
	}

	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
	
	private static class Node{
		Object object;
		Node next;
		Node(Object object, Node next){
			this.object = object;
			this.next = next;
		}
	}
}
