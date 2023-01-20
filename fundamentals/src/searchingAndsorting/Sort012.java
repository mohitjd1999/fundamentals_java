package searchingAndsorting;
import java.util.Scanner;

public class Sort012 {
	
	public static void sort012(int arr[]) {
//	   int length = arr.length;
//       int temp[] = new int[length];
//       
//       int k=0; 
//       
//    	for(int i=0; i<arr.length; i++){
//            if(arr[i] ==0){
//                temp[k] = arr[i];
//                k++;
//            }else if(arr[i] == 2){
//                temp[length-1] = arr[i];
//                length--;
//            }else{
//                
//            }
//        }	
//    	
//    	for(int j=0; j<k; j++) {
//    	   arr[j] = temp[j];
//    	}
//        
//    	for(int j=arr.length-1; j>=length; j--) {
//     	   arr[j] = temp[j];
//     	}
//    	
//    	for(int j=k; j<length; j++){
//    		arr[j] = 1;
//    	}
    	
		
		int nextZero = 0;
		int nextTwo  = arr.length-1;
		for(int i=0; i<= nextTwo; i++) {
			if(arr[i] == 0) {
				int temp = arr[nextZero];
				arr[nextZero] = arr[i];
				arr[i] = temp;
				nextZero++;
			}else if(arr[i] == 2) {
				int temp = arr[nextTwo];
				arr[nextTwo] = arr[i];
				arr[i] = temp;
				nextTwo--;
			}else {
				i++;
			}
		}
    	
    	
         
	}
	
	public static void printArray(int arr[]) {
		for(int element: arr) {
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
		
		
		sort012(arr);
		
		printArray(arr);
		
	}

}
