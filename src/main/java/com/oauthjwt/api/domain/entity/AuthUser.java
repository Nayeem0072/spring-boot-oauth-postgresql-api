package com.oauthjwt.api.domain.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;


@Getter
@Setter
@Entity
@Table(name ="AUTH_USER" )
public class AuthUser {
    @Id
    @SequenceGenerator(name="pk_seq_user",sequenceName="auth_user_user_id_seq",allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="pk_seq_user")
    @Column(name = "USER_ID")
    private Long userId;

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "PASSWORD")
    private String password;
}