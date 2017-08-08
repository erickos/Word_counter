public class Contador
{
	private String line;
	private String[] splitedStr;

	public Contador ( String line )
	{
		this.line = line;
	}

	public String getLine()
	{
		return line;
	}	

	public String[] getSplitedStr()
	{
		return splitedStr;
	}

	public void splitStr()
	{		
		splitedStr = line.split(" ");
	
	}

	public void showCount()
	{
		// Spliting the String
		splitStr();
		
	}
}
