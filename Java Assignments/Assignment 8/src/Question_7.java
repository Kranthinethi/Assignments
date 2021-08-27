import java.util.*;
public class Question_7 {
public static void main(String[] args) {
	
	Map<Integer,String> map=new HashMap<>();  
	  map.put(1,"axga");  
	  map.put(2,"dsd");  
	  map.put(3,"dsd"); 
	  
	  System.out.println(map);
	  
	  StringBuilder buf=new StringBuilder();
	  
	  for(Map.Entry m:map.entrySet()) {
		  
		  buf.append(m.getKey());
		  buf.append(m.getValue());
	  }
	  System.out.println(buf);

}
}
