import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class n1Problem 
{

	public static void main(String[] args) throws IOException 
	{
		int n; 
		String s; 
		BufferedReader stdin;
		
		stdin = new BufferedReader(new InputStreamReader(System.in));
	
			
		//variables
		ArrayList<IJ> inputList = new ArrayList<IJ>();
		
			
		while( (s=stdin.readLine()) != null)
	//	while( !(s=stdin.readLine()).equals(""))
		{
			String iString = s.substring(0, s.indexOf(" "));
			System.out.println(s.indexOf(" "));
			String jString = s.substring(s.indexOf(" ") + 1);
			IJ temp = new IJ(Integer.parseInt(iString), Integer.parseInt(jString));
			inputList.add(temp);
		}
		
		System.out.println(inputList.toString());
		
		
		
		System.exit(0);
	}

}
