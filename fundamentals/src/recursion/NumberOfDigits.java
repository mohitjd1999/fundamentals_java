package recursion;

public class NumberOfDigits {
	
  public static int count(int n){
        
        if(n<1){
            return 0;
        }
		
        int smallOutput = count(n/10);
        
        int Output = 1 + smallOutput;
        
        return Output;
        
    }

	public static void main(String[] args) {
		
		System.out.println(count(156));
	}

}
