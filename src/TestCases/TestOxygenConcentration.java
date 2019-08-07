package testCases;
import static org.junit.Assert.*;

import org.junit.Test;

import sourceCode.ValidatingModule;
import sourceCode.VitalCheckModule;

public class TestOxygenConcentration {
	int o=0;
	int o_=0;
	VitalCheckModule test = new VitalCheckModule();
	String pass = "TESTCASE PASSED";
	String fail = "TESTCASE FAILED";
	int value1=0;
	int value2=1;
	
	@Test
	public void testOxygenLevel(){
		
		System.out.println("*************************************************************");
		System.out.println("TEST CASES FOR CHECKING OXYGEN LEVEL");
		System.out.println("\n");
		
		o=o+1;
		int result = test.oxygenCheck(91);
		assertEquals(value1,result);
		if(value1==result)
			   System.out.println("Expected Result Is  "+result+ ", The Result Is "+ value1+ "=> "+pass);
		else
			System.out.println("Expected Result Is  "+result+ ", The Result Is "+ value1+ "=> "+fail);
		
		
		o=o+1;
		int result1 = test.oxygenCheck(92);
		assertEquals(value1,result1);
		if(value1==result1)
			   System.out.println("Expected Result Is  "+result1+ ", The Result Is "+ value1+ "=> "+pass);
		else
			System.out.println("Expected Result Is  "+result1+ ", The Result Is "+ value1+ "=> "+fail);
		
		
		o=o+1;
		int result2 = test.oxygenCheck(99);
		assertEquals(value1,result2);
		if(value1==result2)
			   System.out.println("Expected Result Is  "+result2+ ", The Result Is "+ value1+ "=> "+pass);
		else
			System.out.println("Expected Result Is  "+result2+ ", The Result Is "+ value1+ "=> "+fail);
		
		
		o=o+1;
		int result3 = test.oxygenCheck(100);
		assertEquals(value1,result3);
		if(value1==result3)
			   System.out.println("Expected Result Is  "+result3+ ", The Result Is "+ value1+ "=> "+pass);
		else
			System.out.println("Expected Result Is  "+result3+ ", The Result Is "+ value1+ "=> "+fail);
		
		o=o+1;
		int result4 = test.oxygenCheck(69);
		assertEquals(value2,result4);
		if(value2==result4)
			   System.out.println("Expected Result Is  "+result4+ ", The Result Is "+ value2+ "=> "+pass);
		else
			System.out.println("Expected Result Is  "+result4+ ", The Result Is "+ value2+ "=> "+fail);
		
		o=o+1;
		int result5 = test.oxygenCheck(70);
		assertEquals(value2,result5);
		if(value2==result5)
			   System.out.println("Expected Result Is  "+result5+ ", The Result Is "+ value2+ "=> "+pass);
		else
			System.out.println("Expected Result Is  "+result5+ ", The Result Is "+ value2+ "=> "+fail);
		
		o=o+1;
		int result6 = test.oxygenCheck(71);
		assertEquals(value2,result6);
		if(value2==result6)
			   System.out.println("Expected Result Is  "+result6+ ", The Result Is "+ value2+ "=> "+pass);
		else
			System.out.println("Expected Result Is  "+result6+ ", The Result Is "+ value2+ "=> "+fail);
		
		o=o+1;
		int result7 = test.oxygenCheck(89);
		assertEquals(value2,result7);
		if(value2==result7)
			   System.out.println("Expected Result Is  "+result7+ ", The Result Is "+ value2+ "=> "+pass);
		else
			System.out.println("Expected Result Is  "+result7+ ", The Result Is "+ value2+ "=> "+fail);
		
		o=o+1;
		int result8 = test.oxygenCheck(90);
		assertEquals(value2,result8);
		if(value2==result8)
			   System.out.println("Expected Result Is  "+result8+ ", The Result Is "+ value2+ "=> "+pass);
		else
			System.out.println("Expected Result Is  "+result8+ ", The Result Is "+ value2+ "=> "+fail);
		System.out.println("\n");
		
		o=o_+1;
		int result9 = test.oxygenCheck(80);
		assertEquals(value1,result9);
		if(value1==result9)
			   System.out.println("Expected Result Is  "+result9+ ", The Result Is "+ value1+ "=> "+pass);
		else
			System.out.println("Expected Result Is  "+result9+ ", The Result Is "+ value1+ "=> "+fail);
		
		o=o_+1;
		int result10 = test.oxygenCheck(88);
		assertEquals(value1,result10);
		if(value1==result10)
			   System.out.println("Expected Result Is  "+result+ ", The Result Is "+ value1+ "=> "+pass);
		else
			System.out.println("Expected Result Is  "+result+ ", The Result Is "+ value1+ "=> "+fail);
		
		
		o=o_+1;
		int result11 = test.oxygenCheck(20);
		assertEquals(value1,result11);
		if(value1==result11)
			   System.out.println("Expected Result Is  "+result11+ ", The Result Is "+ value1+ "=> "+pass);
		else
			System.out.println("Expected Result Is  "+result11+ ", The Result Is "+ value1+ "=> "+fail);
		
		
		
		System.out.println(o);
		System.out.println(o_);
	}
	

}
