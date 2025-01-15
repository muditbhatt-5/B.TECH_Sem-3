import java.util.*;
public class p3e4
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter value for chack prime number");
	int no = sc.nextInt();
    boolean flag = false;
    for (int i = 2; i <= no / 2; ++i) {
      if (no % i == 0) 
      {
        flag = true;
        break;
      }
    }
    if (!flag)
    {
      System.out.println(no + " is a prime number.");
    }
    else
    {
      System.out.println(no + " is not a prime number.");
    }
  }
}