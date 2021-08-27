import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Question_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      var path="C:\\StudentList.txt";
      try {
		String data=Files.readString(Path.of(path));
		//System.out.println(data);
		data.strip();
		System.out.println(data.trim());
		
		List<String> list=data.lines().collect(Collectors.toList());
		//System.out.println(list);
		list.removeIf(s->list.contains(" "));
		list.remove("");
		list.remove("");
		System.out.println(list);
		
		
		
	
		
		
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      
      
	}

}
