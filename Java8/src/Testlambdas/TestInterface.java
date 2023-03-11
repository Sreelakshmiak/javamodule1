package Testlambdas;

public interface TestInterface {
	public double methods();
	
	public default void methods2() {
		System.out.println("from method");
		
		
	}
	
	public static void methods3() {
		System.out.println("from static method");
		
		
	}
}
