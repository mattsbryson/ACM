import java.io.*;
import java.util.*;


public class nasa {

	public static void main(String[] args) throws IOException 
	{
		int min;
		int hr;
		int day;
		int month;
		int diy = 0;
		int [] year;
		
		String sDate;
		String eDate; 
		
		
		
		
		File input = new File(".\\lib\\input.txt");
		File output = new File(".\\lib\\output.txt");
		
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
				diy += year [i];
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
			
			int sTotal;
			int eTotal;
			
			sMonth = Integer.parseInt(sDate.substring(0 , sDate.indexOf('/')));
			sDate = sDate.substring(sDate.indexOf('/') + 1);
			sDay = Integer.parseInt(sDate.substring(0 , sDate.indexOf('/')));
			sDate = sDate.substring(sDate.indexOf('/') + 1);
			sYear = Integer.parseInt(sDate.substring(0 , sDate.indexOf('-')));
			sDate = sDate.substring(sDate.indexOf('-') + 1);
			sHour = Integer.parseInt(sDate.substring(0 , sDate.indexOf(':')));
			sDate = sDate.substring(sDate.indexOf(':') + 1);
			sMin = Integer.parseInt(sDate.substring(0 , sDate.indexOf(':')));
			sDate = sDate.substring(sDate.indexOf(':') + 1);
			sSec = Integer.parseInt(sDate);
			
			eMonth = Integer.parseInt(eDate.substring(0 , eDate.indexOf('/')));
			eDate = eDate.substring(eDate.indexOf('/') + 1);
			eDay = Integer.parseInt(eDate.substring(0 , eDate.indexOf('/')));
			eDate = eDate.substring(eDate.indexOf('/') + 1);
			eYear = Integer.parseInt(eDate.substring(0 , eDate.indexOf('-')));
			eDate = eDate.substring(eDate.indexOf('-') + 1);
			eHour = Integer.parseInt(eDate.substring(0 , eDate.indexOf(':')));
			eDate = eDate.substring(eDate.indexOf(':') + 1);
			eMin = Integer.parseInt(eDate.substring(0 , eDate.indexOf(':')));
			eDate = eDate.substring(eDate.indexOf(':') + 1);
			eSec = Integer.parseInt(eDate);
			
			int edaysR = 0;
			for(int i = eMonth - 1;  i < year.length; i++)
			{
				edaysR += year[i];
			}
			edaysR = diy - edaysR;
			
			int sdaysR = 0;
			for(int i = sMonth - 1;  i < year.length; i++)
			{
				sdaysR += year[i];
			}
			sdaysR = diy - sdaysR;
			
			eTotal = eSec + (eMin * min) + (eHour * hr * min) + (eDay * day * hr * min) + (edaysR * day * hr * min) + (eYear * diy * hr * min);	
			sTotal = sSec + (sMin * min) + (sHour * hr * min) + (sDay * day * hr * min) + (sdaysR * day * hr * min) +  (sYear * diy * hr * min);	
			
			out.println(eTotal - sTotal);
			
		}
		
		out.close();
	}

}
