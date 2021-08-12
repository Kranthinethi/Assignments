import java.util.*;
public class Question_3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("SORT BY:a)ID | b)NAME | c)DEPT | d)SALARY:");
		String s=sc.next();
		Set<Employee> set=null;
       if(s.equals("a"))
       {
    	   System.out.println("selected sort by id");
    	  set=new TreeSet<Employee>(new compareById());
       }
       else if(s.equals("b"))
       {
    	   System.out.println("selected sort by name");
    	 set=new TreeSet<Employee>(new compareByName());
       }
       else if(s.equals("c"))
       { System.out.println("selected sort by dept");
    	 set=new TreeSet<Employee>(new compareByDept());
       }
       else if(s.equals("d"))
       { System.out.println("selected sort by salary");
    	   set=new TreeSet<Employee>(new compareBySalary());
       }
       else
       {
       }
		
		
		set.add(new Employee(1,"abc","dep1",21001.0));
		set.add(new Employee(1,"cbd","dep2",26001.0));
		set.add(new Employee(1,"ghj","dep3",43001.0));
		set.add(new Employee(4,"xyz","dep4",32002.0));
		set.add(new Employee(5,"pqr","dep5",45212.20));
		set.add(new Employee(6,"stu","dep6",91001.0));
		set.add(new Employee(7,"klm","dep7",81001.0));
		set.add(new Employee(8,"nbg","dep8",71001.0));
		set.add(new Employee(9,"hd","dep9",23001.0));
		set.add(new Employee(10,"kdf","dep10",1121001.0));
		
		System.out.println();
		for(Employee employee:set) {
			System.out.println(employee);
		}
	}
}
class compareById implements Comparator<Employee>
{
	public int compare(Employee e1,Employee e2) 
	{
	    int ret=e1.id-e2.id;
		return ret;
	}	
}
class compareByName implements Comparator<Employee>
{
	public int compare(Employee e1,Employee e2) 
	{
	    int ret=e1.name.compareTo(e2.name);
		return ret;
	}
}
class compareByDept implements Comparator<Employee>
{
	public int compare(Employee e1,Employee e2) 
	{
		int ret=e1.dept.compareTo(e2.dept);
		return ret;
	}
}
class compareBySalary implements Comparator<Employee>
{
	public int compare(Employee e1,Employee e2) 
	{
		int  ret=Double.compare(e1.salary, e2.salary);
		return ret;
	}
}






class Employee implements Comparable<Employee>{
	int id;
	String name;
	String dept;
	double salary;
	
	public Employee(int id, String name, String dept, double salary) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee other) {
		
		int ret=this.id-other.id;
		  
		  if(ret==0)
		  {
			  ret=this.name.compareTo(other.name);
			  if(ret==0)
			  {
				  ret=this.dept.compareTo(other.dept);
				  if(ret==0)
				  {
					  ret=Double.compare(this.salary, other.salary);
				  }
			  }
		  }
		  
		  
		  return ret;
			
		}
	  
	  
	}
	
