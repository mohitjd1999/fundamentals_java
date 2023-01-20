package recursion;

import java.util.Scanner;

public class GeometricSum {
	
   public static double findGeometricSum(int k){
		
		if(k==0){
			return 1;
		}

       
        double sum = 1 / (Math.pow(2, k));

		double smallAns = sum + findGeometricSum(k-1);

		return smallAns;

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		
		System.out.println(findGeometricSum(k));
	}

}
