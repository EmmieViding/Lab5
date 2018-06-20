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
	
}
