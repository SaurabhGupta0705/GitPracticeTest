package pages;

public class TablePrint 
{
	public int x;
	public TablePrint() {}
	public void tableprint(int num)
	{
		this.x=num;
		for(int i=1;i<=10;i++) System.out.println(x*i);
	}

}
