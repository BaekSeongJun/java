package java09;

class Car2{
	private String model;
	public Car2(String model) {	this.model = model;}
	public boolean equals(Object obj) {
		if (obj instanceof Car2)
			return model.equals(((Car2) obj).model);
		else
			return false;
	}
}

public class CarTest2 {
	public static void main (String[] args) {
		Car2 firstCar = new Car2("aa");
		Car2 secondCar = new Car2("aa");
		if(firstCar.equals(secondCar)) {
			System.out.println("동일한 종류의 자동차입니다.");
		}
		else {
			System.out.println("동일한 종류의 자동차가 아닙니다.");
		}
		
		if(firstCar == secondCar) {
			System.out.println("동일한 종류의 자동차입니다.");
		}
		else {
			System.out.println("동일한 종류의 자동차가 아닙니다.");
		}
		
		System.out.println(firstCar.toString());
			
	}
}


