package functions;
import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void FarenheitTable(int S, int E, int W){
        for(int i=S; i<=E; i+=W){
            int Cel = (i-32)*5/9;
            System.out.println(i + "\t" + Cel);
        }
       
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		int E = sc.nextInt();
        int W = sc.nextInt();
        
        FarenheitTable(S, E, W);
    
        sc.close();
	}
	
}
