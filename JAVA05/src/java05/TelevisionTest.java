package java05;
class Television {
	private boolean isON;
	private int volume ;
	private int channel ;
	
	public void setChannel (int c) {
		channel = c;
	}
	public int getChannel() {
		return channel;
	}
	public void setVolume(int v) {
		volume = v;
	}
	public int getVolume() {
		return volume;
	}
	public boolean turnon() {
		isON = true;
		return isON;
	}
	public boolean trunoff() {
		isON = false;
		return isON;
		
	}
	public String toString() {
		return "���� ���´�" + (isON == true ? "����" : "����") + "���� ä���� "+channel +"���� �Ҹ�ũ��� "+volume;
	}
}
public class TelevisionTest {
	public static void main(String args[]) {
		Television t = new Television();
		t.turnon();
		t.setChannel(25);
		t.setVolume(10);
		System.out.println(t.toString());
	}
}
