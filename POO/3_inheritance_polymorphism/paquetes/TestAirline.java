package test;

import airport.cdmx.Airline;
import flotilla.airplane.Airplane;
import flotilla.airplane.Motor;

public class TestAirline {
	public static void main (String [] args){
		Airline mexicana = new Airline();
		mexicana.airplanes.add(new Airplane(4));
		mexicana.airplanes.add(new Airplane(2));
		mexicana.airplanes.add(new Airplane(3));

		for (Airplane air : mexicana.airplanes){
			System.out.println(air);
			for (Motor m : air.motors){
				m.start();
				m.stop();
			}
		}
	}
}
