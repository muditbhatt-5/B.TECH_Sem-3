import java.util.*;
public class quit {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String user=sc.nextLine();
    int count=0;
    int count1=0;
    for(int m=0;m<user.length();m++)
    {
        if(user == "quit"){
            break;
        }
        else if(user.charAt(m) == 'a' || user.charAt(m) == 'e' || user.charAt(m) == 'i' || user.charAt(m) == 'o' || user.charAt(m) == 'u' )
        {
            count = count+1;
            System.out.println("Total vowel is:"+count);
        }
        else 
        {
            count1=count1+count1;
            System.err.println("Total not-vowel is:"+count1);
        }
    }
}
}
class Vowel
{
    public void countvowels()
    {
        
    }
}