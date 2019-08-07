package testCases;


import sourceCode.ValidatingModule;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestValidatingModule {	
	int i=0;
	int j=0;
	@Test
	public void testValidateParams() 
	{
		System.out.println("*************************************************************");
		System.out.println("TEST CASES FOR VALIDATING IF THE PARAMETERS ARE <=0 OR NOT");
		System.out.println("\n");
		assertEquals(true,ValidatingModule.checkParams(-1)); 
		i=i+1;
		System.out.println("Expected Result Is  " +ValidatingModule.checkParams(-1)+  "And The Result Is "+ true + "=> TESTCASE PASSED");
		assertEquals(true,ValidatingModule.checkParams(0)); 
		i=i+1;
		System.out.println("Expected Result Is  " +ValidatingModule.checkParams(0)+  "And The Result Is  "+ true + "=> TESTCASE PASSED");
		assertEquals(false,ValidatingModule.checkParams(1)); 
		i=i+1;
		System.out.println("Expected Result Is  " +ValidatingModule.checkParams(1)+  "And The Result Is  "+ false + "=> TESTCASE PASSED");		
		System.out.println("\n");
		
		assertEquals(true,ValidatingModule.checkParams(2)); 
		j=j+1;
		System.out.println("Expected Result Is  " +ValidatingModule.checkParams(2)+  "And The Result Is  "+ true + "=> TESTCASE FAILED");				
		
	}
	
	
	@Test
	public void testValidateSPO2() 
	{
		System.out.println("*************************************************************");
		System.out.println("TEST CASES FOR VALIDATING OXYGEN LEVELS");
		System.out.println("\n");
		assertEquals(false,ValidatingModule.checkSPO2(69));
		i=i+1;
		System.out.println("Expected Result Is  "+ValidatingModule.checkSPO2(69)+ ", The Result Is "+ false+ "=> TESTCASE PASSED");
		
		assertEquals(true,ValidatingModule.checkSPO2(70));
		i=i+1;
		System.out.println("Expected Result Is "+ValidatingModule.checkSPO2(70)+ ", The Result Is "+ true+ "=> TESTCASE PASSED");
		
		assertEquals(true,ValidatingModule.checkSPO2(71));
		i=i+1;
		System.out.println("Expected Result Is  "+ValidatingModule.checkSPO2(71)+ ", The Result Is "+ true+ "=> TESTCASE PASSED");
				
		assertEquals(true,ValidatingModule.checkSPO2(99));
		i=i+1;
		System.out.println("Expected Result Is  "+ValidatingModule.checkSPO2(99)+ ", The Result Is "+ true+ "=> TESTCASE PASSED");
		
		assertEquals(true,ValidatingModule.checkSPO2(100));
		i=i+1;
		System.out.println("Expected Result Is  "+ValidatingModule.checkSPO2(100)+ ", The Result Is "+ true+ "=> TESTCASE PASSED");
		
		assertEquals(false,ValidatingModule.checkSPO2(101));
		i=i+1;
		System.out.println("Expected Result Is  "+ValidatingModule.checkSPO2(101)+ ", The Result Is "+ false+ "=> TESTCASE PASSED");
		System.out.println("\n");
		
		assertEquals(true,ValidatingModule.checkSPO2(102));
		j=j+1;
		System.out.println("Expected Result Is  "+ValidatingModule.checkSPO2(102)+ ", The Result Is "+ true+ "=> TESTCASE FAILED");
		System.out.println("\n\n");
		
	}
	
	@Test
	public void testValidateTemp()
	{
		System.out.println("*************************************************************");
		System.out.println("TEST CASES FOR VALIDATING TEMPERATURE");
		System.out.println("\n");
		assertEquals(false,ValidatingModule.checkTemp(92));
		i=i+1;
		System.out.println("Expected Result Is  "+ValidatingModule.checkTemp(92)+ ", The Result Is "+ false+ "=> TESTCASE PASSED");
		
		assertEquals(true,ValidatingModule.checkTemp(93));
		i=i+1;
		System.out.println("Expected Result Is  "+ValidatingModule.checkTemp(93)+ ", The Result Is "+ true+ "=> TESTCASE PASSED");
		
		assertEquals(true,ValidatingModule.checkTemp(94));
		i=i+1;
		System.out.println("Expected Result Is  "+ValidatingModule.checkTemp(94)+ ", The Result Is "+ true+ "=> TESTCASE PASSED");
		
		assertEquals(true,ValidatingModule.checkTemp(112));
		i=i+1;
		System.out.println("Expected Result Is  "+ValidatingModule.checkTemp(112)+ ", The Result Is "+ true+ "=> TESTCASE PASSED");
		assertEquals(true,ValidatingModule.checkTemp(113));
		i=i+1;
		System.out.println("Expected Result Is  "+ValidatingModule.checkTemp(113)+ ", The Result Is "+ true+ "=> TESTCASE PASSED");
		
		assertEquals(false,ValidatingModule.checkTemp(114));
		i=i+1;
		System.out.println("Expected Result Is  "+ValidatingModule.checkTemp(114)+ ", The Result Is "+ false+ "=> TESTCASE PASSED");
		System.out.println("\n");
		assertEquals(true,ValidatingModule.checkTemp(114));
		j=j+1;
		System.out.println("Expected Result Is  "+ValidatingModule.checkTemp(114)+ ", The Result Is "+ true+ "=> TESTCASE FAILED");
		
		
		
	}
	
	
	@Test
	public void testValidatePulseRate() 
	{
		System.out.println("*************************************************************");
		System.out.println("TEST CASES FOR VALIDATING HEARTRATE");
		System.out.println("\n");
		
		assertEquals(false,ValidatingModule.checkPulseRate(29));
		i=i+1;
		System.out.println("Expected Result Is  "+ValidatingModule.checkPulseRate(29)+ ", The Result Is "+ false+ "=> TESTCASE PASSED");
		
		assertEquals(true,ValidatingModule.checkPulseRate(30));
		i=i+1;
		System.out.println("Expected Result Is  "+ValidatingModule.checkPulseRate(30)+ ", The Result Is "+ true+ "=> TESTCASE PASSED");
		
		assertEquals(true,ValidatingModule.checkPulseRate(31));
		i=i+1;
		System.out.println("Expected Result Is  "+ValidatingModule.checkPulseRate(31)+ ", The Result Is "+ true+ "=> TESTCASE PASSED");
		
		assertEquals(true,ValidatingModule.checkPulseRate(253));
		i=i+1;
		System.out.println("Expected Result Is  "+ValidatingModule.checkPulseRate(32)+ ", The Result Is "+ true+ "=> TESTCASE PASSED");
		
		assertEquals(true,ValidatingModule.checkPulseRate(254));
		i=i+1;
		System.out.println("Expected Result Is  "+ValidatingModule.checkPulseRate(254)+ ", The Result Is "+ true+ "=> TESTCASE PASSED");
		System.out.println("\n");
		
		assertEquals(true,ValidatingModule.checkPulseRate(255));
		j=j+1;
		System.out.println("Expected Result Is  "+ValidatingModule.checkPulseRate(255)+ ", The Result Is "+ true+ "=> TESTCASE FAILED");
		
		
	}
	
	
}
