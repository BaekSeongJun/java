package hw;

import java.util.Scanner;

class Box {
	private int horizontal;
	private int vertical;
	private int height;
	private boolean empty;
	private static int boxes;
	
	public void setHorizontal(int h) {
		horizontal = h;
	}
	
	public int getHorizontal() {
		return horizontal;
	}
	
	public void setVertical(int v) {
		vertical = v;
	}
	
	public int getVertical() {
		return vertical;
	}
	
	public void setHeight(int h) {
		height = h;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setEmpty (boolean e) {
		empty = e;
	}
	
	public boolean getEmpty() {
		return empty;
	}
	
	public Box() {
		horizontal = 1;
		vertical = 1;
		height = 1;
		empty = true;
		boxes += 1;
	}
	
	public Box(int h, int v, int he, boolean e) {
		this.setHorizontal(h);
		this.setVertical(v);
		this.setHeight(he);
		this.setEmpty(e);
		boxes += 1;
	}
	
	public static int getBoxes() {
		return boxes;
	}
}

public class HW2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n , h, v, he ;
		boolean e;
		System.out.print("만들 상자의 갯수를 입력하세요.");
		n = sc.nextInt(); 
		Box[] boxes;
		boxes = new Box[n];
		for(int i = 0; i < n; i++) {
			System.out.println("가로 세로 높이 비어있는지에 대한 여부를 입력 해주세요 (ex 1 1 1 true) : ");
			h = sc.nextInt();
			v = sc.nextInt();
			he = sc.nextInt();
			e = sc.nextBoolean();
			boxes[i] = new Box(h,v,he,e);
		}
		System.out.println("박스의 개수 : " + boxes[n-1].getBoxes());
		
	}

}
