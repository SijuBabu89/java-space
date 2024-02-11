package com.buddywindow.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.buddywindow.filter.JWTAuthTokenFilter;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {
    @Autowired
    private JWTAuthTokenFilter authFilter;

    @Bean
    public UserDetailsService userDetailsService() {
        return new UserInfoUserDetailsService();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        return http.csrf().disable()
//                .authorizeHttpRequests()
//                .requestMatchers("/buddywindow/login").permitAll()
//                .and()
//                .authorizeHttpRequests().requestMatchers("/buddywindow/**")
//                .authenticated().and()
//                .sessionManagement()
//                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//                .and()
//                .authenticationProvider(authenticationProvider())
//                .addFilterBefore(authFilter, UsernamePasswordAuthenticationFilter.class)
//                .build();
		return http.csrf(csrf -> csrf.disable()).authorizeHttpRequests(auth -> {
			auth.requestMatchers("/buddywindow/login").permitAll().requestMatchers("/buddywindow/**").authenticated();
		}).sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
				.authenticationProvider(authenticationProvider())
				.addFilterBefore(authFilter, UsernamePasswordAuthenticationFilter.class).build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationProvider authenticationProvider(){
        DaoAuthenticationProvider authenticationProvider=new DaoAuthenticationProvider();
        authenticationProvider.setUserDetailsService(userDetailsService());
        authenticationProvider.setPasswordEncoder(passwordEncoder());
        return authenticationProvider;
    }
    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception {
        return config.getAuthenticationManager();
    }
    
   /** The incoming request will be handled by DelegatingFilterProxy, 
    and converts the request to authentication object.
    Since filter doesn't have any logic to authenticate the request, it pass the request to
    Authentication Manager.
    Authentication manager also doesn't know how to authenticate the request, so it passes the request 
    to authentication provider.  
    Spring has multiple authentication provider, and authentication manager cannot directly communicate
    with the authentication provider.
    So to talk with authentication provider, authentication manager passes the request to provider manager
    and the provider manager passes the request to appropriate authentication provider 
    by checking each authentication providers.
    Here the Authentication Manager passes the authentication object to "DaoAuthenticationProvider" and that also
    have the "setUserDetailsService" implementation. Using that implementation it fetches the
    users details from the corresponding implementation.
    Once the validation is done the authentication provider pass the valid user to authentication manager
    and authentication manager passes the user details to filter "JWTAuthTokenFilter". And finally the filter set the authentication user in
    SecurityContextHolder.getContext().setAuthentication(authToken);
    **/
    
    /** Refresh Token, Access Token, User Session
     -Access Token -> When ever user login into our platform we generate a access token which gives the user
     access to use our application. Below are the entities added as part of Access Token.
     	-Subject
     	-Claims
     	-Expire Time [Here the expiry time will be less]
     	-Access Token UUID
     	-Other user related details.
     	- We dont compare password check instead we store user name in token as subject and we store user profile object
     	with user basic details in access token. So when we validate the token we take the user from database using username in subject and
     	compare that user details with user stored in the profile object.
     	Also we match with uuid in token and user session
     
     -Refresh Token -> When an access token is generated we generate a refresh token as well. It also contain below entities
     	-Basic user details
     	-Refresh token uuid
     	-Expiry Time [Here the expiry time is greater than that of access token]
     
     -User Session -> In user session we store the UUID of all tokens. So when we generate new token using refresh token we compare the UUI of user session and refresh token.
     if both are different we wont allow it else we allow it.
     
     -User logout -> When we logout the user we delete the session. so afterward without login use can login using the old tokens.
     
     * 
     * 
     * 
     */

}
