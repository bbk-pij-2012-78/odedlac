package tests;

import vehicles.Flying;
import vehicles.IDontFly;
import vehicles.IFlyLikeFJ;
import vehicles.IFlyLikePP;

public class FlyingFactory {

	public Flying createFlying(String string) {
		if (string.equals("Fighter Jet")){
			return new IFlyLikeFJ();
		} else if (string.equals("Don't Fly")) {
			return new IDontFly();
		} else if (string.equals("Passenger Plane")) {
			return new IFlyLikePP();
		} 
		return null;
	}
}
