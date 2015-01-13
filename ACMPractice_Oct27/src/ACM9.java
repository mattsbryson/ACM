import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class ACM9 
{

	public static void main(String[] args) throws IOException 
	{
		try 
		{
			File input = new File("input.txt");
			
			if(!input.exists())
			{
				input.createNewFile();
			}
		
			
			File output = new File("output.txt");
		
			if(!output.exists())
			{
				output.createNewFile();
			}
			
			
			Scanner in = new Scanner(input); 

			
			java.io.PrintWriter out = new java.io.PrintWriter(output); 
			
			int n = in.nextInt(); 
			
			
			double k = 0 ; 
			double count = 0; 
			
			while(true)
			{
				String temp = (n * k + " " );
				
				for ( int z = 0 ; z < temp.length() ; z++)
				{
					if ()
					{
						out.println("");
						
					}
				}
			}
		}
		
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
			
		}
	
	}
	
}
