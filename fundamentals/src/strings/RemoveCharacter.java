package strings;
import java.util.Scanner;

public class RemoveCharacter {
	
	public static String removeAllOccurrencesOfChar(String str, char ch) {
        String output = "";
		for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != ch){
                output += str.charAt(i);
            }
        }
        
        return output;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		char ch = sc.next().charAt(0);
		
		System.out.println(removeAllOccurrencesOfChar(str, ch));

	}

}
