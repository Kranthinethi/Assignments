
public class Question_1 {

	public static void main(String[] args) 
	{
		SingletonClass newobj=SingletonClass.getInstance();
		SingletonClass newobj2=SingletonClass.getInstance();
		

	}

}
 class SingletonClass{
	 static SingletonClass Obj1;;
	 
	 private SingletonClass(){
		 System.out.println("Object Created Successfully");
	 }
	 
	 static SingletonClass getInstance() {
		 if(Obj1==null)
		 {
			 Obj1=new SingletonClass();
		 }
		 return Obj1;	 
	 }
 }
 
 /*class InheritSingleton extends SingletonClass{
	 
 }*/
