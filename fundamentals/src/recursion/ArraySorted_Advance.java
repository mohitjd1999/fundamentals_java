package recursion;

import java.util.Scanner;

public class ArraySorted_Advance {
	
  public static boolean sorted(int arr[], int si){
        
	  if(si==arr.length-1) {
		  return true;
	  }
	  
	  if(arr[si]>arr[si+1]) {
		  return false;
	  }
	  
	  boolean isSmallArraySorted = sorted(arr, si+1);
	  
	  return isSmallArraySorted;

   }
  
  
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
		
		System.out.println(sorted(arr,0));
		
	}

}
