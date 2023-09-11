package com.programming.techie.discoveryserver.config;

/*@Configuration
@EnableWebSecurity*/
public class SecurityConfig {

  /*  @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.csrf().ignoringRequestMatchers("/eureka/**");
        return httpSecurity.build();
    }*/

    /*@Bean
    public UserDetailsService userDetailsService(PasswordEncoder passwordEncoder) {
        UserDetails admin = User.withUsername("Himalaya")
                .password(passwordEncoder.encode("password"))
                .roles("ADMIN")
                .build();
        UserDetails user = User.withUsername("John")
                .password(passwordEncoder.encode("password1"))
                .roles("USER")
                .build();
        return new InMemoryUserDetailsManager(admin, user);
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {

        return httpSecurity.csrf().disable()
                .authorizeRequests()
                .requestMatchers("/eureka/**").permitAll()
                .and()
                .authorizeRequests().anyRequest()
                .authenticated()
                .and().build();

    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }*/
}