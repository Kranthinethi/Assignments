import java.util.*;
public class DeclareResult {
public static void main(String[] args) {
	
	int s1,s2,s3;
	Scanner sc=new Scanner(System.in);
	
	s1=sc.nextInt();
	s2=sc.nextInt();
	s3=sc.nextInt();
	
	if(s1>60 && s2>60 && s3>60)
	{
		System.out.println("Passed");
	}
	else if((s1>60 && s2>60 && s3<60) || (s1>60 && s2<60 && s3>60) || (s1<60 && s2>60 && s3>60))
	{
		System.out.println("Promoted");
	}
	else
	{
		System.out.println("Failed");
	}
	
	
	
}
}
