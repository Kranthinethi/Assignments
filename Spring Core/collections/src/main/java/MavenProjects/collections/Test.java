package MavenProjects.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext obj=new ClassPathXmlApplicationContext("collection.xml");
		Question q1=(Question)obj.getBean("Question1");
		q1.print();
		QuestionSet q2=(QuestionSet)obj.getBean("Question2");
		q2.print();
		QuestionMap q3=(QuestionMap)obj.getBean("Question3");
		q3.print();
		
		demo d1=(demo)obj.getBean("demo1");
		d1.demo();
		System.out.println(d1);
		
		demo d2=(demo)obj.getBean("demo1");
		d2.demo();
		System.out.println(d2);
		
	}

}
