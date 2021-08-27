package Projects.PropertyResource;

public class DataSource {
   String url;
   String username;
   String password;
public DataSource(String url, String username, String password) {
	
	this.url = url;
	this.username = username;
	this.password = password;
}


void display() {
	System.out.println(url);
	System.out.println(username);
	System.out.println(password);
}
}
