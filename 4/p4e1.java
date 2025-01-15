import java.util.*;
public class p4e1
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Text for check vowel");
		String text = sc.next();
		int vowel = 0;
		for(int i=0;i<text.length();++i)
		{
			char ch = text.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			{
				++vowel;
			}
		}
		System.out.println("Vowel is :"+vowel);
	}
}