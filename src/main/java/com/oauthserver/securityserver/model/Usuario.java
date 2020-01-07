package com.oauthserver.securityserver.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import java.time.ZonedDateTime;
import java.util.Collection;

@Getter
@Setter
@Entity
@Table(name = "usuario")
public class Usuario extends EntidadeBase {

    @NotNull
    private String login;

    @NotNull
    private String senha;

    @NotNull
    @Column(name = "activation_key")
    private String activationKey;

    @Column(name = "data_hora_activation_key")
    private ZonedDateTime dataHoraActivationKey;

    @Column(name = "reset_key")
    private String resetKey;

    @Column(name = "data_hora_reset_key")
    private ZonedDateTime dataHoraResetKey;

    @Transient
    private Collection<? extends GrantedAuthority> permissoes;

    public Collection<? extends GrantedAuthority> getPermissoes() {
        return permissoes;
    }

    public void setPermissoes(Collection<? extends GrantedAuthority> permissoes) {
        this.permissoes = permissoes;
    }
}
