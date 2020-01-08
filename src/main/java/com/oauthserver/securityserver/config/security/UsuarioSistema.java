package com.oauthserver.securityserver.config.security;

import com.oauthserver.securityserver.model.Usuario;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

@Getter
@Setter
public class UsuarioSistema extends User {

    private String uuid;

    public UsuarioSistema(String username, String password, boolean enabled,
                          boolean accountNonExpired, boolean credentialsNonExpired,
                          boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities) {

        super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
    }

    public UsuarioSistema(Usuario usuario, Collection<? extends GrantedAuthority> permissoes) {
        this(usuario.getLogin(), usuario.getSenha(), !usuario.getExcluido(), true, true, true, permissoes);
        this.uuid = usuario.getUuid();
    }
}
