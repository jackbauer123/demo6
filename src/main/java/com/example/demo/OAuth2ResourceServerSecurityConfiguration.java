package com.example.demo;


//@Configuration
//@EnableWebSecurity
public class OAuth2ResourceServerSecurityConfiguration {


    /*@Value("${spring.security.oauth2.resourceserver.jwt.jwk-set-uri}")
    String jwkSetUri;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        // @formatter:off
        http
                .authorizeHttpRequests((authorize) -> authorize
                       *//* .requestMatchers(HttpMethod.GET, "/message/**").hasAuthority("SCOPE_message:read")
                        .requestMatchers(HttpMethod.POST, "/message/**").hasAuthority("SCOPE_message:write")*//*
                        .anyRequest()
                                .permitAll()
                        //.authenticated()
                )
                .oauth2ResourceServer(OAuth2ResourceServerConfigurer::jwt);
        // @formatter:on
        return http.build();
    }

    @Bean
    JwtDecoder jwtDecoder() {
        return NimbusJwtDecoder.withJwkSetUri(this.jwkSetUri).build();
    }*/

}
