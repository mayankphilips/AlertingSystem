package sourceCode;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ControllerModule implements Runnable {
	
	static BufferedReader in ;  
	static int quit=0;
    static PatientIdGeneratingModule p= new PatientIdGeneratingModule();
	public static String patientId= p.getAlphaNumericString();
	
	public void run()
	{
        String msg = null;
        while(true)
        {
            try{
            msg=in.readLine();
            }catch(Exception e){}
             
            if(msg.equalsIgnoreCase("Q")) {quit=1;break;}}
     }
	
	
	public static void controllerFunction() {

		InputGeneratingModule ig = new InputGeneratingModule();	
		AlertRaisingModule ar = new AlertRaisingModule();
		ValidatingModule vm = new ValidatingModule();
		VitalCheckModule vc = new VitalCheckModule();

		Sample[] sample = ig.getDetails(patientId);
		
		if(sample !=null) 
		{
		
		for(int i=0;i<1;i++)
		{
			System.out.println("PatientId = " +sample[i].patientId);
			System.out.println("OxygenLevel = "+sample[i].oxygenLevel);
			System.out.println("PulseRate = "+sample[i].pulseRate);
			System.out.println("Temperature = "+sample[i].temperature);			
		}
					
		if(vm.validateDetails(sample)) 
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
	
	
	public static void main(String args[]) throws Exception{
	    
		    in=new BufferedReader(new InputStreamReader(System.in));
	         
	        Thread t=new Thread(new ControllerModule());
	        t.start();
	         
	        System.out.println("PRESS Q THEN ENTER to terminate");
	        while(true)
	        {
	            if(quit==1) break;
	            controllerFunction();
	            System.out.println("********************************************");
	            t.sleep(5000);
	         
	        }
	    }
}