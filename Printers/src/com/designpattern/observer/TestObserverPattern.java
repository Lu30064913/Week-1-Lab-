package com.designpattern.observer;

public class TestObserverPattern {

	public static void main(String[] args) {
		
		Users user1 = new Users();
		user1.setUserName("Ram");
		
		Users user2 = new Users();
		user2.setUserName("Shiva");
		
		AccessPrinter HPJet = new AccessPrinter();
		HPJet.setPrinterName("HP Laser Jet");
		HPJet.setAvailable(false);
		
		HPJet.addObserver(user1);
		HPJet.addObserver(user2);
		
		// After sometime printer is available
		HPJet.setAvailable(true);
		
		//removing one user from queue
		HPJet.removeObserver(user2);
		HPJet.setAvailable(true);
	}

}
