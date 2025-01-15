import java.util.*; 
class p4e7
{
	public static void main(String[] args)
	{
		int n = 3;
		int a = n - 1; 
		for (int i = 0; i < n; i++) 
		{
			for (int j = 0; j < a; j++) 
				System.out.print(" ");
			for (int j = 0; j <= i; j++) 
				System.out.print("* "); 
			System.out.println(" "); 
			a--; 
		}
		a=0;
		for (int i = n-1; i > 0; i--) 
		{
			for (int j = 0; j < a; j++) 
				System.out.print(" ");
			for (int j = 0; j <i; j++) 
				System.out.print(" *");
			System.out.println(""); 
			a++; 
		} 
	}
}