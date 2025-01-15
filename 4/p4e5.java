import java.util.*;
public class p4e5 
{
	public static void main(String[] args) 
	{
		String a=args[0];
		for(int i=0;i<a.length();i++)
		{
		char ch = a.charAt(i);
		System.out.println(a.charAt(i));
		if(ch >='A' && ch<='Z')
		{
			System.out.println("Letter is in upper");
		}
		else 
		{
			System.out.println("error:18=value is not in upper case");
		}
		}
	}
}