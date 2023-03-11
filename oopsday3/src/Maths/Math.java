package Maths;

public class Math implements MathIface {

	
	private double a;
	private double b;
	private int n;
	//private int p;
	
	public Math()
	{
		
	}
	
	public Math(double a, double b) {

		this.a = a;
		this.b = b;
		//this.n = n;
	}
	
	public Math(int n) {

//		this.a = a;
//		this.b = b;
		this.n = n;
	}
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}


	public double getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("a + b="+(a+b));

	}

	@Override
	public void sub() {
		System.out.println("a - b="+(a-b));
		// TODO Auto-generated method stub

	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		System.out.println("a / b = "+(a/b));

	}

	@Override
	public void mul() {
		System.out.println("a * b = "+(a*b));
		// TODO Auto-generated method stub

	}
	
	public void fact() {
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
	
		}
		System.out.println("fact  of "+n+" : "+fact);
		// TODO Auto-generated method stub

	}

	
	

	
}
