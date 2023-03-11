package oopsday4.Polymorphism;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Shape s=new Rectangle(10.25,72.32);
double result=s.area();
System.out.println(result);

	s=new Circle(10.56);
	result=s.area();
	System.out.println(result);
	
	s=new Squre(55);
	result=s.area();
	System.out.println(result);
	}

}
