import java.util.*;
import java.util.function.UnaryOperator;

public class Question_6 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("adbshb");
		list.add("sdjsa");
		list.add("wehw");
		list.add("dsdha");
		
		
		System.out.println(list);
		
		list.replaceAll(new UppercaseOperation());
		
		System.out.println(list);

	}

}
class UppercaseOperation implements  UnaryOperator<String>{

	@Override
	public String apply(String s) {
		
		return s.toUpperCase();
	}
	

	}


