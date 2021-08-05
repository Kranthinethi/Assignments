import java.util.*;

public class AverageMarks
{
 public static void main(String[] args)
 {
	 Scanner sc=new Scanner(System.in);
	 
	  int[] a=new int[3];
	  int[] b=new int[3];
	  int[] c=new int[3];
	  
	  for(int i=0;i<3;i++) {
		  System.out.print("Enter subject "+(i+1)+" Marks of A:");
		  a[i]=sc.nextInt();
	  }
	  System.out.println();
	  for(int i=0;i<3;i++) {
		  System.out.print("Enter subject "+(i+1)+" Marks of B:");
		  b[i]=sc.nextInt();
	  }
	  System.out.println();
	  for(int i=0;i<3;i++) {
		  System.out.print("Enter subject "+(i+1)+" Marks of C:");
		  c[i]=sc.nextInt();
	  }	  
	  
	  System.out.println();
	  
	  System.out.println("Total marks of A is: "+(a[0]+a[1]+a[2]) +" and avergae marks in all subjects is "+((a[0]+a[1]+a[2])/3));
	  System.out.println("Total marks of B is: "+(b[0]+b[1]+b[2]) +" and avergae marks in all subjects is "+((b[0]+b[1]+b[2])/3));
	  System.out.println("Total marks of C is: "+(c[0]+c[1]+c[2]) +" and avergae marks in all subjects is "+((c[0]+c[1]+c[2])/3));
	  
	  int totalA=(a[0]+b[0]+c[0]);
	  int totalB=(a[1]+b[1]+c[1]);
	  int totalC=(a[2]+b[2]+c[2]);
	  System.out.println();
			  
	  System.out.println("Total scored in 1st subject: "+totalA+" and average scored in this subject is "+(totalA/3));
	  System.out.println("Total scored in 2nd subject: "+totalB+" and average scored in this subject is "+(totalB/3));
	  System.out.println("Total scored in 3rd subject: "+totalC+" and average scored in this subject is "+(totalC/3));
	  

}
}
