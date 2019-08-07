package sourceCode;



public class InputGeneratingModule {
    	public PatientVitals[] getDetails(String patientId)
    	{
	       PatientVitals[] arr = new PatientVitals[1];
    		
		RandomValuesGeneratingModule r= new RandomValuesGeneratingModule();
    		int spo2=(int)r.generatingModule(30.0, 100.0);
    		int hr=(int)r.generatingModule(20.0, 254.0);
		double temp= Math.round(r.generatingModule(60, 150) * 100.0) /100.0;
        	
        	arr[0] = new PatientVitals(patientId,spo2,hr,temp);
        	return arr;		
		}
		


    
	

}
