package com.oauthserver.securityserver.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
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

    private String uuidUsuarioCadastro;
    private ZonedDateTime dataHoraCadastro;

    private String uuidUsuarioAlteracao;
    private ZonedDateTime dataHoraAlteracao;

}
