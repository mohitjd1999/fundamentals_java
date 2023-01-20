package searchingAndsorting;
import java.util.Scanner;

public class InsertionSort {
	
	public static void insertionSort(int[] arr){
//		for(int i=1; i<arr.length; i++){
//            for(int j=0; j<=i; j++){
//                if(arr[j] > arr[i]){
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
		
		
		for(int i=1; i<arr.length; i++) {
			   int temp =arr[i];
			   int j;
			   for(j=i-1; j>=0; j--) {
				   if(arr[j] > temp) {
					   arr[j+1] = arr[j];
				   }else 
					  break;  
			   } 
			   arr[j+1] = temp;
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
		
		insertionSort(arr);
		
		printArray(arr);
		
	}

}
