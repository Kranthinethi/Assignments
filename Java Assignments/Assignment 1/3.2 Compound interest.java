import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	    
	    System.out.print("Enter the principal: ");
	    double principal = sc.nextDouble();

	    System.out.print("Enter the rate: ");
	    double rate = sc.nextDouble();

	    System.out.print("Enter the time: ");
	    int t = sc.nextInt();

	    System.out.print("Enter number of times interest is compounded: ");
	    double number = sc.nextDouble();

	    double interest = principal * (Math.pow((1 + rate/100), (t * number))) - principal;

	    System.out.println("Compound Interest: " + interest);
		
	}

}
