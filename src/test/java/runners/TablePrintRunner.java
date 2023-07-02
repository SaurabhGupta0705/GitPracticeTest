package runners;

import java.util.Scanner;

import pages.TablePrint;

public class TablePrintRunner {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int number = sc.nextInt();
		sc.close();
		TablePrint tobj= new TablePrint();
		tobj.tableprint(number);
	}

}
