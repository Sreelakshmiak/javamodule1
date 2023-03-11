package listDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> colors=new ArrayList<String>();
		//colors.add((String) new Object;
		//colors.add(new Double("10.9"));//not applicable for the double.
		colors.add("blue");
		colors.add("green");
		colors.add("red");
		colors.add("orange");
		
		
		colors.add(null);
		colors.add(null);
		
		
		
		System.out.println(colors.size());
		System.out.println(colors);
		String str=colors.get(3);
		System.out.println(str);
	}

}