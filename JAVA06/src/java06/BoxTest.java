package java06;

class Box {
	private int width;
	private int length;
	private int height;
	
	int getVolume() {
		return width * length * height;
	}
	
	public void setWidth(int w) {
		width = w;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setLength(int l) {
		length = l;
	}
	
	public int getLength() {
		return length;
	}
	
	public void setHeight(int h) {
		height = h;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setBox(int w, int l , int h) {
		this.setWidth(w);
		this.setLength(l);
		this.setHeight(h);
	}
	
	public void setBox(int w, int l) {
		this.setWidth(w);
		this.setLength(l);
	}
}
public class BoxTest {
	public static void main(String args[]) {
		Box box1 =new Box();
		box1.setBox(100, 100, 100);
		System.out.println(box1.getVolume());
		
		Box box2 = new Box();
		box2.setBox(200, 200, 200);
		box2.setBox(150, 150);
		
		System.out.println("box1 의 가로 : " + box1.getWidth());
		System.out.println("box1 의 세로 : " + box1.getLength());
		System.out.println("box1 의 높이 : " + box1.getHeight());
		
		System.out.println("box2 의 가로 : " + box2.getWidth());
		System.out.println("box2 의 세로 : " + box2.getLength());
		System.out.println("box2 의 높이 : " + box2.getHeight());
		
		
	}

}
