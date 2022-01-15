package com.designpattern.decorator;

public class LaserPrinter extends DecoratePrinter {

	public LaserPrinter(Printer printer) {
		super(printer);
		}
	@Override
	public void assemblePrinter() {
			super.assemblePrinter();
			System.out.println("Adding laser features to the printer");
	}
}
