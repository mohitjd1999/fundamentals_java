package assignments;

import java.util.Scanner;

public class Positive_NegativeNumbers {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		System.out.println("Enter the First Number");
		a = sc.nextInt();
		System.out.println("Enter the Second Number");
		b = sc.nextInt();
		
		if (a>=0 && b>=0) {
			System.out.println("Both Numbers "+ a + " and " + b +" are positive.");	
		}if(a<0 || b<0)	{
			System.out.println("one is positive and other is negative");
		}
			
//		}else if(a>0 && b<0) {
//			System.out.println( a + " is positive and " + b + " is negative");
//		}else if(a<0 && b>0) {
//			System.out.println( a + " is negative and " + b + " is positive");
//		}else {
//			System.out.println("Both Numbers "+ a + " and " + b +" are negative.");
//		}
		
		sc.close();
	}
}
