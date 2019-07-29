import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Controller {

	public static void main(String[] args) {
		
		JSONParser parser = new JSONParser();
		//JsonParser to convert JSON string into Json Object

		try {
			Object obj = parser.parse(new FileReader("C:\\Users\\320067253\\AlertingSystem\\newfile.json"));
			//parsing the JSON string inside the file that we created earlier.

			JSONArray patientDetail = (JSONArray) obj;
			System.out.println(patientDetail);
			//Json string has been converted into JSONObject

			/*String patientId = (String) jsonObject.get("patientId");
			System.out.println(patientId);

			String spo2 = (String) jsonObject.get("spo2");
			System.out.println(spo2);

			String pulseRate =  (String) jsonObject.get("pulseRate");
			System.out.println(pulseRate);

			String temperature = (String) jsonObject.get("temperature");
			System.out.println(temperature);
			//Displaying values from JSON OBject by using Keys
			*/
  
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}