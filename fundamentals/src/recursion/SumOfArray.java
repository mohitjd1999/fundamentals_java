package recursion;

import java.util.Scanner;

public class SumOfArray {
	
	public static int sum(int input[]) {
		
        if(input.length==1){
          return input[0];
        }
        
        input[input.length-2]+=input[input.length-1];
        
        int[] smallArray = new int [input.length-1];
        
        for(int i=0; i<smallArray.length; i++){
            smallArray[i] = input[i];
        }
        
        int smallOutput = sum(smallArray);
       
        
        return smallOutput;
        
		
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
		
		System.out.println(sum(arr));
		
	}

}
