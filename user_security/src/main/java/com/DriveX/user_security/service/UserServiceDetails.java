package com.DriveX.user_security.service;


import com.DriveX.user_security.dao.api.UserRepository;
import com.DriveX.user_security.dao.entity.Role;
import com.DriveX.user_security.dao.entity.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.stream.Collectors;

@Service
public class UserServiceDetails implements UserDetailsService {
    private UserRepository repository;

    public UserServiceDetails(UserRepository repository) {
        this.repository = repository;
    }

    public User findByMail(String mail){
        return repository.findByMail(mail);
    }
    public User findByUsername(String username){
        return repository.findByUsername(username);
    }

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = findByUsername(username);
        if(user == null){
            throw new UsernameNotFoundException(String.format("User '%s' not found",username));
        }

        return new org.springframework.security.core.userdetails
                .User(user.getUsername(),user.getPassword(),mapRolesAuthority(user.getAuthorities()));
    }

    private Collection<? extends GrantedAuthority> mapRolesAuthority(Collection<Role> roles){
        return roles.stream().map(r -> new SimpleGrantedAuthority(r.getAuthority())).collect(Collectors.toList());


    }
}
