import java.util.HashSet;
import java.util.Iterator;

public class Question_1 {

	public static void main(String[] args) {
		
		HashSet<Employee> h1=new HashSet<Employee>();
	    Employee e1=new Employee(1,"CAPG1",250000,"Dept1");
	    Employee e2=new Employee(2,"CAPG2",250000,"Dept2");
		h1.add(e1);
		h1.add(e2);
	   Iterator<Employee> l=h1.iterator();
	   for (Employee e : h1) {
		   e.displayDetails();
	}

	}

}

class Employee{
	private int id;
	private String name;
	private double salary;
	private String department;
	


	public Employee(int id, String name, double salary, String department) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}



	void displayDetails()
	{
		
		System.out.println("ID        :"+this.id);
		System.out.println("Name      :"+this.name);
		System.out.println("Salary    :"+this.salary);
		System.out.println("Department:"+this.department);
		System.out.println("----------------------------------");
		
		
	}
	
	
	
}