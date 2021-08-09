package prog.question1.EH;

import java.util.Scanner;

public class Question_3 {
public static void main(String[] args) {
	SavingAccount s=new SavingAccount();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the balance :");
	double balance=sc.nextDouble();
	s.setBalance(balance);
	s.id=900000001;
	System.out.println("Enter the amount");
	
	double amount =sc.nextDouble();
	try {
		System.out.println("successfully withdrawn "+s.withdraw(amount)+" amount");
		System.out.println("Remaining balance"+(s.balance));
	} catch (Exception e) {
	  
		System.out.println(e);
	}
	
	
}
}
class SavingAccount{
	long id;
	double balance;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	double withdraw(double amount) throws InsufficientBalanceException, illegalBankTransactionException
	{
		if(amount>balance || balance==0)
		{
			System.out.println("Insufficient Balance");
			throw new InsufficientBalanceException();
			
		}
		if(amount<0)
		{
			System.out.println("NEGATIVE VALUE");
			throw new illegalBankTransactionException();
		}
		this.balance=this.balance-amount;
		
		
		return amount;
		
	}	
}

class illegalBankTransactionException extends Exception{
	private static final long serialVersionUID = 1L;	
}
class InsufficientBalanceException extends Exception{
	private static final long serialVersionUID = 1L;
}





