import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ReaderTemplate 
{

	public static void main(String[] args) throws IOException 
	{
		int n; 
		String s; 
		BufferedReader stdin;
		
		stdin = new BufferedReader(new InputStreamReader(System.in));
		while( (s=stdin.readLine()) != null)
		
	//	while( !(s=stdin.readLine()).equals(""))
		{
			n = Integer.parseInt(s);
			System.out.print(n+"");
			for(int i = n -1; i < 0; i--)
			{
				System.out.print("1");
			}
			System.out.println("0");
		}
		System.exit(0);
	}

}
