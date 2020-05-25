package java06;

public class Complex {
	private double real;
	private double imag;

	public Complex(double r, double i) {
		real = r;
		imag = i;
	}
	
	double getReal() {
		return real;
	}
	
	double getImag() {
		return imag;
	}
	
	public Complex add(Complex c) {
		double resultReal = real + c.getReal() ;
		double resultImag = imag + c.getImag();
		return new Complex(resultReal, resultImag);
	}
}
