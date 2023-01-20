//Write a program to calculate the total salary of a person. 
//The user has to enter the basic salary (an integer) and the grade (an uppercase character), and depending upon which the total salary is calculated as -


package assignments;
import java.util.Scanner;

public class TotalSalary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double basic = sc.nextDouble();
        
        String str = sc.next();
        char grade = str.charAt(0);
        
        
        double hra =  basic * 0.2;
        double da =  basic * 0.5;
        double pf =  basic * 0.11;
        
        double allow =0;
        
        if(grade == 'A'){
            allow = 1700;
        }else if (grade == 'B'){
            allow = 1500;
        }else{
            allow = 1300;
        }

        double totalSalary =  basic + hra + da + allow -pf;
        
        System.out.println(Math.round(totalSalary));
        
        sc.close();

	}

}
