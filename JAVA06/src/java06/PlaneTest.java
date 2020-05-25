package java06;

class Plane{
	private String make;
	private String model;
	private int max;
	
	public void setMake(String m) {
		make = m;
	}
	public String getMake() {
		return make;
	}
	
	public void setModel(String mo) {
		model = mo;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setMax(int ma) {
		max = ma;
	}
	
	public int getMax() {
		return max;
	}
	
	public Plane(String m , String mo) {
		this.setMake(m);
		this.setModel(mo);
		planes += 1;
	}
	
	public Plane(String m, String mo, int ma) {
		this.setMake(m);
		this.setModel(mo);
		this.setMax(ma);
		planes += 1;
	}
	
	private static int planes = 0;
	
	public static int getPlanes() {
		return planes;
	}
	
}
public class PlaneTest {
	public static void main(String[] args) {
		Plane p1, p2, p3;
		p1 = new Plane("A»ç","305",300);
		p2 = new Plane("B»ç","306");
		p3 = new Plane("V»ç","707",500);
		
		System.out.println(Plane.getPlanes());
	}

}
