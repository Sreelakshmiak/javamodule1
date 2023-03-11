package oopsday2;

public class Car implements CarIface {
	
	private double fuel;
	private double battery;
	private double kilometers;
	private boolean enginestatus;
	

	public Car(double fuel, double battery, double kilometers, boolean enginestatus) {
		super();
		this.fuel = fuel;
		this.battery = battery;
		this.kilometers = kilometers;
		this.enginestatus = enginestatus;
	}
	

	public double getFuel() {
		return fuel;
	}


	public void setFuel(double fuel) {
		this.fuel = fuel;
	}


	public double getBattery() {
		return battery;
	}


	public void setBattery(double battery) {
		this.battery = battery;
	}


	public double getKilometers() {
		return kilometers;
	}


	public void setKilometers(double kilometers) {
		this.kilometers = kilometers;
	}


	public boolean isEnginestatus() {
		return enginestatus;
	}


	public void setEnginestatus(boolean enginestatus) {
		this.enginestatus = enginestatus;
	}


	@Override
	public void start() {
		if(enginestatus==false && fuel>1000 && battery>100)
		{
			System.out.println("Engine starting ..");
			enginestatus=true;
		}
		// TODO Auto-generated method stub

	}

	@Override
	public void honk() {
		// TODO Auto-generated method stub
		System.out.println("pa..pa ...pam");
	}

	@Override
	public void moove() {
		if(enginestatus)
		{
			for(int i=0;i<50;i++)
			{
				System.out.println("car is moving ..");
				fuel=fuel-10;
				battery=battery-2;
				kilometers++;
				try {
					Thread.sleep(1000);// single thread model
					
				}
				catch(InterruptedException e)
				
				{
					e.printStackTrace();
				}
			}
		}
		// TODO Auto-generated method stub

	}

	@Override
	public void changeGear() {
		// TODO Auto-generated method stub

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("car is stopping..");
		this.enginestatus=false;
	}


	@Override
	public String toString() {
		return "Car [fuel=" + fuel + ", battery=" + battery + ", kilometers=" + kilometers + ", enginestatus="
				+ enginestatus + "]";
	}
	

}
