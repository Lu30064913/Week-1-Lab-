package com.designpattern.observer;

public class Users implements Observer{
	
	private Subject subject;
	private String userName;
	
	
	public Subject getSubject() {
		return subject;
	}


	public void setSubject(Subject subject) {
		this.subject = subject;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	@Override
	public void update(String printerName) {
		
		System.out.println("Hello "+userName+" Printer "+printerName+" is now available");
		
	}

}
