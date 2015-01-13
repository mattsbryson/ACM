import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class template 
{
	public static void main(String[] args) throws IOException 
	{
		 
		
		
		File input = new File(".\\lib\\input.txt");
			if(!input.exists())
			{
				input.createNewFile();
			}
		File output = new File(".\\lib\\output.txt");
			if(!output.exists())
			{
				output.createNewFile();
			}
		
		Scanner in = new Scanner(input);
		PrintWriter out = new PrintWriter(output);
		
		while(in.hasNext())
		{
				
			
			out.println();
			
		}
		
		out.close();
	}
	

}
