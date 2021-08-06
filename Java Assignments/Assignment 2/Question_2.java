
public class Question_2{
 static double totalCash;
 double cash;
 
 void addCash(double cash) 
 { 
	this.cash=cash;
	Question_2.totalCash=totalCash+cash; 
 }
 
}
class Manager extends Question_2{
    void addCash(double incentives)
    {
    	super.addCash(incentives);	
    }
	
}
class Labour extends Question_2{
	 void addCash(double overtime)
	    {
	    	super.addCash(overtime);	
	    }
}

class Salary{
	public static void main(String[] args) {
		Question_2 s=new Manager();
		s.addCash(50);
		
		Question_2 c=new Labour();
		c.addCash(1000);
		
		//It will return only the totalAmount not on individual employee
		
		System.out.println(s.cash);
		
		
	}
}