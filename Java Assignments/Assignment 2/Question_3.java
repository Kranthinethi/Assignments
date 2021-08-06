
public class Question_3{
 static double totalCash;
 double cash;
 void addCash(double cash) 
 {
	this.cash=this.cash+cash;
	Question_3.totalCash=totalCash+cash; 
 }
 
}
class Savings extends Question_3{
    void addCash(double FixedDeposits)
    {
    	super.addCash(FixedDeposits);	
    }
	
}
class Current extends Question_3{
	 void addCash(double CashCredit)
	    {
	    	super.addCash(CashCredit);	
	    }
}

class TotalCash{
	public static void main(String[] args) {
		Question_3 s=new Savings();
		s.addCash(5009);
		Question_3 c=new Current();
		c.addCash(1000);
		

		System.out.println(s.totalCash);
		
		
	}
}