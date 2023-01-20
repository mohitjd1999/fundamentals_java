package fundamentals;

public class ContinueKeyword {

	public static void main(String[] args) {
//		int i=1;
		int n=5;
		
//		while(i <= n) {
//			if(i == 3) {
//				i++;
//				continue;
//			}
//
//			System.out.println(i);
//			i++;
//		}
		
		for(int i=1; i<=n; i++) {
			if(i==3) {
				continue;
			}
			
			System.out.println(i);
		}
	}

}
