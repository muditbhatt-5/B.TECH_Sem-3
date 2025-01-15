class p2e22
{
	public void pre()
	{
		int m=100,n=10,o=100,ans;
		ans=m/n*o;
		System.out.println("ans of 2:"+ans);
	}
	public void preced()
	{
		int m=5,n=4,o=4,p=3,ans;
		ans=m*n/o%p;
		System.out.println("ans of 3:"+ans);
	}
	public void precedence()
	{
		int m=100,n=200,o=10,p=3,q=10,ans;
		ans=m+n/o-p*q;
		System.out.println("ans of 4:"+ans);
	}
}
public class p2e2
{
	 public static void main(String[] args) {
    	
    	int a = 10, b = 20, c = 30, result;
    	result = a+b*c;
    	System.out.println("ans of 1:"+result);
    	p2e22 e = new p2e22();
    	e.pre();
    	e.preced();
    	e.precedence();
    }
}