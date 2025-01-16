import java.util.*;
class timer 
{
    int hours; 
    int minutes;
    public timer(int hours,int minutes)
    {
        this.hours=hours;
        this.minutes=minutes;
    }
    public void add(timer t1,timer t2)
    {
        hours=t1.hours+t2.hours;
        minutes=t1.minutes+t2.minutes;
        hours += minutes/60;
        minutes= minutes % 60;
        System.out.println("Hours:"+hours);
        System.out.println("Minutes:"+minutes);
    }
}
public class time{
    public static void main(String[] args) {
        timer t1=new timer(8,50);
        timer t2=new timer(4,50);
        t1.add(t1,t2);
    }
}