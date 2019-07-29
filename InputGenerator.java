import java.util.*;
public class InputGenerator{

    	public List<Object> getDetails()
    	{
    		PatientIdGenerator p= new PatientIdGenerator();
    		String pid=p.getAlphaNumericString();
    		
    		RandomGenerator r= new RandomGenerator();
    		int spo2=(int)r.generateFun(50, 100);
    		int hr=(int)r.generateFun(30, 254);
        	double temp= Math.round(r.generateFun(80, 130) * 100.0) /100.0;
    		return Arrays.asList(pid,spo2,hr,temp);
    	}
    
	
}