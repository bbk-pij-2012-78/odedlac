package tests;

import vehicles.IDontLiftOff;
import vehicles.ILiftOffH;
import vehicles.ILiftOffV;
import vehicles.LiftOff;



public class LiftOffFactory {

	public LiftOff createLiftOff(String string) {
		if (string.equals("Lift Off V")){
			return new ILiftOffV();
		} else if (string.equals("Lift Off H")) {
			return new ILiftOffH();
		} else if (string.equals("Don't Lift Off")) {
			return new IDontLiftOff();
		}
		return null;
	}

}
