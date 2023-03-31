package factorymethod;

public class VehicleFactory {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
	
	public static Vehicle newInstance(String car)
	{
		Vehicle vehicle=null;
		  
		 if(car==null)
			 return null;
		 
		 else if(car.equals("Seltons"))
			 vehicle =new Seltons();
		 
		 else if(car.equals("Xcross"))
		 
			 vehicle= new Xcross();
		 	return vehicle;
	}

}
