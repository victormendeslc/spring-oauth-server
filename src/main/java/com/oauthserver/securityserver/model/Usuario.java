package com.oauthserver.securityserver.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "usuario")
public class Usuario extends EntidadeBase implements UserDetails {


    private String login;
    private String senha;

    @Transient
    private String password;

    @Transient
    private String username;

    @Transient
    private Set<GrantedAuthority> authorities;

    @Transient
    private boolean accountNonExpired;

    @Transient
    private boolean accountNonLocked;

    @Transient
    private boolean credentialsNonExpired;

    @Transient
    private boolean enabled;

}
