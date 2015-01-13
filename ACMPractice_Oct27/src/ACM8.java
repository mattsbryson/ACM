import java.io.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class ACM8 
{
	public static void main(String[] args) throws IOException 
	{
		
		int Good ;
		int Bad ; 

		
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
		//	Scanner out = new Scanner(output); 

			
			java.io.PrintWriter out = new java.io.PrintWriter(output); 
			
			int TOTAL = in.nextInt(); 
		
			for(int n = 0 ; n< TOTAL; n++ ) 
			{
				 Good = 0 ; 
				 Bad = 0; 
				for (int a = 0 ; a < 6 ; a++ )
				{
				
					
					Good += in.nextInt();
				}
				for(int b = 0 ; b < 7 ; b++ )
				{
					Bad += in.nextInt(); 
					
				}
				
				

				if (Good > Bad )
				{
					out.println(" Battle " + (n+1) + ": Good triumphs over Evil" );
					
				}
				else if (Bad > Good)
				{
					out.println("Battle " + (n + 1 ) + ": Evil exadicates alll trace of Good"); 
					
				}
				else if (Bad == Good)
				{
					out.println("Battle " + (n+1) + ": No victor on this battle field"); 
				}
				else
					out.println("");
				
			}
			
		
			out.close();
			
			
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
			
		}
	}
	
}
