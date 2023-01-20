package assignments;

import java.util.Scanner;

public class FindCharacterCase {
 
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        char ch = str.charAt(0);
        
        if(Character.isLowerCase(ch)){
        	System.out.println(0);  
        }else if(Character.isUpperCase(ch)) {
        	System.out.println(1);
        }else {
        	System.out.println(-1);
        }
        
        sc.close();
    }
}
