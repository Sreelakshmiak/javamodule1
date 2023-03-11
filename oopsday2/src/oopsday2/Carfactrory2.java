package oopsday2;

public class Carfactrory2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// use interface for abstraction
		//CarIface car = new CarIface();
		
		
		//CarIface car; // create a reference .not referring to any object
		
		CarIface car=new Car(5000,500,0,false);
		System.out.println(car);
		car.start();
		car.honk();
		car.moove();
		car.stop();
		System.out.println(car);
		
		
	}

}
