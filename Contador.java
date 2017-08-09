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

	public int count( String word )
	{
		int numOfRep = 0;
		for ( int i=0; i < splitedStr.length; ++i )
		{
			if ( splitedStr[ i ].equals( word ) )
			{
				numOfRep++; 
			}
		}
		return numOfRep;
	}

	public void showCount()
	{
		// Spliting the String
		splitStr();

		for ( int i=0; i < splitedStr.length; ++i )
		{
			int n_rep = count( splitedStr[ i ] );
			System.out.println( splitedStr[ i ] + ": " + n_rep );
		}
		
	}

}
