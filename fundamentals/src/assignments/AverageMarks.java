package assignments;

import java.util.Scanner;

public class AverageMarks {

	public static void main(String[] args) {
		
        
		Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = str.charAt(0);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int avg = (a+b+c)/3 ;
        System.out.println(ch);
        System.out.println(avg);
        
    	sc.close();
	}

}

