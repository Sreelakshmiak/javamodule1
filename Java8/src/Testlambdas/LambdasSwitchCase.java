package Testlambdas;

public class LambdasSwitchCase {
public static double calculate(String operator,double x, double y)
{
	return switch(operator)
		{
		case "+" -> x+y;
		case "-" -> x-y;
		case "*" -> x*y;
		case "/" -> {
			if(y==0) {
				throw new IllegalArgumentException("can't devide");
				
			}
			yield x/y;
			
		}
		default -> throw new IllegalArgumentException("unknown");
	};

	
}
public static void main(String[] args) {
	System.out.println(calculate("+", 3.6,4.6));
	System.out.println(calculate("-", 3.6,4.6));
	System.out.println(calculate("*", 3.6,4.6));
	System.out.println(calculate("/", 3.6,4.6));
}

}
