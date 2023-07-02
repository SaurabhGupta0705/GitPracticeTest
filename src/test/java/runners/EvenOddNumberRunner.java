package runners;

import java.util.Scanner;

import pages.EvenOddNumber;

public class EvenOddNumberRunner {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to test");
		int number = sc.nextInt();
		sc.close();
		EvenOddNumber eobj= new EvenOddNumber();
		System.out.println(eobj.EvenOddNumberTest(number));
	}

}
