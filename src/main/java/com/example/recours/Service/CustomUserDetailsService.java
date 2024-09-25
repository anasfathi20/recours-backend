package com.example.recours.Service;

import com.example.recours.Entity.CustomUserDetails;
import com.example.recours.Entity.Customer;
import com.example.recours.Repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomUserDetailsService implements UserDetailsService {

        @Autowired
        private CustomerRepo userRepository;

        @Override
        public CustomUserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
            Optional<Customer> user = userRepository.findByIdentifiant(username);
            if( user.isPresent())
            return new CustomUserDetails(user.get());
            return null;
        }
}
