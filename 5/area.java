import java.util.*;
import java.util.Scanner;
class area
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of r:");
        double r=sc.nextDouble();
        circle c= new circle();
        c.areea(r);
    }
}
 class circle
{
    double a=3.14;
    public void areea(double r)
    {
        double arrea= a*r*r;
        System.out.println("area of circle is:"+arrea);
    }
}