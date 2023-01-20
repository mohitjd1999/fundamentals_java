package assignments;
import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=2; i<n;) {
			if(n%i == 0 ) {
				System.out.println(n + " is a composite number");
				return;
			}else {
				i++;
			}
					
		}
		System.out.println(n + " is a prime number");
		 
		sc.close();
	}
     
}
