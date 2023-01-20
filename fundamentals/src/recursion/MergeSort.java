package recursion;

import java.util.Scanner;

public class MergeSort {
	
	
	 public static int partition(int[] input, int startIndex, int endIndex) {
		 int pivotElement = input[startIndex];
		 
		 int count =0;
         for(int i=startIndex+1 ; i<=endIndex; i++) {
        	 if(pivotElement > input[i]) {
        		 count++;
        	 }
         }
         
         int temp = input[startIndex + count];
         input[startIndex + count]=pivotElement;
         input[startIndex] = temp;
         
         int i=startIndex;
         int j=endIndex;
         while(i<j){
             if(input[i]<pivotElement){
                 i++;
             }else if(input[j]>=pivotElement){
                 j--;
             } 
             else {
                 temp = input[i];
                 input[i] = input[j];
                 input[j] = temp;
                 i++;
                 j--;
             }
         }
         
         return startIndex + count;
	 }
	 
	 
	 public static void quickSort(int[] input, int startIndex, int endIndex) {
		 
		 if(startIndex>=endIndex) {
			 return;
		 }
         
         
        int pivotIndex = partition(input, startIndex, endIndex);
        quickSort(input, startIndex, pivotIndex-1);
        quickSort(input, pivotIndex+1, endIndex);
      
 
	}
  
   public static void print(int arr[]) {
     for(int i=0; i<arr.length; i++) {
    	  System.out.print(arr[i] + " ");
      }
   }

  
//  public static void quicksort(int arr[]){
//	  quickSort(arr, 0, arr.length - 1);
//	  
//   }
  
  
  public static int[] takeInput() {
	  Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
	  
	  int arr[] = new int[n];
	  
	  for(int i=0; i<arr.length; i++) {
		  arr[i] = sc.nextInt();
	  }
	  
	  return arr;
  }

	public static void main(String[] args) {
		int []arr = takeInput();
		
		quickSort(arr, 0, arr.length - 1);
		print(arr);
		
	}

}
