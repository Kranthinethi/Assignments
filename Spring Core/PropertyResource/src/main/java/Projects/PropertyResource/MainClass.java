package Projects.PropertyResource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class MainClass 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(ConfigFile.class);
        DataSource s=(DataSource) context.getBean("dataSource");
        s.display();
        
    }
}
