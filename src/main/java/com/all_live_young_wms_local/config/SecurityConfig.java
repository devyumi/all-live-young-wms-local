package com.all_live_young_wms_local.config;

import com.all_live_young_wms_local.config.filter.LoginFail;
import com.all_live_young_wms_local.config.filter.LoginSuccess;
import com.all_live_young_wms_local.config.filter.LogoutSuccess;
import com.all_live_young_wms_local.service.UserDetailsServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.stereotype.Component;

@EnableWebSecurity
@RequiredArgsConstructor
@Component
public class SecurityConfig {
    private final UserDetailsServiceImpl userDetailsService;
    private final LoginSuccess loginSuccess;
    private final LoginFail loginFail;
    private final LogoutSuccess logoutSuccess;
    private final String[] all = {"/", "/find-account", "/reset-password","/members/**", "/inbound-requests/**", "/outbound-requests/**", "/stocks/**", "/warehouses/**", "/expenses", "/sales/**", "/announcements/**", "/inquirys/**"};
    //총 관리자, 매니저, 회사

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(requestMatcher -> requestMatcher
                        .requestMatchers("/expenses/save", "/expenses/*/update").hasRole("MANAGER")
                        .requestMatchers(all).authenticated()
                        .requestMatchers("/join").permitAll()
                        .anyRequest().authenticated())

                .formLogin(login -> login
                        .loginPage("/login")
                        .loginProcessingUrl("/login")
                        .defaultSuccessUrl("/")
                        .successHandler(loginSuccess)
                        .failureHandler(loginFail)
                        .permitAll())

                .logout(logout -> logout
                        .logoutUrl("/logout")
                        .logoutSuccessUrl("/")
                        .logoutSuccessHandler(logoutSuccess)
                        .deleteCookies("JSESSIONID"))

                .userDetailsService(userDetailsService);
        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }
}
