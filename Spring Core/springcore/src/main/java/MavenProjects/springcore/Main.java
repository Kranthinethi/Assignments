package MavenProjects.springcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext obj=new ClassPathXmlApplicationContext("spring.xml");		
		Customer cust=(Customer) obj.getBean("Customer");
		cust.print();

	}

}
    