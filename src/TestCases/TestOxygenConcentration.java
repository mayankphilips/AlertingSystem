package TestCases;
import static org.junit.Assert.*;

import org.junit.Test;

import RunningCode.VitalCheckModule;

public class TestOxygenConcentration {
	VitalCheckModule test = new VitalCheckModule();

	@Test
	public void testOxygenNormalLevel1() {
		
		
		int result = test.oxygenCheck(91);
		assertEquals(0,result);
	}
	
	@Test
	public void testOxygenNormalLevel2() {
		
		int result = test.oxygenCheck(92);
		assertEquals(0,result);
	}
	
	@Test
	public void testOxygenNormalLevel3() {

		
		int result = test.oxygenCheck(99);
		assertEquals(0,result);
	}
	
	@Test
	public void testOxygenNormalLevel4() {

		
		int result = test.oxygenCheck(100);
		assertEquals(0,result);
	}
	
	
	
	@Test
	public void testOxygenLowLevel1() {
			
		int result = test.oxygenCheck(69);
		assertEquals(1,result);
	}
	
	@Test
	public void testOxygenLowLevel2() {
	
		int result = test.oxygenCheck(70);
		assertEquals(1,result);
	}
	
	@Test
	public void testOxygenLowLevel3() {
		
		
		int result = test.oxygenCheck(71);
		assertEquals(1,result);
	}
	
	@Test
	public void testOxygenLowLevel4() {
	
		
		int result = test.oxygenCheck(89);
		assertEquals(1,result);
	}
	
	@Test
	public void testOxygenLowLevel5() {
		
		
		int result = test.oxygenCheck(90);
		assertEquals(1,result);
	}
	

}
