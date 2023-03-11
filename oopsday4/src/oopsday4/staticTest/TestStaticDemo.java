package oopsday4.staticTest;

public class TestStaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StaticDemo.a);	
		
		
	//static means shared
		
		
	StaticDemo d=new StaticDemo();
	System.out.println(d.a);
	StaticDemo d1=new StaticDemo();
	System.out.println(d1.a);
	//d.a=20;
	StaticDemo d2=new StaticDemo();
	System.out.println(d2.a);
	
	System.out.println(StaticDemo.a);	
	}
//every object will have separate copy of the member
}
