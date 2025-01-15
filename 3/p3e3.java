import java.util.*;
public class p3e3
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st value");
		int a=sc.nextInt();
		System.out.println("Enter 2nd value");
		int b=sc.nextInt();
		System.out.println("Enter 3rd value");
		int c=sc.nextInt();
		if(a>b)
		{
			System.out.println(a+": This is maximum number");
		}
		else if(b>c)
		{
			System.out.println(b+": This is maximum number");
		}
		else if(c>a)
		{
			System.out.println(c+": This is maximum number");
		}
		else 
		{
			System.out.println("plzzzz check values");
		}
	}
}