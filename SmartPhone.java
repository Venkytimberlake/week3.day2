package week3.day2;

import week3.day1.AndroidPhone;

public class SmartPhone extends AndroidPhone {
	public void connectWhatsapp() {
		System.out.println("Connecting Whatsapp.....");
	}

	public static void main(String[] args) {
		// Executing all methods
		SmartPhone mySmart=new SmartPhone();
		mySmart.makeCall();
		mySmart.sendMsg();
		mySmart.saveContact();
		mySmart.takeVedio();
		mySmart.connectWhatsapp();
	}

}
