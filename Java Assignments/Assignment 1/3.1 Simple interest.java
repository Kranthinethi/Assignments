import java.util.*;
public class SimpleInterest {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Principle amount");
	double p=sc.nextDouble();
	
	System.out.println("Time on principle amount");
	int t=sc.nextInt();
	
	System.out.println("Rate of interest");
	int r=sc.nextInt();
	
	double si=(double)(p*t*r);
	System.out.println("Interest Amount:"+si/100);
	
	
	
	
}
}
