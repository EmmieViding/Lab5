package Lab5Files;

import static org.junit.Assert.*;

import org.junit.Test;

public class testCases {

	@Test
	public void userStory1() {
		int firstThrow;
		int secondThrow;
		String result;
		
		firstThrow = 2;
		secondThrow = 3;
		
		result = ("[" + firstThrow + ", " + secondThrow + "]");
		
		assertEquals("[2, 3]", result);
	}
	
	@Test
	public void userStory2() {
		
	}

}
