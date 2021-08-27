import java.util.*;

public class Question_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		ArithmeticOp add=(int num1,int num2)->a+b;
		System.out.println("Addition is:"+add.result(a, b));
		ArithmeticOp sub=(int num1,int num2)->a-b;
		System.out.println("subtraction is:"+sub.result(a, b));
		ArithmeticOp mul=(int num1,int num2)->a*b;
		System.out.println("Multiplication is:"+mul.result(a, b));
		try {
		ArithmeticOp div=(int num1,int num2)->a/b;
		System.out.println("division is:"+div.result(a, b));
		}
		catch(ArithmeticException e)
		{
			System.out.println("can't divide with zero");
		}	
	}
}

@FunctionalInterface
interface ArithmeticOp{
	int result(int a,int b);
	
}