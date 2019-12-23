package guru.springframework.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

import guru.springframework.examplebeans.FakeDatasource;
import guru.springframework.examplebeans.FakeJmsBroker;

@Configuration
//@PropertySource({"classpath:datasource.properties","classpath:jms.properties"})
public class PropertyConfig {
	@Autowired
	Environment env;
	@Value("${guru.username}")
	String user;
	@Value("${guru.password}")
	String password;
	@Value("${guru.dburl}")
	String url;
	
	
	@Value("${guru.jms.username}")
	String jmsUser;
	@Value("${guru.jms.password}")
	String jmsPassword;
	@Value("${guru.jms.url}")
	String jmsUrl;
	
	
	@Bean
	public FakeDatasource fakeDatasource() {
		FakeDatasource fakeDatasource = new FakeDatasource();
		fakeDatasource.setUser(user);
		fakeDatasource.setPassword(password);
		fakeDatasource.setUrl(url);
		
		return fakeDatasource;
		
	}
	
	@Bean
	public FakeJmsBroker fakeJmsBroker() {
		FakeJmsBroker fakeDatasource = new FakeJmsBroker();
		fakeDatasource.setUser(jmsUser);
		fakeDatasource.setPassword(jmsPassword);
		fakeDatasource.setUrl(jmsUrl);
		
		return fakeDatasource;
		
	}
	
//	@Bean
//	public static PropertySourcesPlaceholderConfigurer properties() {		
//		PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new  PropertySourcesPlaceholderConfigurer();
//		return propertySourcesPlaceholderConfigurer;
//		
//	}

}
