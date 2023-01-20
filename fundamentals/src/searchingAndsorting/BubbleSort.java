package searchingAndsorting;
import java.util.Scanner;

public class BubbleSort {
	
	public static void bubbleSort(int[] arr){
    	for(int i=arr.length-1; i>=0; i--){
            for(int j=0; j<arr.length-1; j++)
            if(arr[j] > arr[j+1]){
                int temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;
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
		
		bubbleSort(arr);
		
		printArray(arr);
		
	}

}
