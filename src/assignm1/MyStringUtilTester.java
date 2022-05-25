package assignm1;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MyStringUtilTester {

	@Test
	public void testSize() {
		MyStringUtil assignm1 = new MyStringUtil();
		assertEquals(6, assignm1.size("hcfvsd"));
		assertNotEquals(6, assignm1.size("hcfvssd"));
		assertEquals(12, assignm1.size("vishal sahal"));
		assertEquals(5, assignm1.size("scars"));
	}

	@Test
	public void testToUpperCase() {
		MyStringUtil assignm1 = new MyStringUtil();
		assertEquals("HCFVSD", assignm1.toUpperCase("hcfvsd"));
		assertNotEquals("Hcfvsd", assignm1.toUpperCase("hcfvsd"));
		assertEquals("VISHAL SAHAL", assignm1.toUpperCase("vishal sahal"));
		assertEquals("ABCDEF", assignm1.toUpperCase("abcdef"));
	}

	@Test
	public void testPrintOneByOne() {
		MyStringUtil assignm1 = new MyStringUtil();
		assertEquals(new StringBuilder("H\nC\nF\nV\nS\nD").toString(), assignm1.printOneByOne("HCFVSD").toString());
		assertEquals(new StringBuilder("V\nI\nS\nH\nA\nL").toString(), assignm1.printOneByOne("VISHAL").toString());
	}

	@Test
	public void testReverese() {
		MyStringUtil assignm1 = new MyStringUtil();
		assertEquals("ih", assignm1.reverse("hi"));
		assertNotEquals("lahsisv", assignm1.reverse("vishal"));
		assertEquals("malayalam", assignm1.reverse("malayalam"));
	}

	@Test
	public void testIsPalindrome() {
		MyStringUtil assignm1 = new MyStringUtil();
		assertTrue(assignm1.isPalindrome("malayalam"));
		assertFalse(assignm1.isPalindrome("Vishal"));
	}

	@Test
	public void testGetMaxChar() {
		MyStringUtil assignm1 = new MyStringUtil();
		assertEquals('v', assignm1.getMaxChar("vishal"));
		assertEquals('z', assignm1.getMaxChar("ggsoahz"));

	}

	@Test
	public void testWordReverese() {
		MyStringUtil assignm1 = new MyStringUtil();
		assertNotEquals("vishal is good", assignm1.wordReverse("vishal is good"));
		assertEquals("olleh ym ylevol ydal", assignm1.wordReverse("hello my lovely lady"));
		assertEquals("malayalam si doog", assignm1.wordReverse("malayalam is good"));
	}

	@Test
	public void testSub() {
		MyStringUtil assignm1 = new MyStringUtil();
		assertEquals("hel", assignm1.sub("hello world", 0, 3));
		assertEquals("hell", assignm1.sub("hello world", 0, 4));
	}

	@Test
	public void testCountEachWordLength() {
		MyStringUtil assignm1 = new MyStringUtil();
		assertArrayEquals(new int[] { 2, 4, 2, 6 }, assignm1.countEachWordLength("my name is vishal"));
	}

	@Test
	public void testPrefix() {
		MyStringUtil assignm1 = new MyStringUtil();
		assertEquals(("say hello"), assignm1.prefix("hello", "say"));
	}

	@Test
	public void testSuffix() {
		MyStringUtil assignm1 = new MyStringUtil();
		assertEquals(("say hello"), assignm1.suffix("say", "hello"));
	}

	@Test
	public void testReverseCase() {
		MyStringUtil assignm1 = new MyStringUtil();
		assertEquals(("HELLo"), assignm1.reverseCase("hellO"));
	}

	@Test
	public void testFindLargestPalindrome() {
		MyStringUtil assignm1 = new MyStringUtil();
		assertEquals((" malayalam "), assignm1.findLargestPalindrome("civic radar level malayalam "));
		assertEquals((" straw warts "),
				assignm1.findLargestPalindrome("my madam speaks straw warts malayalam Language"));
	}

	@Test
	public void testSubS() {
		MyStringUtil assignm1 = new MyStringUtil();
		assertEquals(("abc"), assignm1.subS("abc"));
	}
}
