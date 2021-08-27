package co.kranthi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;


class Question_4Test {
	
   Question_4 obj;
   
   @BeforeAll
   static void beforeallmethod() {
	   System.out.println("First method executes before every other method");
	   System.out.println("------------------------------------------------");
   }
   
    @BeforeEach
  	void init() {
		obj=new Question_4();
		System.out.println("Executes everytime before each test case executes");
	}
    
    @AfterEach
    void afterEachdemo() {
    	System.out.println("Executed after each test method executes");
    	System.out.println("-------------------------------------------");
    }
    
    
    
    @AfterAll
    static void cleanup() {
    	System.out.println("Executed after all methods are done executing...");
    }
    
	@Test
	void test1() {
		System.out.println("Instance created for test1 by BEFOREEACH method--^");
		String expected="Hello!Kranthi";
		String actual=obj.demo("Kranthi");
		assertEquals(expected, actual);
		
	}
	
	@Test
	void test2() {
		System.out.println("Instance created for test2 by BEFOREEACH method--^");
		String expected="Hello!KranthiKumar";
		String actual=obj.demo("KranthiKumar");
		assertEquals(expected, actual);
		
	}
	@Test
	void test3() {
		System.out.println("Instance created for test3 by BEFOREEACH method--^");
		String expected="Hello!KranthiKumarNethi";
		String actual=obj.demo("KranthiKumarNethi");
		assertEquals(expected, actual);
		
	}
	
}
