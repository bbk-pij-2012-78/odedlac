/**
 * 
 */
package tests;

import static org.junit.Assert.*; 

import org.junit.BeforeClass;
import org.junit.Test;

import vehicles.Airplane;
import vehicles.Flying;
import vehicles.LiftOff;


/**
 * @author oded
 *
 */
public class AirplaneTest {

	private static FlyingFactory flyingFactory;
	private static LiftOffFactory liftOffFactory;
	private static AirplaneFactory airplaneFactory;
	
	@BeforeClass
	public static void onlyOnce(){
		flyingFactory = new FlyingFactory();
		liftOffFactory = new LiftOffFactory();
		airplaneFactory = new AirplaneFactory();
	}

	
	
	@Test
	public void test1() {
				
		String expectedOutput = "Like a fighter jet";
		String stringReturned = null;
		
		Flying fly = flyingFactory.createFlying("Fighter Jet");
		LiftOff liftOff = liftOffFactory.createLiftOff("Lift Off V");  //new ILiftOffV();

		Airplane classUnderTest = new Airplane(liftOff,fly);

		stringReturned = classUnderTest.howDoYouFly();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

		}

	
	@Test
	public void test2() {
				
		String expectedOutput = "I don't Fly";
		String stringReturned = null;
		
		Flying fly = flyingFactory.createFlying("Don't Fly");
		LiftOff liftOff = liftOffFactory.createLiftOff("Lift Off V"); //new ILiftOffV();

		Airplane classUnderTest = airplaneFactory.createAirplane(liftOff,fly);

		stringReturned = classUnderTest.howDoYouFly();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

		}
	
	@Test
	public void test3() {
				
		String expectedOutput = "Like a passenger airplane";
		String stringReturned = null;
		
		Flying fly = flyingFactory.createFlying("Passenger Plane");
		LiftOff liftOff = liftOffFactory.createLiftOff("Lift Off V");

		Airplane classUnderTest = airplaneFactory.createAirplane(liftOff,fly);

		stringReturned = classUnderTest.howDoYouFly();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

		}
	
	
	@Test
	public void test4() {
				
		String expectedOutput = "Vertically";
		String stringReturned = null;

		Flying fly = flyingFactory.createFlying("Fighter Jet");  //new IFlyLikeFJ();
		LiftOff liftOff = liftOffFactory.createLiftOff("Lift Off V"); //new ILiftOffV();

		Airplane classUnderTest = airplaneFactory.createAirplane(liftOff,fly);

		stringReturned = classUnderTest.howDoYouLiftOff();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

		}
	
	@Test
	public void test5() {
				
		String expectedOutput = "I don't LiftOff";
		String stringReturned = null;

		Flying fly = flyingFactory.createFlying("Fighter Jet");  //new IFlyLikeFJ();
		LiftOff liftOff = liftOffFactory.createLiftOff("Don't Lift Off"); //new IDontLiftOff();

		Airplane classUnderTest = airplaneFactory.createAirplane(liftOff,fly);

		stringReturned = classUnderTest.howDoYouLiftOff();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

		}

	@Test
	public void test6() {
				
		String expectedOutput = "Horizontally";
		String stringReturned = null;

		Flying fly = flyingFactory.createFlying("Fighter Jet");  //new IFlyLikeFJ();
		LiftOff liftOff = liftOffFactory.createLiftOff("Lift Off H"); //new ILiftOffH();

		Airplane classUnderTest = airplaneFactory.createAirplane(liftOff,fly);

		stringReturned = classUnderTest.howDoYouLiftOff();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

		}


}
