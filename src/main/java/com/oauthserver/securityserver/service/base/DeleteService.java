package com.oauthserver.securityserver.service.base;

import com.oauthserver.securityserver.model.EntidadeBase;

public interface DeleteService<D, E extends EntidadeBase> extends ServiceBase<D, E> {

    default void delete(E entity) {
        modify(entity);
        entity.setExcluido(true);
        //update(entity);
    }

    void deleteByUuid(String uuid);
}
