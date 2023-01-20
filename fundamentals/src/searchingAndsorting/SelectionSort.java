package searchingAndsorting;
import java.util.Scanner;

public class SelectionSort {
	
	public static void Sort(int arr[]) {
//		 int s=0, i=1, temp=0;
//	        while (i<=arr.length-1){
//	            
//	            if(arr[s] < arr[i]){
//	            	i++;
//	            	break;
//	            }else if(arr[s] > arr[i]) {
//	                temp = arr[s];
//	                arr[s] = arr[i];
//	                arr[i] = temp;
//	                s++;
//	                i=s+1;
//	            }
//	            
//	        }
		
//		int count=0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp =arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
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
		
		Sort(arr);
		
		printArray(arr);
		
	}

}
