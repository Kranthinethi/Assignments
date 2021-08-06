import java.util.*;
public class Question_6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Data should save in (file or database):");
		String s=sc.next();
		FilePersistance f=new FilePersistance();
		DatabasePersistance d=new DatabasePersistance();
		if(s.contentEquals("file"))
		{
			f.persist();
		}
		else if(s.contentEquals("database"))
		{
			d.persist();
		}
		else
		{
			System.out.println("Invalid Entry!!!");
		}

	}

}
abstract class Persistance{
	abstract void persist();
}
class FilePersistance extends Persistance{

	@Override
	void persist() {
		System.out.println("Data saved in file");
		
	}
	
}
class DatabasePersistance extends Persistance{

	@Override
	void persist() {
		System.out.println("Data saved in Database");
		
	}
	
}


