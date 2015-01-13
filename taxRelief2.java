import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;


public class taxRelief2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File input = new File("inputtax2.txt");
				if(!input.exists()) input.createNewFile();

			File output = new File("outputtax2.txt");
				if(!output.exists()) output.createNewFile();
			

			Scanner in = new Scanner(input);
			java.io.PrintWriter out = new java.io.PrintWriter(output);
			ArrayList<String> social = new ArrayList<String>();
			ArrayList<String> type = new ArrayList<String>();
			ArrayList<String> tax = new ArrayList<String>();
			ArrayList<String> liability = new ArrayList<String>();

			int returns = 0;
			while(in.hasNext()){
				social.add(in.next());
				type.add(in.next());
				tax.add(in.next());
				liability.add(in.next());
				returns ++;
			}
			
			String[] Social = new String [returns];
			double[] Type = new double [returns];
			double[] Tax = new double [returns];
			double[] Liability = new double [returns];

			for(int i = 0; i < returns; i++){
				Social[i] = social.get(i);
				int c = Integer.parseInt(type.get(i));
						if(c ==1 || c ==3)
							Type[i] = 300;
						else if(c == 4)
							Type[i] = 500;
						else
							Type[i] = 600;
				
				Tax[i] = (0.05 * Double.parseDouble(tax.get(i)));
				Liability[i] = Double.parseDouble(liability.get(i));

			}
			
			

			double[] all_returns = new double[returns];
			
			for(int i = 0; i < returns; i++){
				if(Tax[i] < Type[i] && Tax[i] < Liability[i]){
					all_returns[i] = Tax[i];
				}
				else if( Type[i]< Tax[i] && Type[i] < Liability[i]){
					all_returns[i] = Type[i];
				}else
					all_returns[i] = Liability[i];

			
			out.println(Social[i] +  " $" + getTwoDecimal(all_returns[i]));
			}
			
			String [] returnDate = new String[10];
			returnDate[0] = "July 23";
			returnDate[1] = "July 30";
			returnDate[2] = "August 6";
			returnDate[3] = "August 13";
			returnDate[4] = "August 20";
			returnDate[5] = "August 27";
			returnDate[6] = "September 3";
			returnDate[7] = "September 10";
			returnDate[8] = "September 17";
			returnDate[9] = "September 24";
			
			double[] amount = new double[10];
			int[] how_many = new int [10];
			int[] twodigits = new int[10];
			
			for(int i = 0; i < returns; i ++){
				twodigits[i] = Integer.parseInt(Social[i].substring(9));
				how_many[(int) twodigits[i] / 10] += 1;
				amount[(int) twodigits[i] / 10] = all_returns[i] + amount[(int) twodigits[i] / 10] ;
				
			}
			
			for(int i = 0; i < 10; i ++){

			if(amount[i] != 0){
				System.out.println(getTwoDecimal(amount[i]));
				out.println(how_many[i] + " $" + getTwoDecimal(amount[i]) + " " + returnDate[i]);
			}
			
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
	
	public static String getTwoDecimal(double number){

		return ( String.format( "%.2f", number ) );
		
	}
	
	public static String getTwoDecimal(int number){

		return ( String.format( "%.2f", number ) );
		
	}


	}


