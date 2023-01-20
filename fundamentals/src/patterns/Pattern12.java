package patterns;

import java.util.Scanner;

public class Pattern12 {

	  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      
//        char ch='A';
//        for(int i=1; i<=n; i++) {
//        	for(int j=1; j<=n; j++) {
//        		System.out.print((char)(ch + j - 1));
//        	}
//       
//        	System.out.println();
//        	ch = (char) (ch+1) ;
//        }
        
        int i=1;
        char ch ='A';
        while(i<=n){
            int j=1;
            while(j<=n){
                System.out.print((char)(ch + j -1));
                j++;
            }
            
            System.out.println();
             ch = (char) (ch+1);
            i++;
        }
		
        sc.close();

	  }
	  
}
        