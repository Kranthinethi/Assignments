package Projects.PropertyResource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
@Configuration
@PropertySource("classpath:dbconfig.properties")
public class ConfigFile {

	/*
	 * driverClassName=com.mysql.jdbc.Driver url=https://locolhost:8080
	 * username=root password=password
	 */
	
	@Value("${url}")
	private String dbUrl;
	@Value("${user}")
	private String username;
	@Value("${password}")
	private String password;
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertysources(){
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	
	@Bean
	public DataSource dataSource() {
		return new DataSource(dbUrl,username,password);
	}
	
}
