import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class mallMap {

	public static void main(String[] args) throws IOException 
	{
		//scanner + printer
		File input = new File(".\\lib\\inputMap.txt");
		File output = new File(".\\lib\\outputMap.txt");
			if(!output.exists())
			{
				output.createNewFile();
			}
		
		Scanner in = new Scanner(input);
		PrintWriter out = new PrintWriter(output);
		//scanner + printer end
		
		//variables
		char[][] map;
		String temp;
		int y = 0;
		int x = 0;
		int p = 0;
		int[][] pairs;  
		ArrayList <String> strings = new ArrayList<String>();
		//variables end
		
		while(in.hasNext())
		{
			strings.add(in.nextLine());
			y++; 
		}
		
		x = strings.get(0).length();
		map = new char [x] [y];
	
		
		for(int i = 0; i < y; i++)
		{
			for(int z = 0; z < x; z++)
			{
				map [z] [i] = strings.get(i).charAt(z);
			}
		}
		
		for(int i = 0; i < y; i++)
		{
			for(int z = 0; z < x; z++)
			{
				if(!(map[z][i] == 'x' || map[z][i] == ' '))
				{
					p++;
				}
			}
		}
		
		
		
		pairs = new int [p] [3];
		int pC = 0;
		
		for(int i = 0; i < y; i++)
		{
			for(int z = 0; z < x; z++)
			{
				if(!(map[z][i] == 'x' || map[z][i] == ' '))
				{
						pairs [pC] [0] =  Integer.parseInt(map [z] [i] + "");
						pairs [pC] [1] = z;
						pairs [pC] [2] = i;
 						pC++;
					
				}
			}
		}
		
		for(int i = 0; i < pairs.length; i++)
		{
			System.out.print(pairs[i] [0] + " ");
			System.out.print(pairs[i] [1] + " ");
			System.out.print(pairs[i] [2] + " ");
			System.out.println();
			
		}
		
		System.out.println();
		
		int check = 1;
		while(check > 0)
		{
			check = 0;
			for(int i = 0; i < pairs [i].length - 1; i++)
			{
				
				int a;
				int b;
				a = pairs [i] [0];
				b = pairs [i + 1] [0];
				
				if(b > a)
				{
					int f,g,h,l,m,n;
					f = pairs[i + 1] [0];
					g = pairs[i + 1] [1];
					h = pairs[i + 1] [2];
					l = pairs[i] [0];
					m = pairs[i] [1];
					n = pairs[i] [2];
					
					pairs[i] [0] = f;
					pairs[i] [1] = g;
					pairs[i] [2] = h;
					pairs[i + 1] [0] = l;
					pairs[i + 1] [1] = m;
					pairs[i + 1] [2] = n;
					
					
					check++;
				}
	
			}
			System.out.println(check);
		}
		
		
		
		for(int i = 0; i < pairs.length; i++)
		{
			System.out.print(pairs[i] [0] + " ");
			System.out.print(pairs[i] [1] + " ");
			System.out.print(pairs[i] [2] + " ");
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}

}
