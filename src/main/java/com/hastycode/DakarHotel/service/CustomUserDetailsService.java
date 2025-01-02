package com.hastycode.DakarHotel.service;

import com.hastycode.DakarHotel.exception.OurException;
import com.hastycode.DakarHotel.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) {
        return userRepository.findByEmail(userName).orElseThrow(() -> new OurException("Username/Email not found"));
    }
}
