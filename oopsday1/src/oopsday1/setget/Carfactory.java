package oopsday1.setget;

public class Carfactory {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//main will create software object
		Car jag=new Car();
		jag.setColor("red");
		jag.setPrice(3000000);
		jag.setBrand("tata");
		jag.setModel("nexon-1");
		
		
		System.out.println(jag.getColor());
		System.out.println(jag.getBrand());
		System.out.println(jag.getPrice());
		System.out.println(jag.getModel());
		
		
		
		
		//jag car type
//		jag.color="red";
//		jag.brand="TATA";
//		jag.model="nexon";
//		jag.price=3000000;
		
		/*
		 * System.out.println(jag.color); System.out.println(jag.brand);
		 * System.out.println(jag.model); System.out.println(jag.price);
		 */
		Car bmw=new Car(); 
		 bmw.setColor("black");
		 bmw.setBrand("BMW");
		 bmw.setModel("laxuary suv");
		 bmw.setPrice(80000000);
		
		 System.out.println(bmw.getColor());
			System.out.println(bmw.getBrand());
			System.out.println(bmw.getPrice());
			System.out.println(bmw.getModel());
			
		/*
		 * Car bmw=new Car(); bmw.color="black"; bmw.model="laxury suv";
		 * bmw.brand="BMW"; bmw.price=8000000;
		 */
		
		
		
		
		/*
		 * System.out.print(bmw.color); System.out.print(bmw.brand);
		 * System.out.println(bmw.model); System.out.println(bmw.price); bmw=jag;
		 */
	}

}
