import static org.junit.Assert.*;

import org.junit.Test;

public class TestPulseRate {

	@Test
	public void testPulseRateNormal1() {
		
			vitalCheck test = new vitalCheck();
			
			int result = test.pulseRateCheck(50);
			assertEquals(0,result);
		}
	
	@Test
	public void testPulseRateNormal2() {
		
			vitalCheck test = new vitalCheck();
			
			int result = test.pulseRateCheck(51);
			assertEquals(0,result);
		}
	
	@Test
	public void testPulseRateNormal3() {
		
			vitalCheck test = new vitalCheck();
			
			int result = test.pulseRateCheck(99);
			assertEquals(0,result);
		}
	
	@Test
	public void testPulseRateNormal4() {
		
			vitalCheck test = new vitalCheck();
			
			int result = test.pulseRateCheck(100);
			assertEquals(0,result);
		}
	
	@Test
	public void testPulseRateLow1() {
		
			vitalCheck test = new vitalCheck();
			
			int result = test.pulseRateCheck(29);
			assertEquals(1,result);
		}
	
	@Test
	public void testPulseRateLow2() {
		
			vitalCheck test = new vitalCheck();
			
			int result = test.pulseRateCheck(30);
			assertEquals(1,result);
		}
	
	@Test
	public void testPulseRateLow3() {
		
			vitalCheck test = new vitalCheck();
			
			int result = test.pulseRateCheck(31);
			assertEquals(1,result);
		}
	
	@Test
	public void testPulseRateLow4() {
		
			vitalCheck test = new vitalCheck();
			
			int result = test.pulseRateCheck(48);
			assertEquals(1,result);
		}
	
	@Test
	public void testPulseRateLow5() {
		
			vitalCheck test = new vitalCheck();
			
			int result = test.pulseRateCheck(49);
			assertEquals(1,result);
		}
	
	@Test
	public void testPulseRateHigh1() {
		
			vitalCheck test = new vitalCheck();
			
			int result = test.pulseRateCheck(101);
			assertEquals(1,result);
		}
	
	@Test
	public void testPulseRateHigh2() {
		
			vitalCheck test = new vitalCheck();
			
			int result = test.pulseRateCheck(102);
			assertEquals(1,result);
		}
	
	@Test
	public void testPulseRateHigh3() {
		
			vitalCheck test = new vitalCheck();
			
			int result = test.pulseRateCheck(253);
			assertEquals(1,result);
		}
	
	@Test
	public void testPulseRateHigh4() {
		
			vitalCheck test = new vitalCheck();
			
			int result = test.pulseRateCheck(254);
			assertEquals(1,result);
		}
	
	@Test
	public void testPulseRateHigh5() {
		
			vitalCheck test = new vitalCheck();
			
			int result = test.pulseRateCheck(255);
			assertEquals(1,result);
		}
		
		
}
