package pages;

public class PrimeNumber 
{
	public int x;
	public PrimeNumber() {}
	public String primeNumberTest(int num)
	{
		this.x=num;
		int flag=0;
		for(int i=2;i<x;i++)
		{
			int y=x%i;
			if (y==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0) return( x+" is a prime number");
		else return (x+" is not a prime number");
	}

}
