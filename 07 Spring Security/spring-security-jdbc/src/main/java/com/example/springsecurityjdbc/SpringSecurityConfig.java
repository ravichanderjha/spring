package com.example.springsecurityjdbc;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private DataSource dataSource;

	@Autowired
	private DataSource dss;


	/* Spring Security Configurations Start */
	@Autowired
	public void configureAMBuilder(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication().dataSource(dss)
				// to provide role of user
				.authoritiesByUsernameQuery("select email, role FROM USERS where email=?")
				// to provide credentials of user
				.usersByUsernameQuery("select email,password, 1 FROM USERS where email=?").passwordEncoder(NoOpPasswordEncoder.getInstance());
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		 http .httpBasic() .and() .authorizeRequests() .anyRequest().authenticated();
		 http.csrf().disable();
		 
	}
	/* Spring Security Configurations End */
}

/*
 * 
 * CREATE TABLE Users ( id int, userName varchar(500), email varchar(500),
  userPassword varchar(255), role varchar(10), created datetime );
 * 
 * insert into users (id, userName, email, userPassword, role, created)
 values(1,'username1', 'abc@xyz.com', 'pwd1','ADMIN', now());
 insert into users (id, userName, email, userPassword, role, created)
 values(2,'username2', 'qrs@xyz.com', 'pwd2','USER', now());
 * 
 */