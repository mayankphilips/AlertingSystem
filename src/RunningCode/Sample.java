package RunningCode;

public class Sample {

	public String patientId;
	public String oxygenLevel;
	public String pulseRate;
	public String temperature;
	
	Sample(String patientId,String Spo2,String pulseRate,String temperature){
		this.patientId = patientId;
		this.oxygenLevel = Spo2;
		this.pulseRate = pulseRate;
		this.temperature = temperature;
		
	}

}
