package com.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class AccessPrinter implements Subject {

	
	private String printerName;
	private List<Observer> listOfObservers = new ArrayList<Observer>();
	private boolean isAvailable;
	
	
	
	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
		if(isAvailable==true) {
			notifyObservers();
		}
	}

	public String getPrinterName() {
		return printerName;
	}

	public void setPrinterName(String printerName) {
		this.printerName = printerName;
	}

	public List<Observer> getListOfObservers() {
		return listOfObservers;
	}

	public void setListOfObservers(List<Observer> listOfObservers) {
		this.listOfObservers = listOfObservers;
	}

	@Override
	public void addObserver(Observer observer) {
		listOfObservers.add(observer);
		
	}

	@Override
	public void removeObserver(Observer observer) {
		listOfObservers.remove(observer);
		
	}

	@Override
	public void notifyObservers() {
		
		System.out.println("Notifying all requested users when printer is available");
		
		for(Observer observer : listOfObservers) {
			observer.update(printerName);
		}
		
	}

}
