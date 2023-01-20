package searchingAndsorting;
import java.util.Scanner;

public class RotateArray {
	
	public static void rotate(int arr[], int d) {

		int temp[] = new int [arr.length];
        int k=0;
        
        for(int i=0; i<arr.length; i++){
           if(i < d) {
        	   temp[(arr.length-d)+i] = arr[i];
        
           }else {
        	   temp[k] = arr[i];
        	   k++;
           }
        }
        
        for(k=0; k<arr.length; k++) {
        	arr[k] = temp[k];
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
		
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		
		rotate(arr, d);
		
		printArray(arr);
		
	}

}
