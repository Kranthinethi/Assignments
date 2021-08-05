import java.util.*;

public class ArmstrongNumber {
public static void main(String[] args) {
	int number,result=0,remainder;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number:");
	number=sc.nextInt();
	int temp=number;
	while(number!=0)
	{
		remainder=number%10;
		result=result+remainder*remainder*remainder;
		number=number/10;
	}
	System.out.println(result);
	
	if(temp==result)
		System.out.println("Number is Armstrong");
	else
		System.out.println("Number is Not Armstrong");
}
}
