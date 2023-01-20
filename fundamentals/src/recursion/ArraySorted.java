package recursion;

import java.util.Scanner;

public class ArraySorted {
	
  public static boolean sorted(int arr[]){
        
	  if(arr.length==1) {
		  return true;
	  }
	  
	  if(arr[0]>arr[1]) {
		  return false;
	  }
	  
	  int[] smallArray = new int [arr.length-1];
	  for(int i=0; i<smallArray.length; i++) {
		  smallArray[i] = arr[i+1];
	  }
	  
	  boolean isSmallArraySorted = sorted(smallArray);
	  
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
		
		System.out.println(sorted(arr));
		
	}

}
