package searchingAndsorting;
import java.util.Scanner;

public class PushZerosToEnd {
	
	public static void pushZerosToEnd(int arr[]) {
		
		
//         for(int i=1; i<arr.length; i++){
//            for(int j=0; j<arr.length; j++) {
//            	if(arr[i]!=0 && arr[j]==0) {
//            		int temp = arr[j];
//                    arr[j] = arr[i];
//                    arr[i] = temp;
//            	}
//            	
//            } 	        
//        }
		
		int nonZero = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != 0 ) {
				int temp = arr[i];
				arr[i] = arr[nonZero];
				arr[nonZero] = temp;
				nonZero++;
			}
		}

		
		// Optimised version 
//		int temp[] = new int [arr.length];
//        int k=0;
//        
//        for(int i=0; i<arr.length; ){
//            if(arr[i] !=0){
//                temp[k] = arr[i];
//                i++;
//                k++; 
//            }else{
//                i++;
//            }
//        }
//        
//        for(k=0; k<arr.length; k++) {
//        	arr[k] = temp[k];
//        }
        
	}
	
	public static void printArray(int temp[]) {
		for(int element: temp) {
			System.out.print(element + " ");
		}
	    System.out.println();
	}

	public static int []takeInput(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int []arr = new int [n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		return arr;
		
	}
	
	public static void main(String[] args) {
		int arr[] = takeInput();
		
		pushZerosToEnd(arr);
		
		printArray(arr);
		
	}

}
