package fundamentals;

public class ReturnKeyword {

	public static void main(String[] args) {
		int n=5;
		
		for(int i=1; i<=n; i++) {
			if(i==3) {
				return;
			}
			System.out.println(i);
		}
           System.out.println("Outside Loop");
	}

}
