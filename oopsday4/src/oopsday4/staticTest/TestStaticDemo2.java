package oopsday4.staticTest;

public class TestStaticDemo2 {
	

	public static void main(String[] args) {
		StaticDemo2 d1=new StaticDemo2();
		d1.method();
		d1.method2();
		StaticDemo2.method();
		double result=Math.PI*2*5.5*5.5;
		System.out.println(Math.PI);
		System.out.println(Math.E);

	}

}
