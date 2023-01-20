package timeComplexity;

import java.util.Scanner;
import java.util.Arrays;

public class FindLeaderInArray {
  public static void leaders(int[] input) {
        
	    
	    int max = input[input.length-1];
		
        for(int i=input.length-1; i>=0; i--){
           if(input[i]>=max){
        	   System.out.print(input[i] +" ");
               max = input[i];
           }
        }
       
		
	}
		

		
		public static int []takeInput(){
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			
			int arr[] = new int [n];
			
			for(int i=0; i<arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			
			return arr;
		}
		
		

			public static void main(String[] args) {

				int arr[] = takeInput();
				
				leaders(arr);
			}

}
