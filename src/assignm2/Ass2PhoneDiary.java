package assignm2;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;


@SuppressWarnings("unused")
public class Ass2PhoneDiary {

	static HashMap<String, String> maps = new HashMap<>();{
		maps.put("eena", "100");
		maps.put("meena", "200");
		maps.put("deeka", "300");
		maps.put("dai", "400");
		maps.put("dominika", "500");
		System.out.println(maps);
	}



	public static HashMap<String, String>  printAll() {
		for(String i : maps.keySet()) {
			System.out.print(i+"\t"+"= ");
			System.out.println(maps.get(i));
		}
		return maps;
	}


	public HashMap<String, String> replaceMaps() {
		System.out.println("Original : "+maps);
		maps.put("meena", "400");
		System.out.println("New : "+maps);
		return maps;

	}



	public static HashMap<String, String>  removeByValue1() {
		String valueToBeRemoved = "100";
		System.out.println("Original HashMap: "+ maps);
		Iterator<Entry<String, String>> iterator = maps.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, String>entry = iterator.next();
			if (valueToBeRemoved.equals(entry.getValue())) {
				iterator.remove();
			}
		}
		System.out.println("New HashMap: "+maps);
		return maps;
	}



	public String  getNameMaps() {
		String a;
		a= maps.get("eena");
		System.out.println(a);
		return a;

	}


}
