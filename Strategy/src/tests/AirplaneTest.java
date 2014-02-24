/**
 * 
 */
package tests;

import static org.junit.Assert.*; 

import org.junit.Test;
import vehicles.Airplane;
import vehicles.Flying;
import vehicles.LiftOff;


/**
 * @author oded
 *
 */
public class AirplaneTest {
	

	@Test
	public void test1() {
				
		String expectedOutput = "Like a fighter jet";
		String stringReturned = null;
		AirPlaneFactory harrierFactory = new HarrierFactory();
		
		Flying fly = harrierFactory.createFlying();
		LiftOff liftOff = harrierFactory.createLiftOff();

		Airplane classUnderTest = new Airplane(liftOff,fly);

		stringReturned = classUnderTest.howDoYouFly();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

		}

	
	@Test
	public void test2() {
				
		String expectedOutput = "I don't Fly";
		String stringReturned = null;
		AirPlaneFactory dontFlyFactory = new DontFlyFactory();
		
		Flying fly = dontFlyFactory.createFlying();
		LiftOff liftOff = dontFlyFactory.createLiftOff();

		Airplane classUnderTest = new Airplane(liftOff,fly);

		stringReturned = classUnderTest.howDoYouFly();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

		}
	
	@Test
	public void test3() {
				
		String expectedOutput = "Like a passenger airplane";
		String stringReturned = null;
		AirPlaneFactory passengerFactory = new PassengerFactory();
		
		Flying fly = passengerFactory.createFlying();
		LiftOff liftOff = passengerFactory.createLiftOff();

		Airplane classUnderTest = new Airplane(liftOff,fly);

		stringReturned = classUnderTest.howDoYouFly();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

		}
	
	
	@Test
	public void test4() {
				
		String expectedOutput = "Vertically";
		String stringReturned = null;
		AirPlaneFactory harrierFactory = new HarrierFactory();
		
		Flying fly = harrierFactory.createFlying();
		LiftOff liftOff = harrierFactory.createLiftOff();

		Airplane classUnderTest = new Airplane(liftOff,fly);

		stringReturned = classUnderTest.howDoYouLiftOff();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

		}
	
	@Test
	public void test5() {
				
		String expectedOutput = "I don't LiftOff";
		String stringReturned = null;
		AirPlaneFactory dontFlyFactory = new DontFlyFactory();
		
		Flying fly = dontFlyFactory.createFlying();
		LiftOff liftOff = dontFlyFactory.createLiftOff();

		Airplane classUnderTest = new Airplane(liftOff,fly);

		stringReturned = classUnderTest.howDoYouLiftOff();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

		}

	@Test
	public void test6() {
				
		String expectedOutput = "Vertically";
		String stringReturned = null;
		AirPlaneFactory harrierFactory = new HarrierFactory();
		
		Flying fly = harrierFactory.createFlying();
		LiftOff liftOff = harrierFactory.createLiftOff();

		Airplane classUnderTest = new Airplane(liftOff,fly);

		stringReturned = classUnderTest.howDoYouLiftOff();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

		}


}
