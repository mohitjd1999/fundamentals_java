package array2D;
import java.util.Scanner;

public class RowWiseSum {

    public static void sum(int[][] mat){
		
    	int rows = mat.length;

    	for(int i=0; i<rows; i++){
    		int sum = 0;
    		for(int j=0; j<mat[i].length; j++){
    			sum += mat[i][j] ;
    		}
    		System.out.print(sum + " ");
    	}

    }
	
	
	public static int[][] takeInput(){
       Scanner sc = new Scanner(System.in);
		
		int rows = sc.nextInt();
	    int columns = sc.nextInt();
	    
	    int arr[][] = new int [rows][columns];
	    
	    for(int i=0; i<rows; i++) {
	    	for(int j=0; j<columns; j++) {
	    		arr[i][j] = sc.nextInt();
	    	}
	    }
	    
	    return arr;
	}

	public static void main(String[] args) {
		int[][] input = takeInput();
		
		sum(input);       
	}

}
