package FunctinalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> strings= Arrays.asList("Andra prathesh","kerala","karnataka","telugana");
		
		Supplier<String>supplier =()->
		{
			return new String("hola");
		};
		System.out.println(supplier.get());
		
		
	}
//	public static void featchString(List<String>string)
//	
//	{
//		for(String str: strings) {
//			s.get();
//		}
//	}

}
