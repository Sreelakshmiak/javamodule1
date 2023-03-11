package listDemo;
import java.util.HashSet;

import java.util.Iterator;
public class TestHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<String> bookSet= new HashSet<>();
bookSet.add("java in nutshell");
bookSet.add("java complete reference ");
bookSet.add("thinking in java");
bookSet.add("java in 21 days");
bookSet.add("java for dummys");


bookSet.add(null);
bookSet.add(null);
bookSet.add(null);


//	System.out.println(" ");
		System.out.println(bookSet);
		
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
