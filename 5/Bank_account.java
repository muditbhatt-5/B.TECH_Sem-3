import java.util.*;
public class Bank_account
{
    public static void main(String[] args) {
        bank b = new bank();
        b.getAccountDetails();
        b.displayAccountDetails();
    }

}
class bank 
{
    int accountNo;
    String userName;
    String email;
    String accountType;
    double accountBalance;
    public void getAccountDetails()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Accountno:");
        accountNo = sc.nextInt();

        System.out.println("Enter Your username:");
        userName = sc.next();

        System.out.println("Enter Your email:");
        email = sc.next();

        System.out.println("Enter Your Accounttype:");
        accountType = sc.next();

        System.out.println("Enter Your balance:");
        accountBalance = sc.nextDouble();
    }
    public void displayAccountDetails()
    {
        System.out.println(" Your Accountno:"+accountNo);

        System.out.println("Your username:"+userName);

        System.out.println("Your email:"+email);

        System.out.println(" Your Accounttype:"+accountType);

        System.out.println("Your balance:"+accountBalance);
    }
}
