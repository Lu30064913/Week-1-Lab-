package com.designpattern.decorator;

public class TestDecoratorPattern {

	public static void main(String[] args) {
				//Assemble Basic printer
				System.out.println("-----------Assemble Basic Printer-------------");
				Printer basicBike = new BasicPrinter();
				basicBike.assemblePrinter();
				
				//Decorate Basic Printer with color Feature
				System.out.println("-----------Decorate Basic Printer with multiple color Feature------------");
				Printer colorPrinter = new ColorPrinter(new BasicPrinter());
				colorPrinter.assemblePrinter();
				
				//Decorate Basic Printer with Color and Laser feature
				System.out.println("------Decorate Basic Pinter with Color and Laser feature-----");
				Printer colorLaserPrinter = new LaserPrinter(new ColorPrinter(new BasicPrinter()));
				colorLaserPrinter.assemblePrinter();

	}

}
