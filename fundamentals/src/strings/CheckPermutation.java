package strings;
import java.util.Scanner;

public class CheckPermutation {
	
  public static boolean isPermutation(String str1, String str2) {
	  
	  if(str1.length() != str2.length()) {
		  return false;
	  }
	  
	  boolean Permutation = true;
	  
	  int arr[] = new int [256];
	  char[] ch1 = str1.toCharArray();
	  char[] ch2 = str2.toCharArray();
	  
	  for(int i=0; i<str1.length(); i++) {
		  arr[ch1[i]]++;
	  }
	  
	  for(int i=0; i<str2.length(); i++) {
		  arr[ch2[i]]--;
	  }
	  
	  for(int i=0; i<arr.length; i++) {
		  if(arr[i]==0) {
			  Permutation = true;
		  }else {
			  Permutation = false;
			  break;
		  }
	  }
	  	
     
        
//        int sum1 = 0, sum2 =0;
//        for(int i=0; i<str1.length(); i++){
//            sum1 += (int)str1.charAt(i);
//        }
//        
//        for(int i=0; i<str2.length(); i++){
//            sum2 += (int)str2.charAt(i);
//        }
//        
//        System.out.println(sum1 + " " + sum2);
//        if(sum1 == sum2){
//        	
//            Permutation = true;
//        }else{
//            Permutation = false;
//        }
//        
        
        return Permutation;
        
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		System.out.println(isPermutation(str1, str2));

	}

}
