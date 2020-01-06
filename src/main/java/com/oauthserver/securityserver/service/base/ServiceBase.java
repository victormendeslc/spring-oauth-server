package com.oauthserver.securityserver.service.base;

import com.oauthserver.securityserver.model.EntidadeBase;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.ZonedDateTime;
import java.util.Objects;
import java.util.UUID;

public interface ServiceBase<D, E extends EntidadeBase> {

    JpaRepository<E, Long> getRepository();

    default void modify(E entity) {
        if (Objects.isNull(entity.getUuid())) {
            entity.setUuid(UUID.randomUUID().toString());
            entity.setDataHoraCadastro(ZonedDateTime.now());
            entity.setExcluido(false);
            entity.setUuidUsuarioCadastro("1");
        } else {
            entity.setDataHoraAlteracao(ZonedDateTime.now());
        }
    }
}
