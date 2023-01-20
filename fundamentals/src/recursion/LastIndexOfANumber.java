package recursion;

import java.util.Scanner;

public class LastIndexOfANumber {
	public static int firstIndex(int input[], int x) {
		
		if(input.length == 0) {
			return -1;
		}

        if(x == input[0]){
            return 0;
        }

        int[] smallArray = new int[input.length-1] ;
        
        for(int i=0; i<smallArray.length; i++) {
        	smallArray[i] = input[i+1];
        }

        int Index = firstIndex(smallArray, x);
        
        if(Index == -1) {
        	return -1;
        }else {
        	return Index+1;
        }
        		
    }
	
	
//	public static int firstIndex(int input[], int x, int si) {
//
//        if(x == input[si]){
//            return si;
//        }
//
//        if(si==input.length-1){
//            return -1;
//        }
//
//        int Index = firstIndex(input, x, si+1);
//
//        return Index;
//    }
  
  
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
		
//		System.out.println(firstIndex(arr,x, 0));
		
		System.out.println(firstIndex(arr,x));
		
	}

}
