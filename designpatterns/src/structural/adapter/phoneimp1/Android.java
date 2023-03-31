package structural.adapter.phoneimp1;

import structural.adapter.phoneifaces.MicroUsbPhone;

public class Android implements MicroUsbPhone {
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
	public void useMicrousb() {
		// TODO Auto-generated method stub
		connector=true;
		System.out.println("micro usb connected");
	}



}
