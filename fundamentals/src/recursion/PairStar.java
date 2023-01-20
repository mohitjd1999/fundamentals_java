package recursion;
import java.util.Scanner;

public class PairStar {
	
//	public static String helper(String s)
	
	public static String addStars(String s) {
		if(s.length()==0 || s.length()==1){
			return s;
		}
        
		String str="";
		if(s.charAt(s.length()-1) == s.charAt(s.length()-2)){
            str = "*" +s.charAt(s.length()-1)  ;
		}else {
			str = s.charAt(s.length()-1) + "";
		}

		String smallAns = addStars(s.substring(0, s.length()-1)) + str; 

		return smallAns;

	}

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
      
        
        System.out.println(addStars(str));
        

	}

}
