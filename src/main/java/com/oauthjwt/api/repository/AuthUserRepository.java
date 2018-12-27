package com.oauthjwt.api.repository;

import com.oauthjwt.api.domain.entity.AuthUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthUserRepository extends JpaRepository<AuthUser, Long> {
    List<AuthUser> findByUsername (String username);
}