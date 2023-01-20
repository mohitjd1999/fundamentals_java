package array2D;
import java.util.Scanner;

public class PrintSpiral {

	public static void spiralPrint(int matrix[][]){
      int rows = matrix.length;

        if(rows==0) {
        	System.out.println("");
        }else {
            int cols = matrix[0].length;
        
        int rowStart = 0;
        int colStart = 0;
        int colEnd = cols-1;
        int rowEnd = rows-1;
        
        int count =0;
    	while(count<=rows/2) {
    		
    		if((rowStart==rowEnd) && (colStart==colEnd)) {
    			System.out.print(matrix[rowStart][colStart] + " ");
    		}
            
        	if(rowStart >rowEnd) {
        		break;
        	}
            
        	int i=rowStart;
        	int j=colStart;
        	while(j<colEnd) {
        		System.out.print(matrix[i][j]+ " ");
        		j++;
            }
        	
        	i=colEnd;
        	j=rowStart;
        	while(j<rowEnd) {
        		System.out.print(matrix[j][i]+ " ");
        		j++;
        	}
        	
        	

        	i=rowEnd;
        	j=colEnd;
        	while(j>colStart) {
        		System.out.print(matrix[i][j]+ " ");
        		j--;
        	}
        	
        	i=colStart;
        	j=rowEnd;
        	while(j>rowStart) {
        		System.out.print(matrix[j][i]+ " ");
        		j--;
        	}
        	
        	
        	
        	rowStart++;
        	colStart++;
        	colEnd--;
        	rowEnd--;
         	
        	count++;
          }
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
		
		spiralPrint(input);       
	}

}
