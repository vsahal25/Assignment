package assignm2;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Test;


public class Ass2PhoneDiaryTester {

	@Test
	public void replaceHashMap() {
		Ass2PhoneDiary assignm2 = new Ass2PhoneDiary();
		HashMap<String, String> ExpectedMaps = new HashMap<>();{
			ExpectedMaps.put("eena", "100");
			ExpectedMaps.put("meena", "400");
			ExpectedMaps.put("deeka", "300");
			ExpectedMaps.put("dai", "400");
			ExpectedMaps.put("dominika", "500");


			assertEquals(ExpectedMaps, assignm2.replaceMaps());
		}

	}
	
	@Test
	public void printAll() {
		Ass2PhoneDiary assignm2 = new Ass2PhoneDiary();
		HashMap<String, String> expectedMaps = new HashMap<>();{
			expectedMaps.put("eena", "100");
			expectedMaps.put("meena", "200");
			expectedMaps.put("deeka", "300");
			expectedMaps.put("dai", "400");
			expectedMaps.put("dominika", "500");
			assertEquals(expectedMaps, Ass2PhoneDiary.printAll());
		}

	}

	@Test
	public void removeByValue() {
		Ass2PhoneDiary assignm2 = new Ass2PhoneDiary();
		HashMap<String, String> expectedMaps = new HashMap<>();{
			//			expectedMaps.put("eena", "100");
			expectedMaps.put("meena", "200");
			expectedMaps.put("deeka", "300");
			expectedMaps.put("dai", "400");
			expectedMaps.put("dominika", "500");

			assertEquals(expectedMaps, Ass2PhoneDiary.removeByValue1());
		}

	}



	@Test
	public void getHashMapName() {
		Ass2PhoneDiary assignm2 = new Ass2PhoneDiary();

		assertEquals("100", assignm2.getNameMaps());


	}
	@Test
	public void getDetails() {
		Ass2PhoneDiary assignm2 = new Ass2PhoneDiary();

		assertEquals("100", assignm2.getNameMaps());


	}

}
