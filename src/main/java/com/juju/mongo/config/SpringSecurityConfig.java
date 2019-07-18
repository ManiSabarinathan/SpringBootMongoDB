package com.juju.mongo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
/*import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;*/

/*@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter   {

	@Override
	protected void configure(AuthenticationManagerBuilder authenticationManagerBuilder) {
		try {
			authenticationManagerBuilder.inMemoryAuthentication()
			 .withUser("user").password("{noop}password").roles("USER")
			 .and()
			 .withUser("admin").password("{noop}password").roles("USER", "ADMIN"); 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	@Override
    protected void configure(HttpSecurity http) throws Exception {

        http
                //HTTP Basic authentication
                .httpBasic()
                .and()
                .authorizeRequests()
                .antMatchers("/","/index").permitAll() // Permit the "/"
                .anyRequest().authenticated() // All other urls must be authenticated
                .and()
                .formLogin()
                .loginPage("/mylogin.html")
                .and()
                .logout().permitAll();
    }

	
	 * {
    "timestamp": "2019-07-13T23:04:39.272+0000",
    "status": 403,
    "error": "Forbidden",
    "message": "Forbidden",
    "path": "/adduser/"
}
	 

}
*/