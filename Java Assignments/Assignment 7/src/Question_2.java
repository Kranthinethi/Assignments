import java.lang.annotation.Annotation;
import java.lang.annotation.*;

@Target({ElementType.TYPE,ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface Info{
	int authorid();
	String author();
	String supervisor();
	String date();
	String time();
	int version();
	String description();	
}
@Info(authorid=123,author="author1",supervisor="sup1",date="18-12-1998",time="00:12:56",version=1,description="developer info")
class Developer{
	void show() {
		System.out.println("Developer");
	}
	
}
public class Question_2{

	public static void main(String[] args) {
		Developer obj=new Developer();
		Class c=obj.getClass();
		Annotation a=c.getAnnotation(Info.class);
		Info i=(Info)a;
		System.out.println("AuthorId: "+i.authorid()+"\nAuthor: "+i.author()+"\nSupervisor:"+i.supervisor()+"\nDate:"+i.date()+"\nTime:"+i.time()+"\nVersion:"+i.version()+"\nDescription:"+i.description());
		
	}

}