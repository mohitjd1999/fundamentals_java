package arrays;
import java.util.Scanner;
import java.util.Arrays;

public class FindUnique {
	
 public static int findDuplicate(int[] arr) {
        Arrays.sort(arr);
        
        int i=0; 
        while(i<arr.length-1){
            if(arr[i] == arr[i+1]){
                return arr[i];
            }
            
            i++;
        }
        
        return -1;
	}

	public static int []takeInput(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int [n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		
		int arr[] = takeInput();

		System.out.println(findDuplicate(arr));
	}

}
