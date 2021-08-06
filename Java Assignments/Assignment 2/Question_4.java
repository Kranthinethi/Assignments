//Contains Intentional Errors
class Question_4{
	public static void main(String[] args) {
		
	}
}

abstract   class Question4_0 {
  //abstract class without abstract method
}
abstract   class Question4_1 {
	  //class should be abstract if one of the method is abstract
	   abstract void test();
}
class Question4_2 extends Question4_1
{
	@Override
	void test() {
		// Implementing abstract method of super class	
	}	
}

/*class Question4_3{
	public static void main(String[] args) {
	
	 //Quesion4_1 obj=new Question4_1();
	//object cannot be instantiated
	}
}

private abstract class Question4_4{
	//abstract classes should not be private
}
final abstract class Question4_5{
	//abstract classes should not be final
}*/

abstract class Question4_6{
//we can create abstract without having abstract method
}






