package patterns;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
//        for(int i=n; i>=1; i--) {
//        	for(int j=n; j>=1; j--) {
//        		System.out.print(j);
//        	}
//        	
//        	System.out.println();
//        }
		
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=n) {
				System.out.print(n-j+1);
				j++;
			}
			System.out.println();
			i++;
		}
		
			sc.close();
	}
}
