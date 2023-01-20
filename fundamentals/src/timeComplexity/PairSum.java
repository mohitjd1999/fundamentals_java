package timeComplexity;

import java.util.Scanner;
import java.util.Arrays;

public class PairSum {
    public static int pairSum(int[] arr, int num) {
		
        int count =0;
        
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
               int sum = arr[i] + arr[j];
               if(sum == num ){
                count++;
               } 
            }
            
        }
        
        return count;
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
				Scanner sc = new Scanner(System.in);
				
				int arr[] = takeInput();
				
				int num = sc.nextInt();
				
				System.out.println(pairSum(arr, num));
			}

}
