package co.kranthi;
public class Question_3 {
	double balance;	
	double withdraw(double amount) throws InsufficientBalanceException
	{
		if(amount>balance || balance==0)
		{
			System.out.println("Insufficient Balance");
			throw new InsufficientBalanceException();
			
		}
		
		this.balance=this.balance-amount;
		
		
		return amount;
		
	}	
}

class InsufficientBalanceException extends Exception{
	private static final long serialVersionUID = 1L;
}

