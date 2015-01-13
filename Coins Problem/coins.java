import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class coins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Cent (“Penny”) 2.500 g
		Five Cents (“Nickel”) 5.000 g
		Dime 2.268 g
		Quarter Dollar 5.670 g
		Half Dollar 11.340 g*/
		
		double mass[] = new double [5];

		mass[0] = 2.5;
		mass[1] = 5;
		mass[2] = 2.268;
		mass[3] = 5.67;
		mass[4] = 11.34;
		
		
		try {
			File input = new File("inputcoin.txt");

			File output = new File("outputcoin.txt");
			
			
			Scanner in = new Scanner(input);
			PrintWriter out = new PrintWriter(output);
			
			while(in.hasNext()){
				int ch = in.nextInt();
				int half = in.nextInt();
				System.out.println(ch);
				System.out.println(half);

				int score[] = new int [5];
				for(int i = 0; i <score.length; i++){
					score[i] = 0;
				}

			if(ch >= 50 && half > 0){
				
					score[0] = 1;
					ch = ch - 50;
				
					score[1] = (int) ch / 25;
					ch -= score[1] * 25;
					
					
					score[2] =(int) ch / 10;
					ch -= score[2] * 10;
					

					
					score[3] = (int)ch / 5;
					ch -= score[3] * 5;

					score[4] = ch;
				
			}
			else{
				score [0] = 0;
				score[1] = (int) ch / 25;
				System.out.println(score[1]);
				ch -= score[1] * 25;
				
				
				score[2] = (int)ch / 10;
				ch -= score[2] * 10;
				

				
				score[3] =(int) ch / 5;
				ch -= score[3] * 5;

				score[4] = ch;

			}

			
			String outscore = "";
			
			
			if(score[0] > 0 ){
				out.print( score[0] + "X50 ");

			} if(score[1] > 0){
				out.print( score[1] + "X25 ");

			} if(score[2] > 0){
				out.print( score[2] + "X10 ");

			} if(score[3] > 0){
				out.print( score[3] + "X5 ");

			} if(score[4] > 0){
				out.print( score[4] + "X1 ");

			}
			out.println();
			
			

			
			
			
			}
			
			out.close();

			}catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		
	
	}
}
