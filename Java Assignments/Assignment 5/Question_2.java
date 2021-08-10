import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;


public class Question_2 {

	public static void main(String[] args) {
		HashMap<Integer,Double> h1=new HashMap<Integer, Double>();
		for(int i=1;i<=10;i++) {
		Random r=new Random();
		int numberInt =r.nextInt();
		double numberDouble=r.nextDouble();
		h1.put(numberInt,numberDouble);
		}
		System.out.println(h1);
	}

}
