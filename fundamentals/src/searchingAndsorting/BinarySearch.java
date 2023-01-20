package searchingAndsorting;
import java.util.Scanner;

public class BinarySearch {
	
	public static int binarySearch(int arr[], int x) {
		int e=arr.length-1; 
		for(int s=0; s<=e; ) {
			int mid = (s+e)/2;
			
			if(arr[mid]<x) {
				s = mid+1;
			}else if(arr[mid]>x) {
				e = mid-1;
			}else if(arr[mid] == x) {
				return mid;
			}
		}
		
		return -1;
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
		int x = sc.nextInt();
		
		System.out.println(binarySearch(arr, x));

	}

}
