package Another;
import Source.Parent;

public class SubClass extends Parent {
	public SubClass() {
		//System.out.println(a);
		//System.out.println(b);//ONCE THE PACKAGE OVER THE DEFAULT VARIABLE IS NOT VISIBLE 
		System.out.println(c);
		System.out.println(d);
	}
}
