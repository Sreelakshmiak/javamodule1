package oopsday4.staticTest;

public class StaticDemo2 {
	static int a;
	static void method()
	{
		System.out.println("from method"+a);
	}
	static void method2()//is non-static
	{
		System.out.println(a);
		method();
	}
	public StaticDemo2() {
		
	}
	class TestInner{
		
	}
	
}
