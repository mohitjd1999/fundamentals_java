package arrays;
import java.util.Scanner;

public class Sort_0_1 {
	
	public static void sort(int arr[]){ 
//		int temp=0;
//		for(int i=0; i<arr.length; i++){
//            for(int j=i+1; j<arr.length; j++){
//                if(arr[i]!=arr[j] && arr[i] > arr[j]){
//                   temp = arr[i];
//                   arr[i] = arr[j];
//                   arr[j] = temp;
//                   break;
//                }
//            }
//        }
		

		int count=0;
		for(int i=0; i<arr.length; i++) {
			if (arr[i] == 0) {
				count++;
			}
		}
		
		for(int i=0; i<count; i++) {
			arr[i] = 0;
		}
		
		for(int i=count; i<arr.length; i++) {
			arr[i] = 1;
		}
		
		
		
	}
	
	public static void printArray(int arr[]) {
		for(int element: arr) {
			System.out.print(element + " ");
		}
		
		System.out.println();
	}
	
	public static int []takeInput() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int []arr = new int [n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		return arr;	
	}

	public static void main(String[] args) {
		
		int []arr = takeInput();
		
		sort(arr);
		printArray(arr);
		
	}

}
;