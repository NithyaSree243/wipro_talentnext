package java_fundamentals;
import java.util.*;
public class Question17 {
	public static int sumdigits(int num)
	{
		int sum=0;
		while(num>0)
		{
		  	int ld=num%10;
		  	sum=sum+ld;
		  	num=num/10;
		}
		return sum;
	}

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
	
		System.out.println(sumdigits(num));
		
	}

}
