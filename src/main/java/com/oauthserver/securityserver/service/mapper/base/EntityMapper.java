package com.oauthserver.securityserver.service.mapper.base;

import org.mapstruct.MapperConfig;

import java.util.List;
import java.util.Set;

@MapperConfig(componentModel = "spring")
public interface EntityMapper<D, E> {

    D toDTO(E entity);

    List<D> toDTOList(List<E> entity);

    Set<D> toDTOSet(Set<E> entity);

    E toEntity(D dto);

    List<E> toEntityList(List<D> dto);

    Set<E> toEntitySet(Set<D> dto);
}
