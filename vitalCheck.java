//This will check for the Vitals of patients and will  alert accordingly


public class vitalCheck {
	
		
	public int pulseRateCheck(int pulseRate) {
		
		final int pulseRateNormalLimit = 0;
		final int lowPulseRateWarningLimit = 1;
		final int lowPulseRateCriticalLimit = 1;
		final int highPulseRateWarningLimit = 1;
		final int highPulseRateCriticalLimit = 1;
		final int pulseRateMachineError = 1;
		
		if( pulseRate >=50 && pulseRate <= 100 ) { 
			
			
			System.out.println("No Alert");
			return pulseRateNormalLimit; //Normal Status and no alarm needs to be raised
			
		}
		
		
		
		else if( pulseRate >=40 && pulseRate < 50 ){
			System.out.println("Alert");
			return lowPulseRateWarningLimit; //Alarming Drop and Attention Needed
			
		}
		
		
		else if( pulseRate >=30 && pulseRate < 40) {
			System.out.println("Alert");
			return lowPulseRateCriticalLimit; //Critical Level Drop in SPO2 , Immediate Response Required / Alert Doctor
			
		}
		
		else if( pulseRate >100 && pulseRate < 120 ){
			System.out.println("Alert");
			return highPulseRateWarningLimit; //Alarming Drop and Attention Needed
			
		}
		
		
		else if( pulseRate >=120 && pulseRate < 254) {
			System.out.println("Alert");
			return highPulseRateCriticalLimit; //Critical Level Drop in SPO2 , Immediate Response Required / Alert Doctor
			
		}
		
		
		else
			return pulseRateMachineError;
			
			//Machine is Malfunctioning , Alert Nursing Station for Immediate Check
		
	}
	

	public int tempratureCheck(double tempratureF) {
	
		final int tempratureNormalLimit = 0;
		final int lowTempratureWarningLimit = 1;
		final int lowTempratureCriticalLimit = 1;
		final int highTempratureWarningLimit = 1;
		final int highTempratureCriticalLimit = 1;
		final int tempratureMachineError = 1;
		
		if( tempratureF >=97.0 && tempratureF <= 99.00 ) { 
			System.out.println("No Alert");
			return tempratureNormalLimit; //Normal Status and no alarm needs to be raised
			
		}
		
		
		
		else if( tempratureF >=95.00 && tempratureF < 97.00 ){
			System.out.println("Alert");
			return lowTempratureWarningLimit; //Alarming Drop and Attention Needed
			
		}
		
		
		else if( tempratureF >=93.00 && tempratureF < 95.00) {
			System.out.println("Alert");
			return lowTempratureCriticalLimit; //Critical Level Drop in SPO2 , Immediate Response Required / Alert Doctor
			
		}
		
		else if( tempratureF >99.00 && tempratureF < 104.00 ){
			System.out.println("Alert");
			return highTempratureWarningLimit; //Alarming Drop and Attention Needed
			
		}
		
		
		else if( tempratureF >=104.00 && tempratureF < 108.00) {
			System.out.println("Alert");
			return highTempratureCriticalLimit; //Critical Level Drop in SPO2 , Immediate Response Required / Alert Doctor
			
		}
		
		
		else
			return tempratureMachineError;
			
		
		
	}
	
	
	public int oxygenCheck(int oxygenConcentration) {
		
		final int oxygenNormalLimit = 0;
		final int oxygenWarningLimit = 1;
		final int oxygenCriticalLimit = 1;
		final int oxygenMachineError = 1;
		
		if( oxygenConcentration >=91 && oxygenConcentration <= 100 ) { 
			System.out.println("No Alert");
			return oxygenNormalLimit; //Normal Status and no alarm needs to be raised
			
		}
		
		
		
		else if( oxygenConcentration >=81 && oxygenConcentration < 91 ){
			System.out.println("Alert");
			return oxygenWarningLimit; //Alarming Drop and Attention Needed
			
		}
		
		
		else if( oxygenConcentration >=70 && oxygenConcentration < 81) {
			System.out.println("Alert");
			return oxygenCriticalLimit; //Critical Level Drop in SPO2 , Immediate Response Required / Alert Doctor
			
		}
		
		
		else
			return oxygenMachineError;
			
			//Machine is Malfunctioning , Alert Nursing Station for Immediate Check
		
	}


}
