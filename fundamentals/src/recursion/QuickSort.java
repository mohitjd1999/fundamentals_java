package recursion;

import java.util.Scanner;

public class QuickSort {
	
	
	  public static void merge(int[] s1, int[] s2, int[]d) {
		  
		  int i=0, j=0, k=0; 
		  while(i<s1.length && j<s2.length) {  
			  if(s1[i] <= s2[j]) {
				  d[k]= s1[i];
				  i++;
				  k++;
			  }else {
				  d[k]= s2[j];
				  j++;
				  k++;
			  }
		  }
		  
		  if(i<s1.length) {
			 while(i<s1.length) {
			  d[k] = s1[i];
			  i++;
			  k++; 
			 }
		  }
		  
		 if(j<s2.length) {
			 while(j<s2.length) {
			  d[k] = s2[j];
			  j++;
			  k++;
		   }
		  }
    
  }
  
  public static void print(int arr[]) {
     for(int i=0; i<arr.length; i++) {
    	  System.out.print(arr[i]);
      }
  }

  
  public static void mergesort(int arr[]){
        
	  if(arr.length<=1) {
		  return;
	  }
	  
	  int []a = new int[arr.length/2];
	  int []b = new int[arr.length - a.length];
	  
	  for(int i=0; i<arr.length/2; i++) {
		  a[i] = arr[i];
	  }
	  
	  for(int i=arr.length/2; i<arr.length; i++) {
		  b[i-arr.length/2] = arr[i];
	  }
	  
	  mergesort(a);
	  mergesort(b);
	  
	  merge(a, b, arr);  
	  
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
		
		mergesort(arr);
		print(arr);
		
	}

}
