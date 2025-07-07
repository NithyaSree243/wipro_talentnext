package java_fundamentals;

import java.util.Scanner;

public class Question15 {
	public static boolean isPrime(int n) {
		boolean prime = true;
		for(int i = 2;i<=Math.sqrt(n);i++) {
			if(n % i == 0) {
				return false;	
			}
		}
		return true;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(isPrime(n))
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("Not prime");	
		}
			
		
	}

}