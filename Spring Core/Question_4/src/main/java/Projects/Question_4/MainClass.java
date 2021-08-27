package Projects.Question_4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("Question_4.xml");
		Greetings g1=(Greetings)context.getBean("greetings");
		g1.print();
	}
}
