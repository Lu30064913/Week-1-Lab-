package com.designpattern.decorator;

public class ColorPrinter extends DecoratePrinter {

	public ColorPrinter(Printer printer) {
		super(printer);
	}
	
	@Override
	public void assemblePrinter() {
			super.assemblePrinter();
			System.out.println("Adding color features to the printer");
	}

}
