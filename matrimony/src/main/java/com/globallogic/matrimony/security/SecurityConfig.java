package com.globallogic.matrimony.security;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	String userName;
	String userPassword;
	String adminName;
	String adminPassword;

	public SecurityConfig(@Value("${user.login.name}") String userName,
			@Value("${user.login.password}") String userPassword,
			@Value("${admin.login.name}") String adminName,
			@Value("${admin.login.password}") String adminPassword) {

		this.userName = userName;
		this.userPassword = userPassword;
		this.adminName = adminName;
		this.adminPassword = adminPassword;

	}

	@SuppressWarnings("deprecation")
	@Override
	protected void configure(AuthenticationManagerBuilder auth)
			throws Exception {
		auth.inMemoryAuthentication()
				.passwordEncoder(
						org.springframework.security.crypto.password.NoOpPasswordEncoder
								.getInstance()).withUser(userName)
				.password(userPassword).roles(ROLES.USER.toString()).and()
				.withUser(adminName).password(adminPassword)
				.roles(ROLES.ADMIN.toString());
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.httpBasic().and().authorizeRequests().antMatchers("/login/**")
				.hasRole(ROLES.USER.toString()).antMatchers("/admin/**")
				.hasRole(ROLES.ADMIN.toString()).and().csrf().disable()
				.headers().frameOptions().disable();
	}

	public enum ROLES {
		USER, ADMIN
	}
}
