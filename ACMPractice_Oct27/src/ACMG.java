import java.io.*;
import java.util.Scanner;

public class ACMG 
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
			
			while(in.hasNext())
			{
				double A = in.nextDouble();
				int Level = 0 ; 
				
				for (double i = A ; i > -1 ; i -- )
				{
					String Bin = "" ; 

					
					int One = 0  ; 
					
					Bin = Integer.toBinaryString((int)i);
					for (int e = 0 ; e < Bin.length() ; e++)
					{
						if (Bin.charAt(e) == '1')
						{
							One++; 
						}
						

					}
					
				if(One% 3 == 0 && One != 0){
					Level ++ ; 
					System.out.println(Bin); 
				}

							
				}
					
					
					out.println("Day" + A + "Level = " + Level);

			}

			out.close();
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
			
		}
	
	}
	
	
}
