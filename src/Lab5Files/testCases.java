package Lab5Files;

import static org.junit.Assert.*;

import org.junit.Test;

public class testCases {

	@Test
	public void userStory1() {
		int firstThrow;
		int secondThrow;
		
		firstThrow = 2;
		secondThrow = 3;
		
		assertEquals(2, firstThrow);
		assertEquals(3, secondThrow);
	}

}
