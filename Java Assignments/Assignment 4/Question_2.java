package prog.question1.EH;
import java.util.*;

public class Question_2 {
public static void main(String[] args) {
	try {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value of a :");
		int a=sc.nextInt();
		System.out.print("Enter value of b :");
		int b=sc.nextInt();
		int result;
		if(b==0)
		{
			throw new UnsupportedOperationException();
		}
		result=a/b;
		System.out.print("result :"+result);
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println("Divide by zero");
		System.out.println(e);
		
	}
	
	
}
}
