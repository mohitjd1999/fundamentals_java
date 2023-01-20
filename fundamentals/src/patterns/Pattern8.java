package patterns;

import java.util.Scanner;

public class Pattern8 {

	  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      
        for(int i=1; i<=n; i++) {
        	for(int j=1; j<=i; j++) {
        		System.out.print(i+j-1);
        	}
        	System.out.println();
        }
        
//        int i=1;
//		  while(i<=n) {
//			int j=1;
//			while(j<=i) {
//				System.out.print(i+j-1);
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
        sc.close();
	  }
	  
}
        