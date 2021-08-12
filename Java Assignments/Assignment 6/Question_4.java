
import java.time.LocalDate;
import java.util.*;

public class Question_4 {
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				LocalDate d1=LocalDate.of(2005, 4, 4);
				LocalDate d2=LocalDate.of(2004, 7, 24);
				LocalDate d3=LocalDate.of(1975, 9, 2);
				LocalDate d4=LocalDate.of(1800, 8, 2);
				List<LocalDate> dob=new LinkedList<LocalDate>();
				dob.add(d1);
				dob.add(d2);
				dob.add(d3);
				dob.add(d4);
				System.out.println(dob);
                System.out.println();
				for(LocalDate b:dob){
					if(b.isLeapYear()){
						System.out.println("your date birth is "+b);
						System.out.println("is a leap year");
						System.out.println();
					}
					else{
						System.out.println("your date birth is "+b);
						System.out.println("is not a leap year");
						System.out.println();
					}
				}
				
	}

}
