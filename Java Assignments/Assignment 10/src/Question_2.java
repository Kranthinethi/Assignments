
import java.util.*;

public class Question_2 {
public static void main(String[] args) {
	String s="The quick brown fox jumps over the lazy dog";
	String[] strarr=s.split(" ");
	List<String> list=new ArrayList<String>();
	for (String string : strarr) {
		list.add(string);
	}
	String[]  arrListtoStringArray=list.stream().toArray(size->new String[size]);
	
	System.out.println(Arrays.toString(arrListtoStringArray));
	
	
}
}
