package pages;

public class EvenOddNumber 
{

	public int x;
	public EvenOddNumber() {}
	public String EvenOddNumberTest(int num)
	{
		this.x=num;
		int y=x%2;
		if(y==0) return( x+" is an even number");
		else return (x+" is an odd number");
	}

}
