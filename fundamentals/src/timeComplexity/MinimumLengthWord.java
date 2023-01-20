package timeComplexity;

import java.util.Scanner;
import java.util.Arrays;

public class MinimumLengthWord {
	
	public static String minLengthWord(String input){
        
//	  String output = "";
//      int count =0;
//      String output1 = "";
//      
//		for(int i=0; i<input.length(); i++){
//          if(input.charAt(i) != ' '){
//              output+= input.charAt(i);
//              count++;
//          }else{
//              count=0;
//              if(output.length() < output1.length()){
//                  output1 = output;
//              }
//              output="";
//          }
          
		String minWord= "";
		
		input=input.trim();//Triming any space before the String else space at start would be consider as smallest word     
        // minWord and maxWord are received by reference
        // and not by value
        // will be used to store and return output
         
        int len = input.length();
        int si = 0, ei = 0;
        int min_length = len, min_start_index = 0,
              max_length = 0, max_start_index = 0;
 
        // Loop while input string is not empty
        while (ei <= len)
        {
            if (ei < len && input.charAt(ei) != ' ')
            {
                ei++;
            }
            else
            {
                // end of a word
                // find curr word length
                int curr_length = ei - si;
 
                if (curr_length < min_length)
                {
                    min_length = curr_length;
                    min_start_index = si;
                }
 
                if (curr_length > max_length)
                {
                    max_length = curr_length;
                    max_start_index = si;
                }
                ei++;
                si = ei;
            }
        }
 
        
        // store minimum and maximum length words
       minWord = input.substring(min_start_index, min_start_index + min_length);
//       maxWord = input.substring(max_start_index, max_start_index+max_length);
       return minWord;
          
      }
		
    
		

		
		public static int []takeInput(){
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			
			int arr[] = new int [n];
			
			for(int i=0; i<arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			
			return arr;
		}
		
		

			public static void main(String[] args) {

				Scanner s = new Scanner(System.in);
				String str = s.nextLine();
				
				System.out.println(minLengthWord(str));
			}

}
