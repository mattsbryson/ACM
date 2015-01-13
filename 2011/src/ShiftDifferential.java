import java.io.*;
import java.util.Scanner;


public class ShiftDifferential {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File input = new File("inputShift.txt");
			if(!input.exists()) input.createNewFile();

			File output = new File("outputShift.txt");
				if(!output.exists()) output.createNewFile();
			
			
			Scanner in = new Scanner(input);
			java.io.PrintWriter out = new java.io.PrintWriter(output);
			
			String times = in.nextLine();
			String SwingStart = times.substring(0, times.indexOf(','));
			times = times.substring(times.indexOf(',')+ 1);
			String SwingEnd = times.substring(0, times.indexOf(','));
			times = times.substring(times.indexOf(',')+ 1);
			String Grave = times.substring(0, times.indexOf(','));
			times = times.substring(times.indexOf(',')+ 1);
			Double SwingPay = Double.parseDouble(times.substring(0, times.indexOf(',')));
			
			while(in.hasNext()){
				
			}
			
			out.close();
			
			
			
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
