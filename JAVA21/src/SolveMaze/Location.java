package SolveMaze;

public class Location {
	private int x, y;
	public Location(int x, int y) {
		if(x < 0 || y < 0) throw new IllegalStateException("Location is wrong");
		this.x = x;
		this.y = y;
	}
	int getX() {
		return x;
	}
	int getY() {
		return y;
	}
}
