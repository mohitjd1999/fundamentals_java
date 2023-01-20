package strings;
import java.util.Scanner;

public class TakeInput {
   public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    String str = sc.next();                         // It deals with only token
	    System.out.println(str + " " + str.length());
	    
	    String str2 = sc.nextLine();                    // It deals with entire line
	    System.out.println(str2 + " " + str2.length()); 
   }
}
