package oopsday5;

public class TestFinal {
//forward reference
	
	int a=b;//b is forward referenced
	
	static int b=10;
	
	final double pie=3.14;
	//final - compile time constant 
	//final is not static 
	//final cannot be extended(no subclass
	//final methods cannot be override
	
	
	public TestFinal() {
		
	}

	public static void main(String[] args) {
		//System.out.println(pie);
	}
}
