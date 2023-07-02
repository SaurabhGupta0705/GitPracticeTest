package runners;

import java.util.Scanner;

import pages.PrimeNumber;

public class PrimeNumberRunner {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to test");
		int number = sc.nextInt();
		sc.close();
		PrimeNumber pobj= new PrimeNumber();
		System.out.println(pobj.primeNumberTest(number));
	}

}
