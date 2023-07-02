package runners;

import java.util.Scanner;

import pages.RangePrimeNumber;

public class RangePrimeNumberRunner {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1= sc.nextInt();
		System.out.println("Enter the last number");
		int num2 = sc.nextInt();
		sc.close();
		RangePrimeNumber robj = new RangePrimeNumber();
		System.out.println("List of prime number in the given range is "+robj.rangePrimeNumber(num1, num2));
	}

}
