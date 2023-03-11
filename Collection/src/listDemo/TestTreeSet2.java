package listDemo;
import java.util.TreeSet;

import java.util.Iterator;
public class TestTreeSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet<String> bookSet= new TreeSet<>();
bookSet.add("java in nutshell");
bookSet.add("java complete reference ");
bookSet.add("thinking in java");
bookSet.add("java in 21 days");
bookSet.add("java for dummys");

//bookSet.add(null); cannot be added 
//	System.out.println(" ");

//bookSet.add(null);//exception occure- tree set doesnot allow null element
		System.out.println(bookSet);//print in sorted order
		
	System.out.println(" ");
		System.out.println(bookSet.size());
		
	System.out.println(" ");
		System.out.println(bookSet.contains("java in nutshell"));
		
	System.out.println(" ");
		bookSet.add("thinking in java");//no change..not allowed duplicate elements

			System.out.println(bookSet.size());

System.out.println(" ");

			for(String book:bookSet)
			{
				System.out.println(book);
			}

System.out.println(" ");
		Iterator<String> iter=bookSet.iterator();
			while(iter.hasNext())
			{
				System.out.println(iter.next());
			}
}

}
