package assignm2_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;



import java.util.Map.Entry;


public class PhoneDiary {
	
	final static String LOCATION= "/home/vishalsahal/Downloads/assZero/src/assignm2_1/diary.properties";

	final static HashMap<String,String> maps = new HashMap<>();

	public static Properties getPropertiesInput() throws FileNotFoundException {
		FileInputStream input = new FileInputStream(LOCATION);
		Properties prop = new Properties();
		try {
			prop.load(input);
		}catch(IOException e)  {
			System.out.println("Couldn't load propeties correctly :"+e.getMessage());
		}
		return prop;
	}



	public static Map<String,String> getDetails() throws FileNotFoundException{
		Properties properties= getPropertiesInput();
		for(Entry<Object, Object> entry : properties.entrySet()) {
			maps.put((String)entry.getKey(),(String)entry.getValue());
		}
		return maps;

	}

	public static Map<String,String> add(String str1, String str2) throws IOException{
		Properties properties= getPropertiesInput();
		getDetails();
		maps.put(str1, str2);
		FileOutputStream output = new FileOutputStream(LOCATION);
		properties.setProperty("saloni", "345");
		properties.store(output, null);
		getDetails();
		System.out.println("\n The detailed Maps after additions are as follows: \n" +maps);
		return maps;
	}

	public static Map<String,String> removeByValue() throws IOException{
		Properties properties= getPropertiesInput();
		getDetails();
		System.out.println("\n Original HashMap: \n"+ maps);
		String valueToBeRemoved = "100";
		Iterator<Entry<String, String>> iterator = maps.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, String>entry = iterator.next();
			if (valueToBeRemoved.equals(entry.getValue())) {
				iterator.remove();
			}
		}
		FileOutputStream output = new FileOutputStream(LOCATION);
		properties.store(output, null);
		System.out.println("\n New HashMap: \n"+maps);
		return maps;
	}

}



