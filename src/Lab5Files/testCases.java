package Lab5Files;

import static org.junit.Assert.*;

import org.junit.Test;

public class testCases {
	
	sourceCode sc = new sourceCode();

	@Test
	public void userStory1() {
		String result;

		result = sc.userStory1(2,3);
		
		assertEquals("[2, 3]", result);
	}
	
	@Test
	public void userStory2() {
		int result;
		int firstThrow = 5;
		int secondThrow = 3;
		
		result = firstThrow + secondThrow;
		assertEquals(8, result);
	}
	

}
