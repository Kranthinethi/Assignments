import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.*; 

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented

@interface Test{
	String info() default "test";	
}

class AnnotationMethod{
	@Test(info="This method is testcase method")
	public void testMethod(){
		System.out.println("testMethod executed");
	}
}



class Question_1 {
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		AnnotationMethod obj=new AnnotationMethod();
		
		Method m=obj.getClass().getMethod("testMethod");
		
		Test t=m.getAnnotation(Test.class);
		System.out.println(t.info());
		
		
         
	}

}
