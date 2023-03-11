package oopsday4.Polymorphism;

public class Squre extends Shape{
	private double side;

	public Squre(double side) {
		super();
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	
	public double area()
	{
		return this.side*this.side;
		
	}

}
