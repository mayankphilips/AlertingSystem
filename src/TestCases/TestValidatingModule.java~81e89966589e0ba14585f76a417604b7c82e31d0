package testCases;


import sourceCode.ValidatingModule;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TestValidatingModule {	
	@Test
	public void testCheckparams() 
	{
		assertEquals(true,ValidatingModule.checkParams(-1)); 
		assertEquals(true,ValidatingModule.checkParams(0)); 
		assertEquals(false,ValidatingModule.checkParams(1)); 		
	}
	
	@Test
	public void testCheckSPO2() 
	{
		assertEquals(false,ValidatingModule.checkSPO2(69));
		assertEquals(true,ValidatingModule.checkSPO2(70));
		assertEquals(true,ValidatingModule.checkSPO2(71));
		assertEquals(true,ValidatingModule.checkSPO2(99));
		assertEquals(true,ValidatingModule.checkSPO2(100));
		assertEquals(false,ValidatingModule.checkSPO2(101));
		
	}
	
	@Test
	public void testCheckTemp()
	{
		assertEquals(false,ValidatingModule.checkTemp(92));
		assertEquals(true,ValidatingModule.checkTemp(93));
		assertEquals(true,ValidatingModule.checkTemp(94));
		assertEquals(true,ValidatingModule.checkTemp(112));
		assertEquals(true,ValidatingModule.checkTemp(113));
		assertEquals(false,ValidatingModule.checkTemp(114));
		
	}
	
	
	@Test
	public void testCheckPulseRate() 
	{
		assertEquals(false,ValidatingModule.checkPulseRate(29));
		assertEquals(true,ValidatingModule.checkPulseRate(30));
		assertEquals(true,ValidatingModule.checkPulseRate(31));
		assertEquals(true,ValidatingModule.checkPulseRate(253));
		assertEquals(true,ValidatingModule.checkPulseRate(254));
		assertEquals(false,ValidatingModule.checkPulseRate(255));
		
	}
	
}
