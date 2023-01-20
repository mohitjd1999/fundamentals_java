package recursion;

import java.util.Scanner;

public class MultiplicationRecursion {
	
	public static int multiplyTwoIntegers(int m, int n){
		if(m==0 || n==0){
			return 0;
		}

		int sum = m;
	
	    int smallOutput = sum+multiplyTwoIntegers(m,n-1);

		return smallOutput;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		System.out.println(multiplyTwoIntegers(m,n));
		

	}

}
