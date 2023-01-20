package array2D;
import java.util.Scanner;

public class FunctionWith2DArray {
	
	public static void print2DArray(int[][] arr){
		
		int rows = arr.length;
		
		for(int i=0; i<rows; i++) {
	    	for(int j=0; j<arr[i].length; j++) {
	    		System.out.print(arr[i][j]+ " ");
	    	}
	    	System.out.println();
	    }
	}
	
	public static int[][] takeInput(){
       Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number of rows");
		int rows = sc.nextInt();
		System.out.println("Enter the Number of columns");
	    int columns = sc.nextInt();
	    
	    int arr[][] = new int [rows][columns];
	    
	    for(int i=0; i<rows; i++) {
	    	for(int j=0; j<columns; j++) {
	    		System.out.println("Enter the " + i + "row " + j + "column");
	    		arr[i][j] = sc.nextInt();
	    	}
	    }
	    
	    return arr;
	}

	public static void main(String[] args) {
		int[][] input = takeInput();
		
		print2DArray(input);
	    
	    
	}

}
