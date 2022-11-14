package com.warehouse.v3.services;

import com.warehouse.v3.models.User;
import com.warehouse.v3.repositories.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    UserDetailsRepository userDetailsRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userDetailsRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("Username  " + username + " not found");
        }
        return user;
    }
}

