package patterns;

import java.util.Scanner;

public class Pattern10 {

	  public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        
//	        char a='A';
//	      
//	        for(int i=1; i<=n; i++) {
//	        	for(int j=1; j<=n; j++) {
//	        		char b = (char)(a + j -1);
//	        		System.out.print(b);
//	        	}
//	        	System.out.println();
//	        }
	
	        int i=1;
	        while(i<=n){
	            int j=1;
	            while(j<=n){
	                System.out.print((char)('A'+ j -1));
	                j++;
	            }
	            
	            System.out.println();
	            i++;
	        }
        sc.close();
	  }
	  
}
        