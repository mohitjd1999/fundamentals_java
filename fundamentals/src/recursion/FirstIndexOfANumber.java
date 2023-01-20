package recursion;

import java.util.Scanner;

public class FirstIndexOfANumber {
//	public static int lastIndex(int input[], int x) {
//		
//		if(input.length==0){
//            return -1;
//        }
//        
//        if(x==input[input.length-1]){
//            return input.length-1;
//        }
//        
//        int[] smallArray = new int [input.length-1];
//        
//        for(int i=0; i<smallArray.length; i++){
//            smallArray[i] = input[i];
//        }
//        
//        int Index = lastIndex(smallArray, x);
//         
//         return Index;
//	}
        		
	
	
	public static int lastIndex(int input[], int x, int si) {

        if(x == input[si]){
            return si;
        }

        if(si==0){
            return -1;
        }

        int Index = lastIndex(input, x, si-1);

        return Index;
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
		
		int si = arr.length-1;
		System.out.println(lastIndex(arr,x,si));
		
//		System.out.println(lastIndex(arr,x));
		
	}

}
