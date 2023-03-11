package oopsday2;

public class Carfactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car car=new Car(5000,500,0,false);
car.start();
car.moove();
car.honk();
car.stop();
System.out.println(car);
	}

}
