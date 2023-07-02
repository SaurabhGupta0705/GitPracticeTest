package pages;

import java.util.ArrayList;

public class RangePrimeNumber 
{

	public int x;
	public int y;
	public ArrayList l;
	public RangePrimeNumber () { l= new ArrayList();}
	public ArrayList rangePrimeNumber(int n1, int n2)
	{
		this.x=n1;
		this.y=n2;
		for(int i=x;i<=y;i++)
		{
			int flag=0;
			for(int j=2;j<i;j++)
			{
				int y=i%j;
				if(y==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				l.add(i);
			}
		}
		return l;
	}
}
