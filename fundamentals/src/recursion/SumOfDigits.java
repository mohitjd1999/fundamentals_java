package recursion;

import java.util.Scanner;

public class SumOfDigits {
	
	public static int sumOfDigits(int input){
		
	       if(input == 0 ){
			   return 0;
		   }
			
			int rem = input%10;

			int smallOutput = rem+sumOfDigits(input/10);
			
			return smallOutput;
		}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		System.out.println(sumOfDigits(input));
		

	}

}
