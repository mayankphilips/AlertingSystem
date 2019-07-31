package TestCases;
import static org.junit.Assert.*;

import org.junit.Test;

import sourceCode.VitalCheckModule;

public class TestPulseRate {
	
	VitalCheckModule test = new VitalCheckModule();

	@Test
	public void testPulseRateNormal1() {
		
			
			
			int result = test.pulseRateCheck(50);
			assertEquals(0,result);
		}
	
	@Test
	public void testPulseRateNormal2() {
		
			
			
			int result = test.pulseRateCheck(51);
			assertEquals(0,result);
		}
	
	@Test
	public void testPulseRateNormal3() {
		
			
			
			int result = test.pulseRateCheck(99);
			assertEquals(0,result);
		}
	
	@Test
	public void testPulseRateNormal4() {
		
			
			
			int result = test.pulseRateCheck(100);
			assertEquals(0,result);
		}
	
	@Test
	public void testPulseRateLow1() {
		
			
			
			int result = test.pulseRateCheck(29);
			assertEquals(1,result);
		}
	
	@Test
	public void testPulseRateLow2() {
		
			
			
			int result = test.pulseRateCheck(30);
			assertEquals(1,result);
		}
	
	@Test
	public void testPulseRateLow3() {
		
			
			
			int result = test.pulseRateCheck(31);
			assertEquals(1,result);
		}
	
	@Test
	public void testPulseRateLow4() {
		
			
			
			int result = test.pulseRateCheck(48);
			assertEquals(1,result);
		}
	
	@Test
	public void testPulseRateLow5() {
		
			
			
			int result = test.pulseRateCheck(49);
			assertEquals(1,result);
		}
	
	@Test
	public void testPulseRateHigh1() {
		
			
			
			int result = test.pulseRateCheck(101);
			assertEquals(1,result);
		}
	
	@Test
	public void testPulseRateHigh2() {
		
			
			
			int result = test.pulseRateCheck(102);
			assertEquals(1,result);
		}
	
	@Test
	public void testPulseRateHigh3() {
		
			
			
			int result = test.pulseRateCheck(253);
			assertEquals(1,result);
		}
	
	@Test
	public void testPulseRateHigh4() {
		
			
			
			int result = test.pulseRateCheck(254);
			assertEquals(1,result);
		}
	
	@Test
	public void testPulseRateHigh5() {
		
			
			
			int result = test.pulseRateCheck(255);
			assertEquals(1,result);
		}
		
		
}
