import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class shiftDiff
{
	public static void main(String[] args) throws IOException 
	{
		 
		
		
		File inputShift = new File(".\\lib\\inputShift.txt");
			if(!inputShift.exists())
			{
				inputShift.createNewFile();
			}
		File outputShift = new File(".\\lib\\outputShift.txt");
			if(!outputShift.exists())
			{
				outputShift.createNewFile();
			}
		
		Scanner in = new Scanner(inputShift);
		PrintWriter out = new PrintWriter(outputShift);
		
		String times = in.nextLine();
		String SwingStart = times.substring(0, times.indexOf(','));
		Double SwingStartHour = Double.parseDouble(SwingStart.substring(0, times.indexOf(':')));
		SwingStartHour = SwingStartHour + (Double.parseDouble(SwingStart.substring(times.indexOf(':') + 1))/ 60);
		
		times = times.substring(times.indexOf(',')+ 1);
		String SwingEnd = times.substring(0, times.indexOf(','));
		Double SwingEndHour = Double.parseDouble(SwingEnd.substring(0, times.indexOf(':')));
		SwingEndHour = SwingEndHour + (Double.parseDouble(SwingEnd.substring(times.indexOf(':') + 1))/ 60);

		times = times.substring(times.indexOf(',')+ 1);
		String Grave = times.substring(0, times.indexOf(','));
		Double GraveTime = Double.parseDouble(Grave.substring(0, times.indexOf(':')));
		GraveTime = SwingEndHour + (Double.parseDouble(Grave.substring(times.indexOf(':') + 1))/ 60);

		times = times.substring(times.indexOf(',')+ 1);
		Double SwingPay = Double.parseDouble(times.substring(0, times.indexOf(',')));
		times = times.substring(times.indexOf(',')+ 1);

		Double GravePay = Double.parseDouble(times);
		
		while(in.hasNext())
		{
		



			
			
			out.println();
			
		}
		
		out.close();
	}

}
