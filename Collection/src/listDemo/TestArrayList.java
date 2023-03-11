package listDemo;
import java.util.ArrayList;
import java.util.Iterator;
public class TestArrayList {

	public static void main(String[] args) {
	ArrayList flowers= new ArrayList();
	
	Object obj=flowers.get(2);
	if(obj instanceof Integer)
	{
		Integer in=(Integer) obj;
		System.out.println(in.MIN_VALUE);
	}
	else if(obj instanceof Double) {
		Double d=(Double) obj;
		System.out.println(d.MAX_VALUE);
		}
	else if(obj instanceof String) {
		String str=(String ) obj;
		System.out.println(str.toUpperCase());
	}
//	else if(obj instanceof new java.util.Date())
//			{
//		
//			}
	//flowers.add(new java.util.Date());
	
//	flowers.add(new Integer("1"));
//	flowers.add(new Double("10.10"));
//	
	flowers.add("thulip");
	flowers.add("rose");
	flowers.add("jasmine");
	flowers.add("lilly");
	flowers.add("cosmos");
	//String str= flowers.get(5); everything is converted to parent type
	String str= (String) flowers.get(1);
	System.out.println();
//	System.out.println(flowers);
//	System.out.println(" ");
//	System.out.println(flowers.get(2));//jasmine is printed
//	System.out.println(" ");
//	System.out.println(flowers.size());//length property
//	System.out.println(" ");
//	System.out.println(flowers.contains("Lilly"));// FALSE....CASE SENSITIVE
//
//	//flowers.add(2,"sunflower");
//	for(Object obj :flowers)
//	{
//		System.out.println(obj);
//	}
//	flowers.remove(2);
//	System.out.println(" ");
//	
//	System.out.println(flowers);
	System.out.println(" ");
//	
//	
//	Iterator iter=flowers.iterator();
//	
//	while(iter.hasNext())
//	{
//		System.out.println(iter.next());//printing elements
//	}
//	System.out.println(" ");
//	System.out.println("NORMAL PRINTING ");
//	System.out.println(" ");
	for(int i=0;i<flowers.size();i++) {
		System.out.println(flowers.get(i));
	}
	}

}
