package com.carlos.springboot.backend.apirest.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface IUserDetailsService {

    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;

}
