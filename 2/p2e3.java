import java.util.*;
public class p2e3
{
	public static void main(String[] args) 
	{
        double num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
 
        System.out.println("Enter the operator (+,-,*,/):");
 
        char op = sc.next().charAt(0);
        double o = 0;
 
        switch (op) {
        case '+':
            o = num1 + num2;
            break;
 
        case '-':
            o = num1 - num2;
            break;

        case '*':
            o = num1 * num2;
            break;

        case '/':
            o = num1 / num2;
            break;
 
        default:
            System.out.println("You enter wrong input");
        }
 
        System.out.println("The final result:");
        System.out.println();
        System.out.println(num1 + " " + op + " " + num2
                           + " = " + o);
        System.out.println("1.upper/2.lower");
        int oopj = sc.nextInt();
        System.out.print("Enter String:");
        String d = sc.next();
        if(oopj==1)
        {
        	System.out.println(d.toUpperCase());
        	System.out.println(d);
        }
        else if(oopj==2)
        {
        	System.out.println(d.toLowerCase());
        }
        else
        {
        	System.out.println("invalided choice");
        }
	}
}