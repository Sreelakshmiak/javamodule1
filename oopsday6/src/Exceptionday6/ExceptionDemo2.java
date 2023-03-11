package Exceptionday6;

import java.util.InputMismatchException;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("program task started");

		try {
			int b = Integer.parseInt(args[0]);// "10"

			int a = Integer.parseInt(args[1]);
			int c=a/b;
			
			String name = args[2];
			int data[] = { a, b };
		}

//args known as command line arguments
		catch (ArithmeticException e) {
			// TODO: handle exception
			e.printStackTrace();
			
		} 
		
		catch (NumberFormatException e) {
			e.printStackTrace();
		}
		catch(Exception e) {//exception is an object
			e.printStackTrace();
		}
		System.out.println("program task completed");
	}
}
