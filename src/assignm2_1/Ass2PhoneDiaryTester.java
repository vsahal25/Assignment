package assignm2_1;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import org.junit.Test;


public class Ass2PhoneDiaryTester {
	
	@Test
	public void removeByValue() throws IOException {
		@SuppressWarnings("unused")
		PhoneDiary assignm2_1 = new PhoneDiary();
		HashMap<String, String> expectedMaps = new HashMap<>();{
			expectedMaps.put("heena", "70");
//			expectedMaps.put("eena", "100");
			expectedMaps.put("meena", "200");
			expectedMaps.put("deeka", "300");
			expectedMaps.put("dai", "400");
			expectedMaps.put("dominika", "500");
			expectedMaps.put("saloni", "345");

			assertEquals(expectedMaps, PhoneDiary.removeByValue());
		}

	}



	@Test
	public void getDetailsTest() throws FileNotFoundException {
		@SuppressWarnings("unused")
		PhoneDiary assignm2_1 = new PhoneDiary();
		HashMap<String, String> ExpectedMaps = new HashMap<>();{
			ExpectedMaps.put("eena", "100");
			ExpectedMaps.put("meena", "200");
			ExpectedMaps.put("deeka", "300");
			ExpectedMaps.put("dai", "400");
			ExpectedMaps.put("dominika", "500");
			ExpectedMaps.put("heena", "70");
			ExpectedMaps.put("saloni", "345");
	
	
			assertEquals(ExpectedMaps, PhoneDiary.getDetails());
		}
	
	}

	@Test
	public void addTest() throws IOException {
		@SuppressWarnings("unused")
		PhoneDiary assignm2_1 = new PhoneDiary();
		HashMap<String, String> expectedMaps = new HashMap<>();{
			expectedMaps.put("eena", "100");
			expectedMaps.put("meena", "200");
			expectedMaps.put("heena", "70");
			expectedMaps.put("deeka", "300");
			expectedMaps.put("dai", "400");
			expectedMaps.put("dominika", "500");
			expectedMaps.put("saloni", "345");
			assertEquals(expectedMaps, PhoneDiary.add("saloni", "345"));
		}
	
	}

	

}
