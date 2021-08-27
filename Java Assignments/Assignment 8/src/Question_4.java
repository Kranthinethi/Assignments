
import java.util.ArrayList;
import java.util.List;
public class Question_4 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("abcbd");
		list.add("dsdada");
		list.add("sda");
		list.add("dsdgrge");
		
		list.removeIf(obj->((obj.length())%2!=0));
		System.out.println(list);
	}
}