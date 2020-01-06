package com.oauthserver.securityserver.service.base;

import com.oauthserver.securityserver.model.EntidadeBase;

import javax.transaction.Transactional;
import java.util.List;

public interface SaveService<D, E extends EntidadeBase> extends ServiceBase<D, E> {

    D saveDTO(D dto);

    E saveEntity(E entity);

    @Transactional(rollbackOn = Exception.class)
    default E save(E entity) {
        modify(entity);
        return getRepository().save(entity);
    }

    default List<E> saveOrUpdateAll(List<E> entities) {
        entities.forEach(this::modify);
        return getRepository().saveAll(entities);
    }
}
