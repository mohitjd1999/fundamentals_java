package assignments;
import java.util.Scanner;

public class CheckNumberSequence {

	public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int prev = sc.nextInt();
        
        //int i=1;
        boolean up=false;
        boolean valid=true;
        
        for(int i=1; i<n; i++){
            int curr = sc.nextInt();
            
            int diff = curr-prev;
            
            if(diff==0){
                valid=false;
            }else if(diff>0){
                up=true;
            }else if (up && diff<0){
                valid = false;
            }
            
            prev = curr;
        }
        
        System.out.print(valid);
	}

//        int current = sc.nextInt();
//        
//        boolean isDec = true;
//        for(int i=0; i<n-2; i++){   	
//            if(prev == current) {
//                isDec = false;
//                return;
//            }if(isDec==true && prev>current){
//            	isDec = true;
//            }if(isDec==true && prev<current) {
//            	isDec = false;
//            }if(isDec==false && prev>current){
//            	isDec = true;
//            	return;
//            }if(isDec==false && prev<current){
//            	isDec = true;
//            	return;
//            }
//            
//            prev = current;
//            current = sc.nextInt();
//            
//        }
//        
//       System.out.print(isDec);
//	}

}
