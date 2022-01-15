package com.designpattern.decorator;

public class DecoratePrinter implements Printer {

	private Printer printer;
	
	
	
	public DecoratePrinter(Printer printer) {
		super();
		this.printer = printer;
	}

	@Override
	public void assemblePrinter() {
		printer.assemblePrinter();

	}

}
