import java.util.*;

public class IncomeTax {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter CTC:");
		int ctc=sc.nextInt();
		
		if(ctc<=180000)
		{
			System.out.println("Total tax amount:NILL");
		}
		else if(ctc>180000 && ctc<=300000) {
			System.out.println("Total tax amount:"+(0.1*ctc));
		}
		else if(ctc>300000 && ctc<=500000)
		{
			System.out.println("Total tax amount:"+(0.2*ctc));
		}
		else if(ctc>500000 && ctc<=1000000)
		{
			System.out.println("Total tax amount:"+(0.3*ctc));
		}
		else {
			
		}
		
	}
}
