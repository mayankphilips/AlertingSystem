package testCases;
import static org.junit.Assert.*;

import org.junit.Test;

import sourceCode.VitalCheckModule;

public class TestTemprature {
	VitalCheckModule test = new VitalCheckModule();
	int t=0;
	int t_=0;
	String pass = "TESTCASE PASSED";
	String fail = "TESTCASE FAILED";
	int value1=0;
	int value2=1;
	

	@Test
	public void testTemprature() {
		
		    System.out.println("*************************************************************");
		    System.out.println("TEST CASES FOR CHECKING TEMPERATURE");
		    System.out.println("\n");
		    
		    t=t+1;
			int result = test.temperatureCheck(97.00);
			assertEquals(value1,result);
			if(value1==result)
				   System.out.println("Expected Result Is  "+result+ ", The Result Is "+ value1+ "=> "+pass);
			else
				System.out.println("Expected Result Is  "+result+ ", The Result Is "+ value1+ "=> "+fail);
			
			
			t=t+1;
			int result1 = test.temperatureCheck(97.01);
			assertEquals(value1,result1);
			if(value1==result1)
				   System.out.println("Expected Result Is  "+result1+ ", The Result Is "+ value1+ "=> "+pass);
			else
				System.out.println("Expected Result Is  "+result1+ ", The Result Is "+ value1+ "=> "+fail);
			
			t=t+1;
			int result2 = test.temperatureCheck(98.99);
			assertEquals(value1,result2);
			if(value1==result2)
				   System.out.println("Expected Result Is  "+result2+ ", The Result Is "+ value1+ "=> "+pass);
			else
				System.out.println("Expected Result Is  "+result2+ ", The Result Is "+ value1+ "=> "+fail);
			
			t=t+1;
			int result3 = test.temperatureCheck(99.00);
			assertEquals(value1,result3);
			if(value1==result3)
				   System.out.println("Expected Result Is  "+result3+ ", The Result Is "+ value1+ "=> "+pass);
			else
				System.out.println("Expected Result Is  "+result3+ ", The Result Is "+ value1+ "=> "+fail);
			
			t=t+1;
			int result4 = test.temperatureCheck(92.99);
			assertEquals(value2,result4);
			if(value2==result4)
				   System.out.println("Expected Result Is  "+result4+ ", The Result Is "+ value2+ "=> "+pass);
			else
				System.out.println("Expected Result Is  "+result4+ ", The Result Is "+ value2+ "=> "+fail);
			
			
			t=t+1;
			int result5 = test.temperatureCheck(93.00);
			assertEquals(value2,result5);
			if(value2==result5)
				   System.out.println("Expected Result Is  "+result5+ ", The Result Is "+ value2+ "=> "+pass);
			else
				System.out.println("Expected Result Is  "+result5+ ", The Result Is "+ value2+ "=> "+fail);
			
			
			t=t+1;
			int result51 = test.temperatureCheck(93.01);
			assertEquals(value2,result51);
			if(value2==result51)
				   System.out.println("Expected Result Is  "+result51+ ", The Result Is "+ value2+ "=> "+pass);
			else
				System.out.println("Expected Result Is  "+result51+ ", The Result Is "+ value2+ "=> "+fail);
			
			
			t=t+1;
			int result52 = test.temperatureCheck(96.98);
			assertEquals(value2,result52);
			if(value2==result52)
				   System.out.println("Expected Result Is  "+result52+ ", The Result Is "+ value2+ "=> "+pass);
			else
				System.out.println("Expected Result Is  "+result52+ ", The Result Is "+ value2+ "=> "+fail);
			
			
			t=t+1;
			int result6 = test.temperatureCheck(96.99);
			assertEquals(value2,result6);
			if(value2==result6)
				   System.out.println("Expected Result Is  "+result6+ ", The Result Is "+ value2+ "=> "+pass);
			else
				System.out.println("Expected Result Is  "+result6+ ", The Result Is "+ value2+ "=> "+fail);
			
			
			t=t+1;
			int result7 = test.temperatureCheck(99.01);
			assertEquals(value2,result7);
			if(value2==result7)
				   System.out.println("Expected Result Is  "+result7+ ", The Result Is "+ value2+ "=> "+pass);
			else
				System.out.println("Expected Result Is  "+result7+ ", The Result Is "+ value2+ "=> "+fail);
			
			
			t=t+1;
			int result8 = test.temperatureCheck(99.02);
			assertEquals(value2,result8);
			if(value2==result8)
				   System.out.println("Expected Result Is  "+result8+ ", The Result Is "+ value2+ "=> "+pass);
			else
				System.out.println("Expected Result Is  "+result8+ ", The Result Is "+ value2+ "=> "+fail);
			
			
			t=t+1;
			int result9 = test.temperatureCheck(107.98);
			assertEquals(value2,result9);
			if(value2==result9)
				   System.out.println("Expected Result Is  "+result9+ ", The Result Is "+ value2+ "=> "+pass);
			else
				System.out.println("Expected Result Is  "+result9+ ", The Result Is "+ value2+ "=> "+fail);
			
			
			t=t+1;
			int result10 = test.temperatureCheck(107.99);
			assertEquals(value2,result10);
			if(value2==result10)
				   System.out.println("Expected Result Is  "+result10+ ", The Result Is "+ value2+ "=> "+pass);
			else
				System.out.println("Expected Result Is  "+result10+ ", The Result Is "+ value2+ "=> "+fail);
			
			
			t=t+1;
			int result11 = test.temperatureCheck(108);
			assertEquals(value2,result11);
			if(value2==result11)
				   System.out.println("Expected Result Is  "+result11+ ", The Result Is "+ value2+ "=> "+pass);
			else
				System.out.println("Expected Result Is  "+result11+ ", The Result Is "+ value2+ "=> "+fail);
			
			
			
			
		}


}
