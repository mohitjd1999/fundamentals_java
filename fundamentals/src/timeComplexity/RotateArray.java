package timeComplexity;

import java.util.Scanner;
import java.util.Arrays;

public class RotateArray {
   public static void rotate(int[] arr, int d) {
    	
        int arr2 [] = new int[arr.length];
        
        int j =0;
        
        for(int i=d; i<arr.length; i++){
            arr2[j] = arr[i];
            j++;
        }
        
        for(int i=0; i<d; i++){
            arr2[j] = arr[i];
            j++;
        }
        
        for(int i=0; i<arr.length; i++){
            arr[i] = arr2[i];
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
				Scanner sc = new Scanner(System.in);
				
				int arr[] = takeInput();
				
				int d = sc.nextInt();
				
				rotate(arr, d);
			}

}
