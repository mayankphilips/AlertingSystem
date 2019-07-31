package RunningCode;



public class InputGeneratingModule {
    	public Sample[] getDetails()
    	{
			Sample[] arr;
    		arr = new Sample[1];
    		
    		/*PatientIdGeneratingModule p= new PatientIdGeneratingModule();
    		String patientId=p.getAlphaNumericString();*/
    		String patientId="TRJIW432";
			
			RandomValuesGeneratingModule r= new RandomValuesGeneratingModule();
    		int spo2=(int)r.generateFun(50, 100);
    		int hr=(int)r.generateFun(30, 254);
			double temp= Math.round(r.generateFun(80, 130) * 100.0) /100.0;
			
			/*int spo2=(int)r.generateFun(88, 100);
    		int hr=(int)r.generateFun(48, 110);
        	double temp= Math.round(r.generateFun(95, 102) * 100.0) /100.0;*/
        	
        	String Spo2 = Integer.toString(spo2);
        	String pulseRate = Integer.toString(hr);
        	String temperature = Double.toString(temp);
        	arr[0] = new Sample(patientId,Spo2,pulseRate,temperature);
        	if(patientId!=null && Spo2!=null && pulseRate!=null && temperature!=null) 
			     return arr;
        	else       	
        		return null;			
			}
		


    
	

}