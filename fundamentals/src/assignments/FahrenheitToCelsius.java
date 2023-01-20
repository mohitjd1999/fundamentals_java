package assignments;

import java.util.Scanner;


// Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), 
//you need to convert all Fahrenheit values from Start to End at the gap of W, into their corresponding Celsius values and print the table.

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int S, E, W, C ;
        S = sc.nextInt();
        E = sc.nextInt();
        W = sc.nextInt();
        
        
        for(int i=S; i<=E;){
            C = ((i-32)*5)/9;
            System.out.println(i + " " + C);
            i=i+W;
        }
        
        sc.close();

	}

}
