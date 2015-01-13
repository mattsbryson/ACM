import java.util.ArrayList;
import java.util.Scanner;


public class language {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		ArrayList<String> inputs = new ArrayList<String>();
		String s = "";
		while(!(s = reader.next()).contains("#"))
		{
			inputs.add(s);
		}
		
		String order = "";
		for(int i = 0; i<inputs.size();i++)
		{
			String temp = inputs.get(i);
			for(int z = 0; z < temp.length(); z++)
			{
			//	CharSequence tChar = temp.charAt(z);
				if(order == "")
				{
					order = temp;
					break;
				}
				else
				{
			//		if(order.contains(tChar))
					{
		//				order.
					}
				}
			}
		}
		
	}

}
