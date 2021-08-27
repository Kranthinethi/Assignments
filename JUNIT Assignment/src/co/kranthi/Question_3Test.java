package co.kranthi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Question_3Test {

	@Test
	void test() {
		Question_3 obj=new Question_3();
		obj.balance=55000;
		assertThrows(InsufficientBalanceException.class,()-> obj.withdraw(550000));
		
	}

}
