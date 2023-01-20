package functions;
import java.util.Scanner;

public class CheckPrime {
	public static boolean checkPrime(int n) {
		boolean isPrime = true;
		
		for(int i=2; i<n; i++) {
			if(n%i == 0) {
				isPrime = false;
				break;
			}else {
				isPrime = true;
			}

		}
		 return isPrime;
	}
	
	public static boolean isPrime(int x)
	{
	    for(int i=2;i<x/2;i++)
	    {
	        if(x%i==0)
	        return false;
	    }
	    return true;

	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
       
		//System.out.println(checkPrime(n));
		
		boolean isPrime= checkPrime(n);
		System.out.println(isPrime);
		
	}

	
	
}
