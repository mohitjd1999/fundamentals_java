package array2D;
import java.util.Scanner;

public class PrintLikeWave {

    public static void sum(int[][] arr2d){
		
    	int rows = arr2d.length;

    	if(rows>0) {
    		int cols = arr2d[0].length;
    		for(int j=0; j<cols; j++) {

    			if(j%2==0) {
    				for(int i=0; i<rows; i++) {
    					System.out.print(arr2d[i][j] + " ");
    				} 
    			}else {
    				for(int i=rows-1; i>=0; i--) {
    					System.out.print(arr2d[i][j] + " ");
    				}
    			}
    		}
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
