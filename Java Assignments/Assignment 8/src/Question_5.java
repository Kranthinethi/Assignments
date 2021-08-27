import java.util.*;
import java.util.function.Consumer;

public class Question_5 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("adbshb");
		list.add("sdjsa");
		list.add("wehw");
		list.add("dsdha");
		StringBuffer buf=new StringBuffer();
		Consumer<List<String>> c=obj->{
			Iterator<String> it=obj.iterator();
			while(it.hasNext()) {
				String s=it.next();
				buf.append(s.charAt(0));
			}
		};
		
		c.accept(list);
		System.out.println(buf);
	}
}