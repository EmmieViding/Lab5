package Lab5Files;

public class sourceCode {
	
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
