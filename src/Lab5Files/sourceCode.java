package Lab5Files;

public class sourceCode {

	public String userStory1(int firstThrow, int secondThrow)
	{
		String result = null;
		
		if(firstThrow > 10 || secondThrow > 10 || firstThrow > 10 && secondThrow > 10 )
		{
			result = "Error";
		}
		else {
			result = ("[" + firstThrow + ", " + secondThrow + "]");
		}
		
		return result;
	}
	
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
	
	
}
