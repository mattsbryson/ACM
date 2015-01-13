import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Analysis 
{

	public static void main(String[] args) 
	{
		int n = 0;
		int m = 0;
		int j = 0;
		int c = 0;
		int k = 0;
		int d = 0;
		int i = 0;
		int rNeed = 0;
		int rHave = 0;
		
		
		//streaming data
		BufferedReader input = null;
		try
		{
			String line;
			input = new BufferedReader(new FileReader(".\\lib\\input.txt"));
			
			while ((line = input.readLine()) != null)
			{
				String in1 = null;
				String in2 = null;
				System.out.println(line);
				int delim = line.indexOf(' ');
				System.out.println(delim);
				
				int len = line.length();
				in1 = line.substring(0, delim);
				in2 = line.substring(delim + 1, len - 1);
				if(i == 0)
				{
					n = Integer.parseInt(in1);
					m = Integer.parseInt(in2);
					System.out.println(n + " " + m);
				}
				else if(i < n)
				{
					j = Integer.parseInt(in1);
					c = Integer.parseInt(in2);
					rNeed += j * c;
					System.out.println(j + " " + c);
				}
				else
				{
					k = Integer.parseInt(in1);
					d = Integer.parseInt(in2);
					rHave += k * d;
					System.out.println(k + " " + d);
				}
				i++;
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if (input != null)
				{
					input.close();
				}
			}
			catch (IOException g)
			{
				g.printStackTrace();
			}
		}
		//stream closed
		
		System.out.println("rHave:" + rHave + " rNeed:" + rNeed);

	}

}
