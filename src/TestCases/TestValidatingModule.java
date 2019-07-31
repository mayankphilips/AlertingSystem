package src.TestCases;


import src.RunningCode.ValidatingModule;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TestValidatingModule {	
	@Test
	public void testCheckparams() 
	{
		assertEquals(true,ValidatingModule.Checkparams(-1)); 
		assertEquals(true,ValidatingModule.Checkparams(0)); 
		assertEquals(false,ValidatingModule.Checkparams(1)); 		
	}
	
	@Test
	public void testCheckSPO2() 
	{
		assertEquals(false,ValidatingModule.CheckSPO2(69));
		assertEquals(true,ValidatingModule.CheckSPO2(70));
		assertEquals(true,ValidatingModule.CheckSPO2(71));
		assertEquals(true,ValidatingModule.CheckSPO2(99));
		assertEquals(true,ValidatingModule.CheckSPO2(100));
		assertEquals(false,ValidatingModule.CheckSPO2(101));
		
	}
	
	@Test
	public void testCheckTemp()
	{
		assertEquals(false,ValidatingModule.CheckTemp(92));
		assertEquals(true,ValidatingModule.CheckTemp(93));
		assertEquals(true,ValidatingModule.CheckTemp(94));
		assertEquals(true,ValidatingModule.CheckTemp(112));
		assertEquals(true,ValidatingModule.CheckTemp(113));
		assertEquals(false,ValidatingModule.CheckTemp(114));
		
	}
	
	
	@Test
	public void testCheckPulseRate() 
	{
		assertEquals(false,ValidatingModule.CheckPulseRate(29));
		assertEquals(true,ValidatingModule.CheckPulseRate(30));
		assertEquals(true,ValidatingModule.CheckPulseRate(31));
		assertEquals(true,ValidatingModule.CheckPulseRate(253));
		assertEquals(true,ValidatingModule.CheckPulseRate(254));
		assertEquals(false,ValidatingModule.CheckPulseRate(255));
		
	}
	
}
