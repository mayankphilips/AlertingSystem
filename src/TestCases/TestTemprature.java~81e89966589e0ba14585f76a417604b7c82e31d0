package testCases;
import static org.junit.Assert.*;

import org.junit.Test;

import sourceCode.VitalCheckModule;

public class TestTemprature {
	VitalCheckModule test = new VitalCheckModule();

	@Test
	public void testTempratureNormal1() {			
			int result = test.temperatureCheck(97.00);
			assertEquals(0,result);
		}
	
	
	@Test
	public void testTempratureNormal2() {			
			int result = test.temperatureCheck(97.01);
			assertEquals(0,result);
		}
	
	@Test
	public void testTempratureNormal3() {			
			int result = test.temperatureCheck(98.99);
			assertEquals(0,result);
		}
	
	@Test
	public void testTempratureNormal4() {			
			int result = test.temperatureCheck(99.00);
			assertEquals(0,result);
		}
	
	@Test
	public void testTempratureLow1() {			
			int result = test.temperatureCheck(92.99);
			assertEquals(1,result);
		}
	
	@Test
	public void testTempratureLow2() {			
			int result = test.temperatureCheck(93.00);
			assertEquals(1,result);
		}
	
	@Test
	public void testTempratureLow3() {
		
			
			
			int result = test.temperatureCheck(93.01);
			assertEquals(1,result);
		}
	
	@Test
	public void testTempratureLow4() {
		
		
			
			int result = test.temperatureCheck(96.98);
			assertEquals(1,result);
		}
	
	@Test
	public void testTempratureLow5() {
		
			
			
			int result = test.temperatureCheck(96.99);
			assertEquals(1,result);
		}
	
	@Test
	public void testTempratureHigh1() {
		
			
			
			int result = test.temperatureCheck(99.01);
			assertEquals(1,result);
		}
	
	@Test
	public void testTempratureHigh2() {
		
			
			
			int result = test.temperatureCheck(99.02);
			assertEquals(1,result);
		}
	
	@Test
	public void testTempratureHigh3() {
		
			
			
			int result = test.temperatureCheck(107.98);
			assertEquals(1,result);
		}
	
	@Test
	public void testTempratureHigh4() {
		
		
			
			int result = test.temperatureCheck(107.99);
			assertEquals(1,result);
		}
	
	@Test
	public void testTempratureHigh5() {
		
			
			
			int result = test.temperatureCheck(108.00);
			assertEquals(1,result);
		}

}
