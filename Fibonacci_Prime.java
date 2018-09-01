/*Following is a program to print an alternate series of Fibonacci and Prime numbers upto n places, where n is given as input.*/

import java.util.*;
import java.lang.Math.*;
public class PrimeFibonacci {
	
	static int i;
	static int[] ans=new int[1000];
	public static void fibo(int n) {
		ans[0]=1;
		ans[2]=1;
		for(i=4;i<n;i+=2)
		{
			ans[i]=ans[i-2]+ans[i-4];
		}
	
   }
	public static void prime(int n) {
		int j=1;
		i=2;
		while(j<n)
		{
			
			boolean prime=true;
			for(int k=2;k<=Math.sqrt(i);k++)
			{
				if(i%k==0)
				{
					prime=false;
					break;
				}
			}
			if(prime)
			{
				ans[j]=i;
				j+=2;
			}
			++i;
		}
	
   }
    public static void main(String args[] ) {
		Scanner s=new Scanner(System.in);
		int n;//length of series
		n=s.nextInt();
		fibo(n);
		prime(n);
		i=0;
		while(i<n)
		{
		System.out.print (ans[i]+" ");
		++i;
		}
   }
}
