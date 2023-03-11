package FunctinalInterfaces;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String>map=new HashMap<>();
		map.put("ola", "o");
		map.put("chae", "c");
		
		
		map.forEach((k,v)->
		System.out.println(k+" for "+v));
		
		
		BiConsumer<String,String>bi=(k,v)->
		System.out.println(k+" for "+v);
		map.forEach(bi);
	};

}

