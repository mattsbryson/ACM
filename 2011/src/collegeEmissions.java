import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class collegeEmissions
{
	public static void main(String[] args) throws IOException 
	{
		 
		
		
		File emInput = new File(".\\lib\\emInput.txt");
			if(!emInput.exists())
			{
				emInput.createNewFile();
			}
		File emOutput = new File(".\\lib\\emOutput.txt");
			if(!emOutput.exists())
			{
				emOutput.createNewFile();
			}
		
		Scanner in = new Scanner(emInput);
		PrintWriter out = new PrintWriter(emOutput);
		
		while(in.hasNext())
		{
			String temp = in.next();
			String col = "";
			double enroll = 0.0;
			double full = 0.0;
			double minCost = 0.0;
			double maxCost = 0.0;
			int loc = 0;
			
			loc = temp.indexOf(',');
			col = temp.substring(0, loc);
			temp = temp.substring(loc + 1);
				
			loc = temp.indexOf(',');
			enroll = Double.parseDouble(temp.substring(0, loc));
			temp = temp.substring(loc + 1);
				
			loc = temp.indexOf(',');
			full = Double.parseDouble(temp.substring(0, loc));
			temp = temp.substring(loc + 1);
			
			loc = temp.indexOf(',');
			minCost = Double.parseDouble(temp.substring(0, loc));
			temp = temp.substring(loc + 1);
			
			loc = temp.indexOf(',');
			maxCost = Double.parseDouble(temp);
			
			
			double FPUmin = Math.round(minCost / (enroll));
			double FPUmax = Math.round(maxCost / (enroll));
			double FPSmin = Math.round(minCost / (enroll /full));
			double FPSmax = Math.round(maxCost / (enroll /full));
			
			
		
			out.println(col + ", Fees per Unit: $" + FPUmin + "-$" + FPUmax +   full + "," + minCost + "," + maxCost);
			
			
		}
		
		out.close();
	}
	
	
	

}
