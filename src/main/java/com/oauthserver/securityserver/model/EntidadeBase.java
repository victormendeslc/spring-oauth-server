package com.oauthserver.securityserver.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.ZonedDateTime;

@Getter
@Setter
@MappedSuperclass
public abstract class EntidadeBase implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String uuid;

    @NotNull
    private Boolean excluido;

    @NotNull
    @Column(name = "uuid_usuario_cadastro")
    private String uuidUsuarioCadastro;

    @NotNull
    @Column(name = "data_hora_cadastro")
    private ZonedDateTime dataHoraCadastro;

    @Column(name = "uuid_usuario_alteracao")
    private String uuidUsuarioAlteracao;

    @Column(name = "data_hora_alteracao")
    private ZonedDateTime dataHoraAlteracao;

}
