package Lab5Files;

import static org.junit.Assert.*;

import org.junit.Test;

public class testCases {
	
	sourceCode sc = new sourceCode();

	@Test
	public void userStory1() {
		String result;

		result = sc.userStory1(2, 3);
		
		assertEquals("[2, 3]", result);
	}
	

}
