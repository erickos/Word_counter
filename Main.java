import java.util.Scanner;

public class Main 
{
	public static void main (String[] args)
	{
		Scanner s = new Scanner( System.in );
		
		System.out.println( "Digite uma frase : " );	
		String line = s.nextLine();

		Contador cont = new Contador( line );

		cont.showCount();	
	}	
	
}
