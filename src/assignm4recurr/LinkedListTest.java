package assignm4recurr;

import static org.junit.Assert.assertEquals;



import org.junit.jupiter.api.Test;



class LinkedListTest {
	LinkedListRecur<String> list = new LinkedListRecur<String>();{
		list.create("eena");
		list.create("meena");
		list.create("deeka");
		list.create("deeksha");
	}

	@Test
	public void addTest() {
		assertEquals("a", list.create("a").getData());
		assertEquals("abc", list.create("abc").getData());
		assertEquals("abcd", list.create("abcd").getData());
	}
	
	@Test
	public void getFirst() {
		assertEquals("eena",list.getFirst().getData());
		

	}

}
