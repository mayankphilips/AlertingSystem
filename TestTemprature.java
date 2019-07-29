import static org.junit.Assert.*;

import org.junit.Test;

public class TestTemprature {

	@Test
	public void testTempratureNormal1() {
		
			vitalCheck test = new vitalCheck();
			
			int result = test.tempratureCheck(97.00);
			assertEquals(0,result);
		}
	
	@Test
	public void testTempratureNormal2() {
		
			vitalCheck test = new vitalCheck();
			
			int result = test.tempratureCheck(97.01);
			assertEquals(0,result);
		}
	
	@Test
	public void testTempratureNormal3() {
		
			vitalCheck test = new vitalCheck();
			
			int result = test.tempratureCheck(98.99);
			assertEquals(0,result);
		}
	
	@Test
	public void testTempratureNormal4() {
		
			vitalCheck test = new vitalCheck();
			
			int result = test.tempratureCheck(99.00);
			assertEquals(0,result);
		}
	
	@Test
	public void testTempratureLow1() {
		
			vitalCheck test = new vitalCheck();
			
			int result = test.tempratureCheck(92.99);
			assertEquals(1,result);
		}
	
	@Test
	public void testTempratureLow2() {
		
			vitalCheck test = new vitalCheck();
			
			int result = test.tempratureCheck(93.00);
			assertEquals(1,result);
		}
	
	@Test
	public void testTempratureLow3() {
		
			vitalCheck test = new vitalCheck();
			
			int result = test.tempratureCheck(93.01);
			assertEquals(1,result);
		}
	
	@Test
	public void testTempratureLow4() {
		
			vitalCheck test = new vitalCheck();
			
			int result = test.tempratureCheck(96.98);
			assertEquals(1,result);
		}
	
	@Test
	public void testTempratureLow5() {
		
			vitalCheck test = new vitalCheck();
			
			int result = test.tempratureCheck(96.99);
			assertEquals(1,result);
		}
	
	@Test
	public void testTempratureHigh1() {
		
			vitalCheck test = new vitalCheck();
			
			int result = test.tempratureCheck(99.01);
			assertEquals(1,result);
		}
	
	@Test
	public void testTempratureHigh2() {
		
			vitalCheck test = new vitalCheck();
			
			int result = test.tempratureCheck(99.02);
			assertEquals(1,result);
		}
	
	@Test
	public void testTempratureHigh3() {
		
			vitalCheck test = new vitalCheck();
			
			int result = test.tempratureCheck(107.98);
			assertEquals(1,result);
		}
	
	@Test
	public void testTempratureHigh4() {
		
			vitalCheck test = new vitalCheck();
			
			int result = test.tempratureCheck(107.99);
			assertEquals(1,result);
		}
	
	@Test
	public void testTempratureHigh5() {
		
			vitalCheck test = new vitalCheck();
			
			int result = test.tempratureCheck(108.00);
			assertEquals(1,result);
		}

}
