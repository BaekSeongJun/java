package Java14;

public interface AdtSet {
	public boolean contains(Object object);
	public Object getFirst();
	public Object getNext();
	public int size();
	public boolean add(Object object);
	public boolean remove(Object object);
}
