package structural.adapter.wrap;

import structural.adapter.phoneifaces.LightningPhone;
import structural.adapter.phoneifaces.MicroUsbPhone;

public class LighthingToMicroUsbAdapter implements MicroUsbPhone {
	
	  private final LightningPhone lightningPhone;

	    public  LighthingToMicroUsbAdapter(LightningPhone lightningPhone) {
	        this.lightningPhone = lightningPhone;
	    }

	@Override
	public void recharge() {
		// TODO Auto-generated method stub
		  lightningPhone.recharge();
	}

	@Override
	public void useMicrousb() {
		// TODO Auto-generated method stub
		  System.out.println("MicroUsb connected");
	        lightningPhone.useLightning();
	}

}
