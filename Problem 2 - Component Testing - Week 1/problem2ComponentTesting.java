import java.io.*;
import java.util.Scanner;

public class problem2ComponentTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File input = new File("componentin.txt");
				if(!input.exists()) input.createNewFile();

			File output = new File("componentout.txt");
				if(!output.exists()) output.createNewFile();
			
			
			Scanner in = new Scanner(input);
			java.io.PrintWriter out = new java.io.PrintWriter(output);
			while(in.hasNext()){
				int n = in.nextInt();
				int m = in.nextInt();
	
				int j[] = new int [n];
				int J = 0;
				int c[] = new int[n];
				int C = 0;
				int number_tests = 0;
	
				for(int i = 0; i < n; i ++){
					j[i] = in.nextInt();
					J+= j[i];
					c[i] = in.nextInt();
					C += c[i];
					number_tests += j[i] * c[i];
						System.out.println(j[i] + " " + c[i]);
				}
				
				int k[] = new int [m];
				int K = 0;
				int d[] = new int[m];
				int D = 0;
				int number_engineers = 0;
	
				for(int i = 0; i < m; i ++){
					k[i] = in.nextInt();
					K += k[i];
					d[i] = in.nextInt();
					D += d[i];
					number_engineers += k[i] * d[i];
						System.out.println(k[i] + " " + d[i]);
			}

			boolean engineers = true;
			int no_of_engs = 0;
			for(int b = 0; b < k.length; b++){
					no_of_engs = no_of_engs + k[b]; 
				}

			for(int a = 0; a < c.length; a++){
				if(c[a] > no_of_engs) engineers = false;
			}
			
			
			
			if(number_engineers >= number_tests && engineers){
				System.out.println("YES");
				out.println("YES");
			}else{
				System.out.println("NO");
				out.println("NO");

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

	

}
