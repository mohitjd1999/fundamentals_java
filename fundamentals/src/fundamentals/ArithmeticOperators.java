package fundamentals;

import java.util.Scanner;

public class ArithmeticOperators {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first Number");
		int a = sc.nextInt();
		System.out.println("Enter the Second Number");
		int b = sc.nextInt();
		
		int c = a+b;   // addition
		System.out.println("Result of a+b is " + c);
		
		int d = a-b;   // subtraction
		System.out.println("Result of a-b is " + d);
		
		int e = a*b;   // multiplication
		System.out.println("Result of a*b is " + e);
		
		int f = a/b;   // division
		System.out.println("Result of a/b is " + f);
		
		int g = a%b;   // modulo
		System.out.println("Result of a%b is " + g);
		
		sc.close();
	}
}
