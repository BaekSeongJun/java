package Bag;

public interface bag {
	public boolean contains(Object object);
	public Object getFirst();
	public Object getNext();
	public int size();
	public void add(Object object);
	public boolean remove(Object object);
}
