package functions;
import java.util.Scanner;

public class NcR {
	
	
	public static int factorial(int num) {
	  int fact =1;
	  for(int i=num; i>=1; i--) {
		  fact*=i;
	  }
	  return fact;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		int c = n-r;
		
	   int factN = factorial(n);                  // using factorial method/function
	   int factR = factorial(r);
	   int factC = factorial(c);
	   
//		int N=1,R=1,C=1;
//		for(int i=n; i>=1; i--) {
//			N*=i;	
//		}
//		
//		for(int i=r; i>=1; i--) {
//			R*=i;	
//		}
//		
//		for(int i=c; i>=1; i--) {
//			C*=i;	
//		}
		
		int nCr = factN/(factR*factC);
		
		System.out.print(nCr);
		
		sc.close();
	}

}
