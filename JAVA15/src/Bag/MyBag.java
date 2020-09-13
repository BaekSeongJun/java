package Bag;

public class MyBag implements bag{
	int size , i , j;
	Object[] objects =new Object[100];

	public boolean contains(Object object) {
		for(int i = 0; i < size; i++) {
			if(objects[i].equals(object))
				return true;
		}
		// TODO Auto-generated method stub
		return false;
	}

	public Object getFirst() {
		i = 0;
		// TODO Auto-generated method stub
		return objects[i++];
	}

	public Object getNext() {
		return objects[i++];
		// TODO Auto-generated method stub
	}

	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	public void add(Object object) {
		objects[size] = object;
		size++;
		// TODO Auto-generated method stub
		
	}

	public boolean remove(Object object) {
		j = size;
		System.arraycopy(objects, i+1, objects, i, size-i-1);
		// TODO Auto-generated method stub
		if(size == j)
			return false;
		else
			return true;
	}
	

}
