public class PatientIdGenerator { 
	
    String getAlphaNumericString() 
    { 
        String CharString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String NumericString = "0123456789";
        StringBuilder sb = new StringBuilder(); 
  
        for (int i = 0; i < 5; i++) { 
  
            int index = (int)(CharString.length() * Math.random()); 
            sb.append(CharString.charAt(index)); 
        } 
        for (int i = 0; i < 3; i++) { 
            int index = (int)(NumericString.length() * Math.random()); 
            sb.append(NumericString.charAt(index)); 
        } 
  
        return sb.toString(); 
    } 
  
} 