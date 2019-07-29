

import java.util.Random;

public class RandomGenerator{
	double generateFun(double min,double max) 
    { 
    	Random r = new Random();
    	return  min + r.nextFloat() * (max - min);

    }
}