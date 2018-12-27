package com.oauthjwt.api.service;

import com.oauthjwt.api.domain.dto.CustomUserDetail;
import com.oauthjwt.api.domain.entity.AuthUser;
import com.oauthjwt.api.repository.AuthUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private AuthUserRepository authUserRepository;

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        List<AuthUser> users = authUserRepository.findByUsername(name);
        if(users.isEmpty()) {
            throw new UsernameNotFoundException("Could not find the user " + name);
        }

        AuthUser user = users.get(0);

        return new CustomUserDetail(user, Arrays.asList(new String[]{"admin"}));
    }
}