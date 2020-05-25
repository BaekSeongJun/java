package java06;

class Box1{
	private int width;
	private int length;
	private int height;
	private boolean empty;
	private static int boxes = 0;
	
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
	public void setEmpty(boolean e) {
		empty = e;
	}
	public String getEmplty() {
		return empty ? "비어있음" : "비어있지 않음";
	}
	
	public Box1(int w, int l, int h, boolean e) {
		this.setWidth(w);
		this.setLength(l);
		this.setHeight(h);
		this.setEmpty(e);
		boxes += 1;
	}
	public Box1() {
		this.setWidth(1);
		this.setLength(1);
		this.setHeight(1);
		this.setEmpty(true);
		boxes += 1;
	}
	public static int getBoxes() {
		return boxes;
	}
	
}

public class BoxTest2 {
	public static void main(String args[]) {
		Box1 b1, b2, b3, b4;
		b1 = new Box1(10, 20, 30, true);
		b2 = new Box1();
		b3 = new Box1(30, 15, 20, false);
		b4 = new Box1(19, 19, 19, true);
		
		System.out.println(Box1.getBoxes());
	}

}
