package strings;
import java.util.Scanner;

public class CompressTheString {
	
	public static String getCompressedString(String str) {
	              
        if(str == null) {
        	return null;
        }
      
        if(str.length() == 0) {
        	return "";
        }
        
        String output = "";
        
        int i=0;
        int j=0;
        
        while(i<str.length()) {
            while(j<str.length() && str.charAt(i) == str.charAt(j) ) {
        	       j++;
            }
            
            int count = j-i;
            
            if(count != 1 ) {
            	output+= str.charAt(i) + "" + count;
            }else {
            	output+= str.charAt(i) + "";
            }
            
        	i = j;
        
        }
        
        return output;
	}
        

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
//		getCompressedString(str);
		
		System.out.println(getCompressedString(str));

	}

}
