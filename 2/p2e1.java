import java.util.Scanner;
public class p2e1
{
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int sum = a + b;
        System.out.println("Sum through Command line argument is " + sum);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of x:");
        int x=sc.nextInt();
        System.out.println("Enter Value of y:");
        int y=sc.nextInt();
        int z = x + y;
        System.out.println("Sum through Scanner class is:"+z);
	}
}