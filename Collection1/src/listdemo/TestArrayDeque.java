package listdemo;

import java.util.ArrayDeque;
import java.util.Iterator;

public class TestArrayDeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<String> queue= new ArrayDeque<>();
		queue.addLast("first");
		queue.addLast("second");
		queue.addLast("third");
		queue.addLast("fourth");
		queue.addLast("fifth");
		
		System.out.println(queue);
		System.out.println(queue.size());
		
		String element= queue.peek();//getting and removing the first element
		System.out.println(element);
		
		queue.poll();//poll remove
		System.out.println(queue);
		
		Iterator<String> iter =queue.iterator();
		
	}

}
