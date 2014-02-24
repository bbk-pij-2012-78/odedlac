package tests;

import vehicles.Airplane;
import vehicles.Flying;
import vehicles.LiftOff;

public class AirplaneFactory {

	public Airplane createAirplane(LiftOff liftOff, Flying fly) {
		return new Airplane(liftOff, fly);
	}

}
