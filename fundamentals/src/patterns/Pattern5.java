package patterns;

import java.util.Scanner;

public class Pattern5 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
//        int i=1;
//        while(i<=n){
//            int j=1;
//            while(j<=n){
//                System.out.print(n);
//                j++;
//            }
//            
//            System.out.println();
//            i++;
//        }
        
        for(int i=1; i<=n; i++) {
        	for(int j=1; j<=n; j++) {
        		System.out.print(n);
        	}
        	System.out.println();
        }
		
        sc.close();
		
	}

}
