package com.oauthserver.securityserver.service.base;

import com.oauthserver.securityserver.model.EntidadeBase;

import javax.transaction.Transactional;
import javax.validation.ValidationException;
import java.util.Objects;

public interface UpdateService<D, E extends EntidadeBase> extends ServiceBase<D, E> {

    D updateDTO(D entity);

    E updateEntity(E entity);

    @Transactional(rollbackOn = Exception.class)
    default E update(E entity) {
        if (Objects.isNull(entity.getUuid())) {
            throw new ValidationException("UUID is required");
        }
        modify(entity);
        return getRepository().save(entity);
    }
}
