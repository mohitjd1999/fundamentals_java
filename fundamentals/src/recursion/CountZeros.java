package recursion;

import java.util.Scanner;

public class CountZeros {
	
	public static int countZerosRec(int input){
		if(input==0){
			return 1;
		}

		if(input<10){
			return 0;
		}
		
        int temp = input%10;
	   
	    int count = 0;
		if(temp==0){
			count=1;
		}

		int smallOutput = count + countZerosRec(input/10);

		return smallOutput;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		System.out.println(countZerosRec(input));
		

	}

}
