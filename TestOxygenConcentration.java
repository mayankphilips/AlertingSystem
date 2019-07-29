import static org.junit.Assert.*;

import org.junit.Test;

public class TestOxygenConcentration {

	@Test
	public void testOxygenNormalLevel1() {
		vitalCheck test = new vitalCheck();
		
		int result = test.oxygenCheck(91);
		assertEquals(0,result);
	}
	
	@Test
	public void testOxygenNormalLevel2() {
		vitalCheck test = new vitalCheck();
		
		int result = test.oxygenCheck(92);
		assertEquals(0,result);
	}
	
	@Test
	public void testOxygenNormalLevel3() {
		vitalCheck test = new vitalCheck();
		
		int result = test.oxygenCheck(99);
		assertEquals(0,result);
	}
	
	@Test
	public void testOxygenNormalLevel4() {
		vitalCheck test = new vitalCheck();
		
		int result = test.oxygenCheck(100);
		assertEquals(0,result);
	}
	
	
	
	@Test
	public void testOxygenLowLevel1() {
		vitalCheck test = new vitalCheck();
		
		int result = test.oxygenCheck(69);
		assertEquals(1,result);
	}
	
	@Test
	public void testOxygenLowLevel2() {
		vitalCheck test = new vitalCheck();
		
		int result = test.oxygenCheck(70);
		assertEquals(1,result);
	}
	
	@Test
	public void testOxygenLowLevel3() {
		vitalCheck test = new vitalCheck();
		
		int result = test.oxygenCheck(71);
		assertEquals(1,result);
	}
	
	@Test
	public void testOxygenLowLevel4() {
		vitalCheck test = new vitalCheck();
		
		int result = test.oxygenCheck(89);
		assertEquals(1,result);
	}
	
	@Test
	public void testOxygenLowLevel5() {
		vitalCheck test = new vitalCheck();
		
		int result = test.oxygenCheck(90);
		assertEquals(1,result);
	}
	

}
