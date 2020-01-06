package com.oauthserver.securityserver.web.dto;

import java.time.ZonedDateTime;

public abstract class DTOBase {

    private Long id;

    private String uuid;
    private Boolean excluido;

    private String uuidUsuarioCadastro;
    private ZonedDateTime dataHoraCadastro;

    private String uuidUsuarioAlteracao;
    private ZonedDateTime dataHoraAlteracao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Boolean getExcluido() {
        return excluido;
    }

    public void setExcluido(Boolean excluido) {
        this.excluido = excluido;
    }

    public String getUuidUsuarioCadastro() {
        return uuidUsuarioCadastro;
    }

    public void setUuidUsuarioCadastro(String uuidUsuarioCadastro) {
        this.uuidUsuarioCadastro = uuidUsuarioCadastro;
    }

    public ZonedDateTime getDataHoraCadastro() {
        return dataHoraCadastro;
    }

    public void setDataHoraCadastro(ZonedDateTime dataHoraCadastro) {
        this.dataHoraCadastro = dataHoraCadastro;
    }

    public String getUuidUsuarioAlteracao() {
        return uuidUsuarioAlteracao;
    }

    public void setUuidUsuarioAlteracao(String uuidUsuarioAlteracao) {
        this.uuidUsuarioAlteracao = uuidUsuarioAlteracao;
    }

    public ZonedDateTime getDataHoraAlteracao() {
        return dataHoraAlteracao;
    }

    public void setDataHoraAlteracao(ZonedDateTime dataHoraAlteracao) {
        this.dataHoraAlteracao = dataHoraAlteracao;
    }
}
