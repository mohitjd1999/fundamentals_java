package patterns;
import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		

		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
//		int i=1;
//		while(i<=n) {
//			int j=1;
//			while(j<=n) {
//				System.out.print(i);
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		sc.close();
	}
}