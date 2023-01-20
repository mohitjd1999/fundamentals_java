package patterns;

import java.util.Scanner;

public class Pattern14 {

	  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        char ch= (char)('A' + n -1);
        
        
        for(int i=1; i<=n; i++) {
        	for(int j=1; j<=i; j++) {
        		System.out.print((char)(ch+j-i));
        	}
       
        	System.out.println();
        }
        
//        int i=1;
//        while(i<=n){
//        int j=1;
//        while(j<=i){
//            System.out.print((char)(ch+j-i));
//            j++;
//        }
//        System.out.println();
//        i++;
//        }
		
        sc.close();

	  }
	  
}
        