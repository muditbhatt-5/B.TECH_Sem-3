import java.util.*;
public class p3e1
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of dbms:");
		int dbms=sc.nextInt();
		System.out.println("Enter marks of wt:");
		int wt=sc.nextInt();
		System.out.println("Enter marks of ds:");
		int ds=sc.nextInt();
		System.out.println("Enter marks of oopj:");
		int oopj=sc.nextInt();
		System.out.println("Enter marks of java:");
		int java=sc.nextInt();
		int total=dbms+wt+ds+oopj+java;
		double percentage=total/5;
		System.out.println("Your percentage is="+percentage+"%");
		if(percentage>=60)
		{
			System.out.println("You're result is in 1st divition");
		}
		else if(percentage>50.0 && percentage<59)
		{
			System.out.println("You're result is in 2nd divition");
		}
		else if(percentage>40.0 && percentage<49)
		{
			System.out.println("You're result is in 3rd divition");
		}
		else if(percentage<40)
		{
			System.out.println("Sorry you not clear this exam");
			System.out.println("focus on your dream and reattend this exam");
		}
		else 
		{
			System.out.println("padhai likhai karo Computer Engneer bano");
		}
	}
}