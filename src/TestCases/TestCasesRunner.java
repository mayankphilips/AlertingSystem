package testCases;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestCasesRunner {

	
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(TestSuite.class);
		TestValidatingModule tvm = new TestValidatingModule();
		for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
	      System.out.println("RESULT=="+result.wasSuccessful());
	      
	      
		  if(!result.wasSuccessful()) 
			  System.out.println("SOME TESTCASES FAILED!!!!");
			  
		  else
			  System.out.println("ALL TESTCASES PASSED!!!");
		  System.out.println("**************************************");

	}
}
