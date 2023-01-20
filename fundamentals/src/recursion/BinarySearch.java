package recursion;

import java.util.Scanner;

public class BinarySearch {
	
	public static int binarySearch(int input[], int si, int ei, int x) {

		if(si>ei){
			return -1;
		}
		
		int mid = (si+ei)/2;
		
		if(input[mid] == x) {
			return mid;
		}else if(input[mid] < x) {
			si=mid+1;
		}else {
			ei=mid-1;
		}
		
		int smallOutput = binarySearch(input, si, ei, x);
		return smallOutput;
		
//        int mid = (si+ei)/2;
//		
//		if(input[mid] == x) {
//			return mid;
//		}else if(input[mid] < x) {
//			return binarySearch(input, mid+1, ei, x);
//		}else {
//			return binarySearch(input, mid-1, ei, x);
//		}
//		
		
		
		
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
		Scanner sc = new Scanner(System.in);
		
		int []arr = takeInput();
		
		int x = sc.nextInt();
		
		System.out.println(binarySearch(arr,0, arr.length, x));
		
	}

}
