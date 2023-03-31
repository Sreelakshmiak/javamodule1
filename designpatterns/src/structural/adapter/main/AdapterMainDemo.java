package structural.adapter.main;

import structural.adapter.phoneifaces.LightningPhone;
import structural.adapter.phoneifaces.MicroUsbPhone;
import structural.adapter.phoneimp1.Android;
import structural.adapter.phoneimp1.Iphone;
import structural.adapter.wrap.LighthingToMicroUsbAdapter;

public class AdapterMainDemo {
	public static void rechargeMicroUsbPhone(MicroUsbPhone phone) {
		phone.useMicrousb();
		phone.recharge();
	}

	public static void rechargeLightningPhone(LightningPhone phone) {
		phone.useLightning();
		phone.recharge();
	}

	public static void main(String[] args) {
		Android android = new Android();
		Iphone iPhone = new Iphone();
		
		boolean result = android instanceof MicroUsbPhone;
		System.out.println(result);
		

		System.out.println("Recharging android with MicroUsb");
		rechargeMicroUsbPhone(android);

		System.out.println("Recharging iPhone with Lightning");
		rechargeLightningPhone(iPhone);

				
	
	System.out.println("Recharging iPhone with MicroUsb");
	    rechargeMicroUsbPhone(new LighthingToMicroUsbAdapter(iPhone));// call goes to  line#11
	}

}
