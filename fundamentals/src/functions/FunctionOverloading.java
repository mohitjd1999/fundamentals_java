package functions;
import java.util.Scanner;

public class FunctionOverloading {
	
	public static int sum(int a, int b) {
		int result = a+b;
		return result;
	}
	
	public static double sum(double a, double b) {
		double result = a+b;
		return result;
	}
	
	public static int sum(int a) {
		int result = a+1;
		return result; 
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
 		int b = sc.nextInt();
 		
 		System.out.println(sum(a,b));
 		System.out.println(sum(a));
 		System.out.println(sum(10.0,15.0));
	}

}
