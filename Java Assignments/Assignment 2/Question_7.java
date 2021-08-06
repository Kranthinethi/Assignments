import java.util.*;

public class Question_7 {
	public static void main(String[] args) {
	 
	  DesertItem obj1=new Candy();
	  DesertItem obj2=new Cookie();
	  DesertItem obj3=new Icecream();
	  
	 while(true) {
		 System.out.print("Select you role OWNER or CUSTOMER:");
		 Scanner sc=new Scanner(System.in);
		 String role=sc.next();
		 
		
	switch (role) {
	 case "OWNER":
		          while(true) {
		           System.out.print("Enter the Item to Add:");
	               String s=sc.next();
	            
	             if(s.equals("Candy") || s.equals("Cookie") || s.equals("Icecream") )
	             {
	            	 System.out.println("Item Added Successfully");
	            	 break;
	  
	             }
	             else
	             {
	            	 System.out.println("Entered Item is wrong");
	             }
		          }
		          break;
	             
	            
		          
	         
	case "CUSTOMER": 
		             System.out.print("Select the Item to order");
	                 String c=sc.next();
	                 if(c.equals("Candy") || c.equals("Cookie") || c.equals("Icecream") )
		             {  
	                	 if(c.equals("Candy"))
	                	 {
	                		 
	                		 System.out.println("Item Cost:"+obj1.getCost()+" Dollars");
	                		 System.out.println("Would you like to place the order (yes/no):");
	                		 String d=sc.next();
	                		 
	                		 if(d.equals("yes"))
	                		 {
	                			 System.out.println("Ordered placed successfully");
	                			 break;
	                		 }
	                		 else {
	                			 System.out.println("Ordered Unsuccessful!!!");
	                			 break;
	                		 }
	                	 }
		            	
	                	 else if(c.equals("Cookie"))
	                	 {
	                		 System.out.println("Item Cost:"+obj2.getCost()+" Euros");
	                		 System.out.println("Would you like to place the order (yes/no):");
	                		 String d=sc.next();
	                		 
	                		 if(d.equals("yes"))
	                		 {
	                			
	                			 System.out.println("Ordered placed successfully");
	                			 break;
	                		 }
	                		 else {
	                			 System.out.println("Ordered Unsuccessful!!!");
	                			 break;
	                		 }
	                	 }
	                	 else {
	                		 System.out.println("Item Cost:"+obj3.getCost()+" Rupees");
	                		 System.out.println("Would you like to place the order (yes/no):");
	                		 String d=sc.next();
	                		 
	                		 if(d.equals("yes"))
	                		 {
	                			 System.out.println("Ordered placed successfully");
	                			 break;
	                		 }
	                		 else {
	                			 System.out.println("Ordered Unsuccessful!!!");
	                			 break;
	                		 }
	                	 }
		             }
		                       else
		                         {
		            	            System.out.println("Item not Available");
		                         }
	                 
	                              break;
	                
		
		 
	default:System.out.println("Role not Available!Select "+"Owner or" +" Customer only");
		 
	}
	 }
	}
	
	

}
abstract class DesertItem{
	abstract int getCost();
}
class Candy extends DesertItem{

	@Override
	int getCost() {
		// TODO Auto-generated method stub
		return 3;
	}
	
}
class Cookie extends DesertItem{
	@Override
	int getCost() {
		// TODO Auto-generated method stub
		return 5;
	}
}
class Icecream extends DesertItem{
	@Override
	int getCost() {
		// TODO Auto-generated method stub
		return 100;
	}
}
