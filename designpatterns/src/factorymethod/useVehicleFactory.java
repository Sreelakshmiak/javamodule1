package factorymethod;

public class useVehicleFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle seltons =VehicleFactory.newInstance("seltons");
		seltons.honk();

		Vehicle Xcross =VehicleFactory.newInstance("seltons");
		Xcross.honk();
	}

}
