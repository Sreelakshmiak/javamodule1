package FunctinalInterfaces;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
public class TestFunctinalInterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		List<String> strings=
				Arrays.asList("Andra prathesh","kerala","karnataka","telugana");
		
		
		Function <String,Integer> f =(str)->{
			return str.length();
		
		
	};
	for(String str: strings)
	{
		System.out.println(f.apply(str));
	}
	System.out.println("buneos dias");
	Function<Integer, Integer>f2=(n)->{
		return n*n;
	};
	
Function<String,String> f3=(str)->{
	return str.toUpperCase();
	
};
System.out.println(f3.apply("ust global"));
}
}
