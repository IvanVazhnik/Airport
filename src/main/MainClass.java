package main;

import logic.LogicClass;
import plane.Airport;
import plane.PlaneType;
import print.Print;
import creators.XMLParser;

public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		System.out.println(Airport.buildPlane(PlaneType.PASSANGER));
		System.out.println(Airport.buildPlane(PlaneType.FREIGHT));
		
		//	XMLParser parser = new XMLParser();
	//	Airport airport = Airport.getAirportInstance();
	//	Print print = new Print();
	//	LogicClass lc = new LogicClass();
		
	//	parser.parse();
	//	print.getInfo(airport.getAirliners(), airport.getFreighters());		
	//	lc.findPlanesByFuel(airport.getAirliners(), airport.getFreighters(), 700, 900);
	//	lc.sortAirliners(airport.getAirliners());
	//	lc.capacitySeating(airport.getAirliners(),airport.getFreighters());

	}

}
