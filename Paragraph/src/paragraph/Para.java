package paragraph;

import java.util.HashMap;
import java.util.Map;

//import java.util.HashMap;

public class Para {
	public static void main(String[] args) {
		
	
	String a="java is very easy language . language it is very beautiful";
	HashMap<String, Integer> map = new HashMap<String, Integer>();
	String[] string = a.split(" ");
	for (String words : string )
	{Integer count = map.get(words);
	if (count == null){count = 0;
	}
	map.put(words, count + 1);
	}
	for (int i = 0; i< string .length; i++)
	{
		System.out.println(string[i]);
		
	}System.out.println(map);
	System.out.println(" ");
	
	
	int intee =12321;
	String str=intee+"";
	StringBuilder sb=new StringBuilder(str);
	sb.reverse();
	System.out.println(sb);
	boolean result=str.equals(sb.toString());
	System.out.println(result);
	}
	
	
	
}