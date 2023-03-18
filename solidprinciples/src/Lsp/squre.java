package Lsp;

public class squre implements Shape {
	private int side;

	public squre(int side) {
		//super();
		this.side = side;
	}

	public int getArea() {
		// TODO Auto-generated method stub
		return this.side*this.side;
	}

}
