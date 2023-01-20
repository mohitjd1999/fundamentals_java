package searchingAndsorting;
import java.util.Scanner;

public class LinearSearch {
	
	public static int Search(int arr[]) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		
		for(int i=0; i<arr.length; i++) {
			if(x==arr[i]) {
				return i;
			}
		}
		
		
		return -1;
		
	}
	
	public static int []takeInput(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		int []arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		return arr;
	}

	public static void main(String[] args) {
		int []arr = takeInput();
	
		System.out.println(Search(arr));

	}

}
