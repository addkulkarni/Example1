package numberchecker;

import java.util.ArrayList;
import java.util.List;

public class NumberChecker
{
	public static void main(String[] args)
	{
		String s="10.Aditya 2.asd_2202 3.rty";
		
		List<String>l = new ArrayList<>();
		for(int i=0; i<s.length(); i++)
		{
			if(Character.isDigit(s.charAt(i)))
			{
				int j=i;
				System.out.println(s.charAt(i));
				String s1="";
				while(Character.isDigit(s.charAt(j++)))
				{
					s1=s1+s.charAt(i);
					//System.out.println("fasdf");
				}
				l.add(s1);
			}
		}
		System.out.println(l);
	}
}
