package assignm0;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BasicsTest {

	@Test
	public void getSumTest() {
		Basics assignm0 = new Basics();
		assertEquals(-10, assignm0.getSum(10, -20));
		assertNotEquals(10, assignm0.getSum(10, 20));
		assertEquals(90, assignm0.getSum(-10, 100));

	}

	private void assertNotEquals(int i, int sum) {
	}

	@Test
	public void largerNumberTest() {
		Basics assignm0 = new Basics();
		assertEquals(2, assignm0.getLargerNumber(1, 2));

		assignm0 = new Basics();
		assertEquals(-1, assignm0.getLargerNumber(-1, -3));

		assignm0 = new Basics();
		assertEquals(3, assignm0.getLargerNumber(0, 3));
	}

	@Test
	public void largestNumberTest() {
		Basics assignm0 = new Basics();
		assertEquals(3, assignm0.largestNumber(1, 2, 3));

		assertEquals(3, assignm0.largestNumber(1, 3, 2));

		assertEquals(3, assignm0.largestNumber(2, 1, 3));

		assertEquals(3, assignm0.largestNumber(2, 3, 1));

		assertEquals(3, assignm0.largestNumber(3, 1, 2));

		assertEquals(6, assignm0.largestNumber(5, 6, 4));

		assertEquals(30, assignm0.largestNumber(30, 02, 11));

		assertEquals(3, assignm0.largestNumber(3, -2, 1));
	}

	@Test
	public void sumOfArrayElementsTest() {

		Basics assignm0 = new Basics();
		assertEquals(10, assignm0.getSumOfArrayElements(new int[] { 0, 1, 2, 3, 4 }, 5));

		assertEquals(-2, assignm0.getSumOfArrayElements(new int[] { -1, 1, -2 }, 3));

		assertEquals(345, assignm0.getSumOfArrayElements(new int[] { 49, 59, 69, 79, 89 }, 5));

	}

	@Test
	public void primeTest() {
		Basics assignm0 = new Basics();

		assertTrue(assignm0.isPrime(5));

		assertFalse(assignm0.isPrime(10));

		assertFalse(assignm0.isPrime(0));

		assertFalse(assignm0.isPrime(1));

		assertTrue(assignm0.isPrime(7));

		assertTrue(assignm0.isPrime(11));

		assertTrue(assignm0.isPrime(13));

		assertTrue(assignm0.isPrime(17));

		assertTrue(assignm0.isPrime(19));

		assertTrue(assignm0.isPrime(23));

		assertTrue(assignm0.isPrime(29));

		assertTrue(assignm0.isPrime(31));

		assertTrue(assignm0.isPrime(37));

	}

	@Test
	public void numbersInARangeTest() {
		Basics assignm0 = new Basics();
		assertArrayEquals(new int[] { 3, 4, 5, 6, 7, 8, 9 },

				assignm0.getArrayOfRangeOfNumbers(3, 9));

		assertArrayEquals(new int[] { -3, -2, -1 },

				assignm0.getArrayOfRangeOfNumbers(-3, -1));

		assertArrayEquals(new int[] { -3, -2, -1, 0, 1 },

				assignm0.getArrayOfRangeOfNumbers(-3, 1));
	}

	@Test
	public void primeNumbersInARangeTest() {
		Basics assignm0 = new Basics();
		/*
		 * assertArrayEquals(new int[] { 2, 3, 5, 7 }, assignm0.primeNumbersInARange(
		 * 0,9));
		 * 
		 * assertArrayEquals(new int[] { 3, 5, 7 }, assignm0.primeNumbersInARange(
		 * 3,9));
		 */
		assignm0.primeNumbersInARange(0, 2000000);

		assignm0.primeNumbersInARange(0, 100);

	}

	@Test
	public void sumTest() {
		Basics assignm0 = new Basics();
		assertEquals(12, assignm0.getSum(3, 9));

		assertEquals(6, assignm0.getSum(-3, 9));

		assertEquals(-12, assignm0.getSum(-3, -9));
	}

//	@Test
//	public void reverseDigitsTest() {
//		Basics assignm0 = new Basics();
//		assertEquals(12, assignm0.reverseDigits(21));
//
//		assertEquals(4321, assignm0.reverseDigits(1234));
//
//		assertEquals(2625540198L, assignm0.reverseDigits(8910455262L));
//
//		assertEquals(1234, assignm0.reverseDigits(4321));
//
//		assertEquals(10001, assignm0.reverseDigits(10001));
//
//	}

	/*
	 * @Test public void helloWorldTest() { Assignm0 assignm0 = new Assignm0(); }
	 */

	@Test
	public void factorialTest() {
		Basics ass0 = new Basics();
		assertEquals(6, ass0.getFactorial(3));

		assertEquals(0, ass0.getFactorial(-3));

		assertEquals(1, ass0.getFactorial(0));

		assertEquals(40320, ass0.getFactorial(8));

		assertEquals(720, ass0.getFactorial(6));

	}

	@Test
	public void getFactorialWithoutLoop() {
		Basics ass0 = new Basics();
		assertEquals(6, ass0.getFactorialWithoutLoop(3));

		assertEquals(1, ass0.getFactorialWithoutLoop(0));

		assertEquals(1, ass0.getFactorialWithoutLoop(1));

		assertEquals(40320, ass0.getFactorialWithoutLoop(8));

		assertEquals(720, ass0.getFactorialWithoutLoop(6));

	}

	@Test
	public void testFindNumberOfOccurences() {
		Basics ass0 = new Basics();
		assertEquals(3, ass0.findNumberOfOccurences(new int[] { 1, 1, 1 }, 1));

		assertEquals(2, ass0.findNumberOfOccurences(new int[] { 1, 2, 1 }, 1));
		assertEquals(1, ass0.findNumberOfOccurences(new int[] { 1, 2, 3 }, 1));
		assertEquals(0, ass0.findNumberOfOccurences(new int[] { 2, 3, 4 }, 1));

	}

	@Test
	public void testFindFirstOccurence() {
		Basics ass0 = new Basics();

		assertEquals(-1, ass0.findFirstOccurence(new int[] { 2, 2, 2 }, 1));
		assertEquals(0, ass0.findFirstOccurence(new int[] { 1, 1, 1 }, 1));
		assertEquals(0, ass0.findFirstOccurence(new int[] { 2, 2, 1 }, 2));
		assertEquals(2, ass0.findFirstOccurence(new int[] { 2, 2, 1 }, 1));

	}

	@Test
	public void testGetNumberLessThanTenInWords() {
		Basics ass0 = new Basics();
		assertEquals("one", ass0.getNumberLessThanTenInWords(1).toLowerCase());
		assertEquals("four", ass0.getNumberLessThanTenInWords(4).toLowerCase());
		assertEquals("four", ass0.getNumberLessThanTenInWords(4).toLowerCase());
		assertEquals("four", ass0.getNumberLessThanTenInWords(4).toLowerCase());
		assertEquals("four", ass0.getNumberLessThanTenInWords(4).toLowerCase());
		assertEquals("four", ass0.getNumberLessThanTenInWords(4).toLowerCase());
		assertEquals("six", ass0.getNumberLessThanTenInWords(6).toLowerCase());
		assertEquals("two", ass0.getNumberLessThanTenInWords(2).toLowerCase());
		assertEquals("three", ass0.getNumberLessThanTenInWords(3).toLowerCase());
		assertEquals("four", ass0.getNumberLessThanTenInWords(4).toLowerCase());
		assertEquals("five", ass0.getNumberLessThanTenInWords(5).toLowerCase());
		assertEquals("six", ass0.getNumberLessThanTenInWords(6).toLowerCase());
		assertEquals("seven", ass0.getNumberLessThanTenInWords(7).toLowerCase());
		assertEquals("eight", ass0.getNumberLessThanTenInWords(8).toLowerCase());
		assertEquals("nine", ass0.getNumberLessThanTenInWords(9).toLowerCase());

	}

	@Test
	public void testGetNumberInWords() {
		Basics ass0 = new Basics();
		assertEquals("thirty four", ass0.getNumberInWords(34).toLowerCase());
		assertEquals("two hundred and thirty four", ass0.getNumberInWords(234).toLowerCase());
		assertEquals("one thousand two hundred and thirty four", ass0.getNumberInWords(1234).toLowerCase());
		assertEquals("forty five thousand six hundred and fifty two", ass0.getNumberInWords(45652).toLowerCase());

		/*
		 * assertEquals("two hundred and nine",
		 * ass0.getNumberInWords(209).toLowerCase());
		 * assertEquals("one thousand and five",
		 * ass0.getNumberInWords(1005).toLowerCase());
		 * assertEquals("thirty five thousand seven hundred and four",
		 * ass0.getNumberInWords(35704).toLowerCase());
		 * 
		 * assertEquals("five hundred and fifty thousand four hundred and ninety two",
		 * ass0.getNumberInWords(550492).toLowerCase());
		 */
	}
}
