package Methodrefs;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

interface Formula{
	public void m1();
}
class some{
	public static void m2() {
		System.out.println("from m2...");
	}
}
class Other{
	Other(){
		System.out.println("from other constructor");
	}
}
public class TestMethodsRefs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=null;
		String str2="hello";
		//Optional<String>optional=Optional.of(str);
		Optional<String>optional2=Optional.ofNullable(str);
		if(optional2.isPresent())
		{
			System.out.println("value is  present "+optional2.get());
			}
		//System.out.println(optional.get());
		// }
		
		//when str is used we will get no such element exception
		else
			//System.out.println("its null"+optional2.get());
			System.out.println("its null"+optional2.orElse(" str not initilized"));
		//if(optional.isEmpty())
		// System.out.println("value is not present");
		//else
		// System.out.println("value is present");}}
		}}