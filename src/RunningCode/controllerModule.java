package RunningCode;


class Sample {
	public String patientId;
	public String Spo2;
	public String pulseRate;
	public String temperature;
	
	Sample(String patientId,String Spo2,String pulseRate,String temperature){
		this.patientId = patientId;
		this.Spo2 = Spo2;
		this.pulseRate = pulseRate;
		this.temperature = temperature;
		
	}

}

public class controllerModule {

	static {
		for(int i=0;i<10;i++) 
		{
	        main(new String[] { "Hello" }); 
	        System.out.println("********************************************");
	        try {
				Thread.sleep(5000); // 1000 milliseconds
			} catch (InterruptedException e) {
				e.printStackTrace();
		}
	    }	
		
	}
	public static void main(String[] args) {

		InputGeneratingModule ig = new InputGeneratingModule();	
		AlertRaisingModule ar = new AlertRaisingModule();
		ValidatingModule vm = new ValidatingModule();
		VitalCheckModule vc = new VitalCheckModule();
		
		
		
		Sample[] sample = ig.getDetails();
		
		if(sample !=null) 
		{
		
		System.out.println("The Following are the randomly generated values");
		for(int i=0;i<1;i++)
		{
			System.out.println("PatientId = " +sample[i].patientId);
			System.out.println("SPO2 = "+sample[i].Spo2);
			System.out.println("PulseRate = "+sample[i].pulseRate);
			System.out.println("Temperature = "+sample[i].temperature);
			
			
		}
					
		if(vm.validatedetails(sample)) 
			    ar.alertingFunc(1);	
		else 
		{
			if(vc.paramsCheck(sample))
				ar.alertingFunc(1);
			else
				ar.alertingFunc(0);
		 
		}
		}
		
		else
			System.out.println("NOT A VALID INPUT!!!!");		

	}
}