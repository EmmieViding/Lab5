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
		
		result = sc.userStory2(5, 3);
		assertEquals(8, result);
	}
	
	
	@Test
	public void userStory3() {
		int[] gameArray = {0, 1, 2, 3, 4, 5, 6, 2, 0, 10, 1, 9, 5, 5, 0, 0, 2, 8, 0, 1};
		String result = "";
		
		result = sc.userStory3(gameArray);
		
		assertEquals("[0,1][2,3][4,5][6,2][0,10][1,9][5,5][0,0][2,8][0,1]", result);
	}
	
	@Test
	public void userStory4() {
		int[] gameArray = {0, 1, 2, 3, 4, 5, 6, 2, 0, 10, 1, 9, 5, 5, 0, 0, 2, 8, 0, 1};
		int result = 0;
		
		for(int i = 0; i < gameArray.length; i++)
		{
			result += gameArray[i];
		}
		
		assertEquals(64, result);
	}
	
	@Test
	public void userStory5() {
		int[] gameArray = {0, 1, 2, 3, 4, 5, 6, 2, 10, 0, 1, 9, 5, 5, 0, 0, 2, 8, 0, 1};
		int result = 0;
		String stringResult = "";
		int i = 0;
		
		while(i < gameArray.length - 1)
		{
			if(gameArray[i] == 10)
			{
				stringResult = "Strike";
				result += gameArray[i] + gameArray[i+2] + gameArray[i+3];
			}
			else
			{
				result += gameArray[i] + gameArray[i+1];
			}
			
			i = i+2;
		}
		
		assertEquals(74, result);
		assertEquals("Strike", stringResult);
	}
	
	@Test
	public void userStory6() {
		int[] gameArray = {9, 1, 2, 3, 4, 5, 6, 2, 10, 0, 1, 9, 5, 5, 0, 0, 2, 8, 0, 1};
		int result = 0;
		int i = 0;
		
		while(i < gameArray.length - 1)
		{
			if((gameArray[i] + gameArray[i+1]) == 10 && gameArray[i] != 10 && gameArray[i+1] != 0)
			{
				result += (gameArray[i] + gameArray[i+1] + gameArray[i+2]);
			}
			else
			{
				result += gameArray[i] + gameArray[i+1];
			}
			
			i = i+2;
		}
		
		assertEquals(80, result);
	}
	
	@Test
	public void userStory7() {
		int[] gameArray = {9, 1, 2, 3, 4, 5, 6, 2, 10, 0, 1, 9, 5, 5, 0, 0, 2, 8, 0, 1};
		int result = 0;
		int i = 0;
		
		while(i < gameArray.length - 1)
		{
			
			if(gameArray[i] == 10)
			{
				result += gameArray[i] + gameArray[i+2] + gameArray[i+3];
			}
			else if((gameArray[i] + gameArray[i+1]) == 10 && gameArray[i] != 10 && gameArray[i+1] != 0)
			{
				result += (gameArray[i] + gameArray[i+1] + gameArray[i+2]);
			}
			else
			{
				result += gameArray[i] + gameArray[i+1];
			}
			
			i = i+2;
		}
		
		assertEquals(90, result);
	}
	

}
