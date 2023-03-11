package shape;

public class Rec implements ShapeIrect {
	
	public Rec(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	public double length;
	public double width;
	@Override
	public void area() {
		System.out.println(length*width);
		// TODO Auto-generated method stub

	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}

}
