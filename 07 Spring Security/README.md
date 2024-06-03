# Spring Security for Java Spring Core

## Introduction to Spring Security

Spring Security is a powerful framework that provides authentication, authorization, and protection against common security vulnerabilities for Java applications. It helps developers implement robust security measures without reinventing the wheel, making the application more resilient to threats.

## Securing Your Application with Spring Security

### Authentication

Authentication is the process of verifying the identity of a user, typically by validating their credentials (e.g., username and password). Spring Security offers various authentication mechanisms, including form-based authentication, HTTP Basic authentication, and more. You can easily configure authentication providers and user details services to customize how user credentials are verified.

### Authorization

Authorization controls what actions a user can perform within the application after being authenticated. Spring Security provides a flexible and fine-grained authorization mechanism. You can define access control rules based on roles, permissions, and expressions. This ensures that only authorized users can access specific resources and perform certain actions.

## Example Project: Securing a Spring Application with Spring Security

### 1. Set Up the Spring Project

Create a new Maven or Gradle project and add the required Spring Security dependencies to your `pom.xml` (for Maven) or `build.gradle` (for Gradle).

### 2. Implement Spring Security Configuration

Create a configuration class that extends `WebSecurityConfigurerAdapter`. Override its methods to define authentication and authorization rules. For instance:

```java
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
                .antMatchers("/public/**").permitAll()
                .anyRequest().authenticated()
                .and()
            .formLogin()
                .loginPage("/login")
                .permitAll()
                .and()
            .logout()
                .permitAll();
    }
}
```

In this example, requests to `/public/**` are allowed without authentication, while other requests require authentication. A custom login page and logout handling are also configured.

### 3. Create UserDetailsService

Implement a custom `UserDetailsService` to provide user details to Spring Security. This service retrieves user information from a database or other data sources:

```java
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) {
        // Fetch user details from database or other source
        return User.builder()
            .username("user")
            .password("{noop}password") // Use {noop} for plain text passwords (not recommended for production)
            .roles("USER")
            .build();
    }
}
```

### 4. Create Controller and Views

Create a controller to handle login and secure pages. Develop corresponding views for login and secured content.

### 5. Run the Application

Run your Spring application. Accessing secure pages will redirect you to the login page, and after successful authentication, you'll be able to access the secured content.

## Conclusion

Spring Security simplifies the implementation of authentication and authorization in your Java Spring Core application. By configuring security rules, customizing authentication providers, and defining access control, you can protect your application's sensitive resources and ensure that only authorized users can interact with them.

For more advanced configurations and features, refer to the official [Spring Security documentation](https://docs.spring.io/spring-security/site/docs/current/reference/html5/).