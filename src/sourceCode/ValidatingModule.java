package sourceCode;

public class ValidatingModule  {
	
	public boolean validateDetails(PatientVitals[] sample) {
		
	String patientId = null;	
	int spo2 = 0;
	int pulserate = 0;
	double temp = 0;
        boolean flag = false;

	    	
	for (int i = 0; i < sample.length; i++) 
		
	{
		     patientId= sample[i].patientId;
		     spo2 = sample[i].oxygenLevel;
		     pulserate = sample[i].pulseRate;
		     temp = sample[i].temperature;		
		
	}

		
	if(patientId == null)
	{
		flag = true;
		System.out.println("INVALID PATIENTID!!!");
	}
	else if(checkParams(spo2)==true)
	{
		flag=true;
	    System.out.println("INVALID OXYGEN LEVELS!!!");
	}
	else if(checkParams(pulserate)==true)
	{
		flag=true;
		System.out.println("INVALID HEART RATE!!!");
	}
	else if(checkParams(temp)==true)
	{
		flag=true;
		System.out.println("INVALID TEMPERATURE!!!");
	}
	else if(checkSPO2(spo2) == false)
	{
		flag=true;
		System.out.println("MACHINE ERROR----OXYGEN LEVEL IS OUT OF RANGE!!!");
	}
	else if(checkPulseRate(pulserate)==false)
	{
		flag=true;
		System.out.println("MACHINE ERROR----PULSERATE IS OUT OF RANGE!!!");
	}
	else if(checkTemp(temp) == false)
	{
		flag=true;
		System.out.println("MACHINE ERROR----TEMPERATURE IS OUT OF RANGE!!!");
	}
	else
		flag = false;
	
	
	return flag;
	
	}	
	
	// Method1
    public static boolean checkParams(double x) { 		
		return(x<=0);}		
	
    
    //Method 2
    public static boolean checkSPO2(double spo2)
    {
    	return(spo2>=70 && spo2<=100);
    }
    
  //Method 3
    public static boolean checkTemp(double temperature)
    {
    	return(temperature>=93 && temperature<=113);
    }
    
    //Method 4
    public static boolean checkPulseRate(int pulseRate) 
    {
		return(pulseRate>=30 && pulseRate<=254);
    }
		

}
		



		


