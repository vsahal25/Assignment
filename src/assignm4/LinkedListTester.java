package assignm4;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class LinkedListTester {

	LinkedList list = new LinkedList();{
		list.add("eena");
		list.add("meena");
		list.add("deeka");
		list.add("deeksha");
	}

	@Test
	public void addTest() {
		assertEquals("a", list.add("a").getData());
		assertEquals("abc", list.add("abc").getData());
		assertEquals("abcd", list.add("abcd").getData());
	}

}
