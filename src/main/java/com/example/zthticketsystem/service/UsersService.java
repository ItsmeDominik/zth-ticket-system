package com.example.zthticketsystem.service;

import com.example.zthticketsystem.model.UsersModel;
import com.example.zthticketsystem.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UsersService implements org.springframework.security.core.userdetails.UserDetailsService {

    private final UsersRepository repository;

    public UsersService(UsersRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        UsersModel user = repository.findByUsername(email);
        if (user == null) {
            throw new UsernameNotFoundException(email);
        }

        return user;

    }

}