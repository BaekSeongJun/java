package hw;

import java.util.Scanner;

class Mymetric{
	private static double mile;
	private static double kilo;
	
	public static double kiolloToMile() {
		return  kilo * 0.621;
	}
	
	public static double mileToKilo () {
		return  mile * 1.609;
	}
	
	public void setMile (int m) {
		mile = (double) m;
	}
	
	public double getMile() {
		return mile;
	}
	
	public void setKilo(int k ) {
		kilo = (double) k;
	}
	
	public double getKilo() {
		return kilo;
	}
	
}

public class HW1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Mymetric m = new Mymetric(); 
		System.out.print("마일을 입력하세요 : ");
		m.setMile(sc.nextInt());
		System.out.print("킬로를 입력하세요 : ");
		m.setKilo(sc.nextInt());
		
		System.out.println(m.getKilo() + "를 Mile로 변환한 값은 " + m.kiolloToMile() );
		System.out.println(m.getMile() + "를 Kilo로 변환한 값은 " + m.mileToKilo());
	}

}
