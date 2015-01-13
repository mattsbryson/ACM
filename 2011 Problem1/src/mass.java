import java.io.*;
import java.util.*;


public class mass {

	public static void main(String[] args) throws IOException 
	{
		int min;
		int hr;
		int day;
		int month;
		int [] year;
		
		String sDate;
		String eDate; 
		
		
		
		
		
		
		File input = new File(".\\lib\\input.txt");
		File output = new File(".\\lib\\output.txt");
			if(!output.exists())
			{
				output.createNewFile();
			}
		Scanner in = new Scanner(input);
		PrintWriter out = new PrintWriter(output);
		
		while(in.hasNext())
		{
			min = in.nextInt();
			hr = in.nextInt();
			day = in.nextInt();
			month = in.nextInt();
			year = new int [month];
			for(int i = 0; i < month; i++)
			{
				year [i] = in.nextInt();
			}
			
			sDate = in.next();
			eDate = in.next();
			
			int sMonth = 0;
			int sDay = 0;
			int sYear = 0;
			int sHour = 0;
			int sMin = 0;
			int sSec = 0;
			
			int eMonth = 0;
			int eDay = 0;
			int eYear = 0;
			int eHour = 0;
			int eMin = 0;
			int eSec = 0;
			
			sMonth = Integer.parseInt(sDate.substring(0 , sDate.indexOf('/')));
			sDate = sDate.substring(sDate.indexOf('/'));
			System.out.println(sDate);

		}
		

	}

}
