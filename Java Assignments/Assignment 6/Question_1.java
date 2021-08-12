import java.util.TreeMap;
import java.util.Collections;
import java.util.Map;

public class Question_1 {
public static void main(String[] args) {
	Map<Long,Contact> map=new TreeMap<Long,Contact>(Collections.reverseOrder());
	map.put( (long) 91001, new Contact(91001,"person1","personEmail1",Gender.MALE));
	map.put( (long) 91002, new Contact(91002,"person2","personEmail2",Gender.FEMALE));
	map.put( (long) 91003, new Contact(91003,"person3","personEmail3",Gender.MALE));
	map.put( (long) 91004, new Contact(91004,"person4","personEmail4",Gender.FEMALE));
	
	System.out.println("Only keys:"+map.keySet());
	System.out.println();
	System.out.println("only values:");
	for (long pn : map.keySet()) {
		System.out.println(map.get(pn));
	}
	System.out.println();
	System.out.println("Printing all key value pairs");
    System.out.println(map);
}
}
enum Gender{
	MALE,FEMALE;
}

class Contact{
	private long phonenumber;
	private String name;
	private String email;
	private Gender g;
	
	public Contact(long phonenumber, String name, String email, Gender g) {
		this.phonenumber = phonenumber;
		this.name = name;
		this.email = email;
		this.g = g;
	}
	@Override
	public String toString() {
		return "Contact [phonenumber=" + phonenumber + ", name=" + name + ", email=" + email + ", g=" + g + "]";
	} 
}