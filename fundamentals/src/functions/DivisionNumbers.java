package functions;

import java.util.Scanner;

public class DivisionNumbers {
	public static int Divide(int num, int deno) {
		if(deno == 0) {
			return Integer.MIN_VALUE;
		}
		
		int div = num/deno;
		return div;
	}
	
	public static void printDivide(int num, int deno) {
		if(deno==0) {
			System.out.println("Division by zero is not allowed");
			return;
		}
		System.out.println(num/deno);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int deno = sc.nextInt();
		
		System.out.println(Divide(num, deno));
		printDivide(num, deno);
	}

}
