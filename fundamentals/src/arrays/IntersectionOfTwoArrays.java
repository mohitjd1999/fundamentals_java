package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class IntersectionOfTwoArrays {

		public static void intersection(int[] arr1, int[] arr2) {
	        
//	         for(int i=0; i<arr1.length; i++){
//	             for(int j=i+1; j<arr1.length; j++){
//	                 if(arr1[i]> arr1[j]){
//	                     int temp = arr1[j];
//	                     arr1[j] = arr1[i];
//	                     arr1[i] = temp;
//	                 }
//	             }
//	         }
	        
//	         for(int i=0; i<arr2.length; i++){
//	             for(int j=i+1; j<arr2.length; j++){
//	                 if(arr2[i]> arr2[j]){
//	                     int temp = arr2[j];
//	                     arr2[j] = arr2[i];
//	                     arr2[i] = temp;
//	                 }
//	             }
//	         }
	        Arrays.sort(arr1);
	        Arrays.sort(arr2);
	        
	        int i=0;
	        int j=0;
	        
	        while(i<arr1.length && j<arr2.length){
	              if(arr1[i] == arr2[j]){
	                    System.out.print(arr2[j] + " ");
	                    i++; j++;
	                    
	                }
	            else if(arr1[i] < arr2[j]){
	                i++;
	            }else{
	                j++;
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

				int arr1[] = takeInput();
				int arr2[] = takeInput();
				
				intersection(arr1, arr2);
			}

}
