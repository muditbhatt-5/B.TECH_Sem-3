import java.util.*;
public class p4e8
{
	public static void rotateArray(int a[], int l)   
	{   
		int i, temp;   
		temp = a[0];   
		for (i = 0; i < l - 1; i++)   
		a[i] = a[i + 1];  
		a[i] = temp;   
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array:");
		int x = sc.nextInt();
		int a[]=new int[x];
		int l=a.length;
		for(int i=0;i<l;i++)
		{
			System.out.println("Enter new valeu for array");
			a[i] = sc.nextInt();
		}

		rotateArray(a,l);
		System.out.println("Display array");
		for(int j=1;j<a.length;j++)
		{
			System.out.print(a[j]);
		}
	}
}