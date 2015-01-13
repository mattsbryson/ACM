import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class p2
{
	public static void main(String[] args) throws IOException 
	{
		 
		
		
		File input = new File(".\\lib\\2input.txt");
			if(!input.exists())
			{
				input.createNewFile();
			}
		File output = new File(".\\lib\\2output.txt");
			if(!output.exists())
			{
				output.createNewFile();
			}
		
		Scanner in = new Scanner(input);
		PrintWriter out = new PrintWriter(output);
		
		ArrayList pulleys = new ArrayList();
		
		while(in.hasNext())
		{
			int inP = in.nextInt();
			
			pulleys.add(inP);

			
		}
		
		for(int i = 3; i < pulleys.size(); i+=3)
		{
			d x1 = pulleys.get(i - 3), x2 = i, y1 = i - 2, y2 = i + 1;
			double r1 = i - 1;
			double r2 = i + 2;
			
			System.out.println(x1 + x2 + y1 + y2);
			
		}
		
		
		
		
		 
		
		double C = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 -y1, 2));
		double lO = Math.sqrt((Math.pow(C, 2)) - Math.pow((r1 - r2), 2));
		double lC = Math.sqrt((Math.pow(C, 2)) - Math.pow((r1 + r2), 2));
		double tO = Math.asin((r1-r2)/C);
		double tC = Math.asin((r1+r2)/C);
		
		
		out.close();
	}
	

}
