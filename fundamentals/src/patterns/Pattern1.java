package patterns;
import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
//		int i=1;                            // using while loop
//		while(i <= n) {
//			int j=1;
//			while(j<=n) {
//				System.out.print('*');
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		for(int i=1; i<=n; i++) {             // using for loop
			for(int j=1; j<=n; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
          
		sc.close();
	}

}
