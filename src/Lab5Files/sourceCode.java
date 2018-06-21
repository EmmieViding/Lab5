package Lab5Files;

public class sourceCode {

	
	public int userStory2(int firstThrow, int secondThrow)
	{
		int result;
		
		result = firstThrow + secondThrow;
		
		if(result > 10)
		{
			result = -1;
		}
		
		return result;
	}
	
	public String userStory3(int []gameArray)
	{
		String result = "";
		int i = 0;
		
		while(i < gameArray.length - 1)
		{
			result += ("[" + gameArray[i] + "," + gameArray[i+1] + "]" );
			i = i+2;
		}
		
		return result;
	}
	
	
}
