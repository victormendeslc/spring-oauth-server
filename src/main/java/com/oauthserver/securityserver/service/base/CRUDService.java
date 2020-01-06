package com.oauthserver.securityserver.service.base;

import com.oauthserver.securityserver.model.EntidadeBase;

public interface CRUDService<D, E extends EntidadeBase> extends SaveService<D, E>, ReadService<D, E>, UpdateService<D, E>, DeleteService<D, E> {
}
