//This will check for the Vitals of patients and will  alert accordingly

package src.RunningCode;
public class VitalCheckModule {
	
	public boolean paramsCheck(Sample[] sample) {
		int result1=0;
		int result2=0;
		int result3=0;
		String pr = null;
		String tc = null;
		String oc = null;
		for(int i=0;i<1;i++) {
			pr = sample[i].pulseRate;
			tc = sample[i].temperature;
			oc = sample[i].Spo2;			
		}
		int oc_=Integer.parseInt(oc); 
		int pr_ = Integer.parseInt(pr);
		double tc_ = Double.parseDouble(tc);
		
		result1 = pulseRateCheck(pr_);
		result2 = temperatureCheck(tc_);
		result3 = oxygenCheck(oc_);
		if(result1==1 || result2==1 || result3==1)
			return true;
		else
		    return false;
		
	}
		
	public int pulseRateCheck(int pulseRate) {
		
		final int pulseRateNormalLimit = 0;
		final int lowPulseRateWarningLimit = 1;
		final int lowPulseRateCriticalLimit = 1;
		final int highPulseRateWarningLimit = 1;
		final int highPulseRateCriticalLimit = 1;
		final int pulseRateMachineError = 1;
		
		if( pulseRate >=50 && pulseRate <= 100 ) { 
			
			return pulseRateNormalLimit; //Normal Status and no alarm needs to be raised
			
		}
		
		
		
		else if( pulseRate >=40 && pulseRate < 50 ){
			
			return lowPulseRateWarningLimit; //Alarming Drop and Attention Needed
			
		}
		
		
		else if( pulseRate >=30 && pulseRate < 40) {
			
			return lowPulseRateCriticalLimit; //Critical Level Drop in SPO2 , Immediate Response Required / Alert Doctor
			
		}
		
		else if( pulseRate >100 && pulseRate < 120 ){
			
			return highPulseRateWarningLimit; //Alarming Drop and Attention Needed
			
		}
		
		
		else if( pulseRate >=120 && pulseRate < 254) {
			
			return highPulseRateCriticalLimit; //Critical Level Drop in SPO2 , Immediate Response Required / Alert Doctor
			
		}
		
		
		else
			return pulseRateMachineError;
			
			//Machine is Malfunctioning , Alert Nursing Station for Immediate Check
		
	}
	

	public int temperatureCheck(double tempratureF) {
	
		final int tempratureNormalLimit = 0;
		final int lowTempratureWarningLimit = 1;
		final int lowTempratureCriticalLimit = 1;
		final int highTempratureWarningLimit = 1;
		final int highTempratureCriticalLimit = 1;
		final int tempratureMachineError = 1;
		
		if( tempratureF >=97.0 && tempratureF <= 99.00 ) { 
			
			return tempratureNormalLimit; //Normal Status and no alarm needs to be raised
			
		}
		
		
		
		else if( tempratureF >=95.00 && tempratureF < 97.00 ){
			
			return lowTempratureWarningLimit; //Alarming Drop and Attention Needed
			
		}
		
		
		else if( tempratureF >=93.00 && tempratureF < 95.00) {
			
			return lowTempratureCriticalLimit; //Critical Level Drop in SPO2 , Immediate Response Required / Alert Doctor
			
		}
		
		else if( tempratureF >99.00 && tempratureF < 104.00 ){
			
			return highTempratureWarningLimit; //Alarming Drop and Attention Needed
			
		}
		
		
		else if( tempratureF >=104.00 && tempratureF < 108.00) {
			
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
			
			return oxygenNormalLimit; //Normal Status and no alarm needs to be raised
			
		}
		
		
		
		else if( oxygenConcentration >=81 && oxygenConcentration < 91 ){
			
			return oxygenWarningLimit; //Alarming Drop and Attention Needed
			
		}
		
		
		else if( oxygenConcentration >=70 && oxygenConcentration < 81) {
			
			return oxygenCriticalLimit; //Critical Level Drop in SPO2 , Immediate Response Required / Alert Doctor
			
		}
		
		
		else
			return oxygenMachineError;
			
			//Machine is Malfunctioning , Alert Nursing Station for Immediate Check
		
	}


}
