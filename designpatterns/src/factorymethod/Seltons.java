package factorymethod;

public class Seltons implements Vehicle {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("started ...."+getClass());

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("stopped ...."+getClass());

	}

	@Override
	public void honk() {
		// TODO Auto-generated method stub
		System.out.println("pom pom ...."+getClass());

	}

	@Override
	public void moov() {
		// TODO Auto-generated method stub
		System.out.println("its moving ...."+getClass());

	}

}
