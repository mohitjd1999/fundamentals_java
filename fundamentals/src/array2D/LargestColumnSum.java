package array2D;
import java.util.Scanner;

public class LargestColumnSum {

    public static void sum(int[][] arr2d){
		
    	int rows = arr2d.length;
    	int cols;
    	int max =0;
    	if(rows>0) {
    		cols = arr2d[0].length;
    		for(int j=0; j<cols; j++) {
        		int sum =0;
        		for(int i=0; i<rows; i++) {
        			sum+= arr2d[i][j];
        		}
        		if(max<sum) {
        		    max = sum;
        		}
        	}

        	System.out.println(max);
    	}else {
    		System.out.println(" ");
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
