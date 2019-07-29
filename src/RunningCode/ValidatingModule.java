package RunningCode;

public class ValidatingModule  {
	
	public boolean validatedetails(Sample[] sample) {
		
	String patientId = null;
	
	String Spo2 = null;
	String pulserate = null;
	String temp = null;
    boolean flag = false;

	    	
	for (int i = 0; i < sample.length; i++) 
		
	{
		     patientId= sample[i].patientId;
		     Spo2 = sample[i].Spo2;
		     pulserate = sample[i].pulseRate;
		     temp = sample[i].temperature;		
		
	}
	int SPO2=Integer.parseInt(Spo2); 
	int pulseRate = Integer.parseInt(pulserate);
	double temperature = Double.parseDouble(temp);
		
	if(patientId == null)	
		flag = true;
	else if(Checkparams(SPO2)==true)
		flag=true;
	else if(Checkparams(pulseRate)==true)
		flag=true;
	else if(Checkparams(temperature)==true)
		flag=true;
	else if(CheckSPO2(SPO2) == false)
		flag=true;
	else if(CheckPulseRate(pulseRate)==false)
		flag=true;
	else if(CheckTemp(temperature) == false)
		flag=true;
	else
		flag = false;
	
	
	return flag;
	
	}

	
	
	// Method1
    public static boolean Checkparams(double x)
    {		
		if(x<=0) 
			return true;		
		else 
			return false;		
	}
    
    //Method 2
    public static boolean CheckSPO2(double SPO2)
    {
    	if(SPO2>=70 && SPO2<=100)
    		return true;
    	else
    		return false;
    	
    }
    
    
  //Method 3
    public static boolean CheckTemp(double temperature)
    {
    	if(temperature>=93 && temperature<=113)
    		return true;
    	else
    		return false;
    	
    }
    
    //Method 4
    public static boolean CheckPulseRate(int pulseRate) 
    {
		if(pulseRate>=30 && pulseRate<=254)
			return true;
		else
			return false;
	}
    
	
	

}
		

