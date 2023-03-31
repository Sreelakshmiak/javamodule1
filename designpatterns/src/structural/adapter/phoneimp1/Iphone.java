package structural.adapter.phoneimp1;

import structural.adapter.phoneifaces.LightningPhone;

public class Iphone implements LightningPhone {
	private	boolean connector;

	@Override
	public void recharge() {
		
		// TODO Auto-generated method stub
		if(connector) {
			System.out.println("recharge started");
			System.out.println("recharge finished");
		}
		else
		{
			System.out.println("connect micro usb");
		}

	}

	@Override
	public void useLightning() {
		// TODO Auto-generated method stub
		connector=true;
		System.out.println("Lightning  usb connected");
	}


}
