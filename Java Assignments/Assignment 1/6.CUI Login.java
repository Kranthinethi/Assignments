import java.util.*;
public class Login {
public static void main(String[] args) {
	String Username;
	String password;
	
	Scanner sc=new Scanner(System.in);
	System.out.print("Please Enter UserName:");
	Username=sc.next();
	System.out.print("Please Enter Password:");
	password=sc.next();
	System.out.println("Welcome! "+Username);
	System.out.println();
	Attempt(Username,password);
	
	
}
public static void Attempt(String Username,String password){
	
	System.out.println("LOGIN");
	String user;
	String pass;
	
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<3;i++)
	{
		System.out.print("Enter you Username");
		user=sc.next();
		System.out.print("Please Enter Password:");
		pass=sc.next();
		
		if(user.equals(Username) && pass.equals(password))
		{
			System.out.println("Welcome! "+user);
			System.exit(0);
		}
		else
		{
			if(i==2)
			{
				System.out.println("LOGIN FAILED contact Admin");
				System.exit(0);
			}
			else {
			System.out.println("Attempt Failed "+"remaining "+(3-(i+1))+" attempts ");
			continue;
			}
		}
	}
	
	
}
}
