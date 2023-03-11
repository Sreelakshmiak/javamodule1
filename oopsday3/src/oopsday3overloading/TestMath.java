package oopsday3overloading;

public class TestMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Math math=new Math();
			int result =math.add(10,20);
			System.out.println(result);
			
			result =math.add(10,20,20);
			System.out.println(result);
			
			double result0 =math.add(10.0,20.0);
			System.out.println(result0);
			
			double result1 =math.add(10.0,4.5,9.0);
			System.out.println(result1);
			
			result0=math.add(10L,20L);
			System.out.println("LONG "+result0);
			
			result0=math.add(10,25f,10f);
			System.out.println("float "+result0);
	}

}
