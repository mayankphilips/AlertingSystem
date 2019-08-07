package sourceCode;


import java.util.Random;

public class RandomValuesGeneratingModule{
	public double generatingModule(double min,double max) 
    { 
    	Random r = new Random();
    	return  min + r.nextFloat() * (max - min);

    }

	public int generatingModule(int min, int max) {
		Random r = new Random();
    	return  (min + r.nextInt() * (max - min));

	}
}
