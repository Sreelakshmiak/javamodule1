package oopsday1;

public class Carfactory {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//main will create software object
		Car jag=new Car();
		//jag car type
		jag.color="red";
		jag.brand="TATA";
		jag.model="nexon";
		jag.price=3000000;
		
		System.out.println(jag.color);
		System.out.println(jag.brand);
		System.out.println(jag.model);
		System.out.println(jag.price);
		
		
		Car bmw=new Car();
		bmw.color="black";
		bmw.model="laxury suv";
		bmw.brand="BMW";
		bmw.price=8000000;
		
		System.out.print(bmw.color);
		System.out.print(bmw.brand);
		System.out.println(bmw.model);
		System.out.println(bmw.price);
		bmw=jag;
	}

}
