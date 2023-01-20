package functions;

import java.util.Scanner;

public class MoreFunction {
	
	public static int Add(int a, int b) {
		int sum = a+b;
		return sum;
	}
	
	public static double Sub(int a, int b) {
		float sub = a-b;
		return sub;
	}
	
	public static double Mul(double a, double b) {
		double mul = a*b;
		return mul;
	}
	
	public static void printEvenNumbers(int start, int end) {
		
	   if(start%2 !=0 ) {
		   start++;
	   }
	   	
	   for(int i=start; i<=end; i+=2) {
		   System.out.print(i + " ");
	   }
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
		
//		int Addition = Add(a,b);
//		double Multiplication = Mul(a,b);
		
		
//		System.out.println(Add(a,b));
//		System.out.println(Sub(a,b);
//		System.out.println(Multiplication);
		
		int start = sc.nextInt();
		int end = sc.nextInt();
		printEvenNumbers(start, end);
		

		sc.close();
	}

}
