package searchingAndsorting;
import java.util.Scanner;

public class MergeTwoSortedArrays {
	
	public static int[] merge(int arr1[], int arr2[]){

		int length = arr1.length + arr2.length;
		int arr3[] = new int [length];
		
		int i=0, j=0, k=0;
		while(i<arr1.length && j<arr2.length) {
		    	if(arr1[i] < arr2[j]) {
					arr3[k] = arr1[i];
					i++; k++;
				}
				else {
					arr3[k] = arr2[j];
					j++; k++;
				}
		    }
        
        while(i<arr1.length){
            arr3[k] = arr1[i];
            i++; k++;
        }
        
        while(j<arr2.length){
            arr3[k] = arr2[j];
            k++; j++;
        }
		
		return arr3;
	}
	
	
	public static void printArray(int []arr) {
		for(int element : arr) {
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
		int arr1[] = takeInput();
		
		int arr2[] = takeInput();
	
		
		int arr3[] = merge(arr1, arr2);
		
		printArray(arr3);
		
	}

}
