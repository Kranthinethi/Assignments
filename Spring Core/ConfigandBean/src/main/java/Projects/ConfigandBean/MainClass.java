package Projects.ConfigandBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
public static void main(String[] args) {
		/*Normal configuration through xml file
		 * ApplicationContext context=new
		 * ClassPathXmlApplicationContext("ConfigBean.xml"); Consumer
		 * c1=(Consumer)context.getBean("consumer1"); c1.displayItems();
		 */
	
	
	ApplicationContext ctx =new AnnotationConfigApplicationContext(ConfigFile.class);
	Consumer c1=(Consumer)ctx.getBean(Consumer.class);
	c1.displayItems();
}
}
