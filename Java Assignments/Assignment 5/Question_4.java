import java.util.*;
public class Question_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair<String,String> p1=new Pair<>();
		p1.setKey("Hi!");
		p1.setValue("Hello");
		p1.displayDetails();
		
		
		Pair<String,Date> p2=new Pair<>();
		p2.setKey("Today is");
		p2.setValue(new java.util.Date());
		p2.displayDetails();	
	}

}
class Pair<T1,T2>{
	
	private T1 key;
	private T2 value;
	
	public void setKey(T1 key) {
		this.key = key;
	}
	public void setValue(T2 value) {
		this.value = value;
	}
	void displayDetails() {
		System.out.println(this.key+" "+this.value);
	}
	
}