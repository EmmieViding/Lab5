package Lab5Files;

import static org.junit.Assert.*;

import org.junit.Test;

public class testCases {
	
	sourceCode sc = new sourceCode();

	@Test
	public void userStory1() {
		String result = "";
		int firstThrow = 2;
		int secondThrow = 4;
		
		result = ("[" + firstThrow + ", " + secondThrow + "]");
		
		assertEquals("[2, 4]", result);
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
	
	@Test
	public void userStory8() {
		int[] gameArray = {10, 0, 10, 0, 4, 5, 6, 2, 10, 0, 1, 9, 5, 5, 0, 0, 2, 8, 0, 1};
		int result = 0;
		int i = 0;
		
		while(i < gameArray.length - 1)
		{
			if(gameArray[i] == 10)
			{
				if(gameArray[i+2] == 10)
				{
					result += gameArray[i] + gameArray[i+2] + gameArray[i+4];
				}
				else
				{
					result += gameArray[i] + gameArray[i+2] + gameArray[i+3];
				}
				
			}
			else
			{
				result += gameArray[i] + gameArray[i+1];
			}
			
			i = i+2;
		}
		
		assertEquals(111, result);
	}
	
	
	@Test
	public void userStory9() {
		int[] gameArray = {9, 1, 7, 3, 4, 5, 6, 2, 10, 0, 1, 9, 5, 5, 0, 0, 2, 8, 0, 1};
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
		
		assertEquals(94, result);
	}
	
	
	@Test
	public void userStory10() {
		int[] gameArray = {9, 1, 2, 3, 4, 5, 6, 2, 10, 0, 1, 9, 5, 5, 0, 0, 2, 8, 9, 1};
		int result = 0;
		int i = 0;
		int extraThrow = 0;
		
		while(i < gameArray.length - 1)
		{
			if((gameArray[i] + gameArray[i+1]) == 10 && gameArray[i] != 10 && gameArray[i+1] != 0)
			{
				if(i == gameArray.length - 2)
				{
					extraThrow = 5;
					result += gameArray[i] + gameArray[i+1] + extraThrow;
				}
				else
				{
					result += (gameArray[i] + gameArray[i+1] + gameArray[i+2]);
				}
			
			}
			else
			{
				result += gameArray[i] + gameArray[i+1];
			}
			
			i = i+2;
		}
		
		assertEquals(103, result);
	}
	
	
	@Test
	public void userStory11() {
		int[] gameArray = {9, 1, 2, 3, 4, 5, 6, 2, 10, 0, 1, 9, 5, 5, 0, 0, 2, 8, 10, 0};
		int result = 0;
		int i = 0;
		int firstExtraThrow = 0;
		int secondExtraThrow = 0;
		
		while(i < gameArray.length - 1)
		{
			if(gameArray[i] == 10)
			{
				if(i == gameArray.length - 2)
				{
					firstExtraThrow = 5;
					secondExtraThrow = 2;
					result += gameArray[i] + firstExtraThrow + secondExtraThrow;
				}
				else
				{
					result += (gameArray[i] + gameArray[i+2] + gameArray[i+3]);
				}
			
			}
			else
			{
				result += gameArray[i] + gameArray[i+1];
			}
			
			i = i+2;
		}
		
		assertEquals(99, result);
	}
	
	
	@Test
	public void userStory12() {
		int[] gameArray = {9, 1, 2, 3, 4, 5, 6, 2, 10, 0, 1, 9, 5, 5, 0, 0, 2, 8, 9, 1};
		int result = 0;
		int i = 0;
		int extraThrow = 0;
		
		while(i < gameArray.length - 1)
		{
			if((gameArray[i] + gameArray[i+1]) == 10 && gameArray[i] != 10 && gameArray[i+1] != 0)
			{
				if(i == gameArray.length - 2)
				{
					extraThrow = 10;
					result += gameArray[i] + gameArray[i+1] + extraThrow;
				}
				else
				{
					result += (gameArray[i] + gameArray[i+1] + gameArray[i+2]);
				}
			
			}
			else
			{
				result += gameArray[i] + gameArray[i+1];
			}
			
			i = i+2;
		}
		
		assertEquals(108, result);
	}
	
	@Test
	public void userStory13() {
		int[] gameArray = {10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0};
		int result = 0;
		int i = 0;
		int firstExtraThrow = 0;
		int secondExtraThrow = 0;
		
		
		while(i < gameArray.length - 1)
		{
			if(gameArray[i] == 10)
			{
				if(i == (gameArray.length - 2))
				{
					firstExtraThrow = 10;
					secondExtraThrow = 10;
					result += gameArray[i] + firstExtraThrow + secondExtraThrow;
				}
				
				else
				{
					if(gameArray[i+2] == 10 )
					{
						if(i+4 >= gameArray.length)
						{
							result +=gameArray[i] + gameArray[i+2] + 10;
						}
						else
						{
							result += gameArray[i] + gameArray[i+2] + gameArray[i+4];
						}
						
					}
					else
					{
						result += gameArray[i] + gameArray[i+2] + gameArray[i+3];
					}
				}
				
			
			}
			
			else
			{
				result += gameArray[i] + gameArray[i+1];
			}
			
			i = i+2;
		}
		
		assertEquals(300, result);
	}
	
	
	@Test
	public void userStory14() {
		int[] gameArray = {6, 3, 7, 1, 8, 2, 7, 2, 10, 0, 6, 2, 7, 3, 10, 0, 8, 0, 7, 3};
		int result = 0;
		int i = 0;
		int extraThrow = 10;
		
		while(i < gameArray.length - 1)
		{
			if((gameArray[i] + gameArray[i+1]) == 10 && gameArray[i] != 10 && gameArray[i+1] != 0)
			{
				if(i == gameArray.length - 2)
				{
					result += gameArray[i] + gameArray[i+1] + extraThrow;
				}
				else
				{
					result += (gameArray[i] + gameArray[i+1] + gameArray[i+2]);
				}
			
			}
			
			else if(gameArray[i] == 10)
			{
				result += (gameArray[i] + gameArray[i+2] + gameArray[i+3]);
			}
			
			else
			{
				result += gameArray[i] + gameArray[i+1];
			}
			
			i = i+2;
		}
		
		assertEquals(135, result);
	}
	

}
