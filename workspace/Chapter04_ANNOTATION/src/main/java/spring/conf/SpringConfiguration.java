package spring.conf;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.apache.commons.dbcp2.BasicDataSource;


@Component
@Configuration
@EnableAspectJAutoProxy
public class SpringConfiguration{

	@Bean(name="dataSource")
	public DataSource getDataSource() {
		BasicDataSource dataSource = new BasicDataSource();

		 dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		 dataSource.setUrl("jdbc:mysql://localhost:3306/mydb?serverTimezone=Asia/Seoul");
		 dataSource.setUsername("root");
		 dataSource.setPassword("1234");
		 return dataSource;	
	}
	
	
	
}
