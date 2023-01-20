package recursion;

import java.util.Scanner;

public class TowerOfHanoi {

    public static void towerOfHanoi(int disks, char source, char auxiliary, char destination) {
    	int n = disks;
    	char s = source;
    	char h = auxiliary;
    	char d = destination;
    	
    	if(n<=0 || n>=20) {
    		return;
    	}
    	
    	if(n==1) {
    	   System.out.println("move 1st disk from " + source + " to " + destination);
    	   return;
    	}
    	
    	towerOfHanoi(n-1, s, d, h);
    	System.out.println("move " + n + "th disk from " + source + " to " + destination);
    	
    	towerOfHanoi(n-1, h, s, d);
    	
    }
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		towerOfHanoi(n, 'a', 'b', 'c');
		
	}

}
