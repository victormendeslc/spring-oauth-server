package com.oauthserver.securityserver.service.base;

import com.oauthserver.securityserver.model.EntidadeBase;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ReadService<D, E extends EntidadeBase> extends ServiceBase<D, E> {

    Page<D> getListDTO(Pageable page);

    default Page<E> getList(Pageable page) {
        return getRepository().findAll(page);
    }
}
