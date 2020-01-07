package com.oauthserver.securityserver.service.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Facade {

    @Autowired
    public Service service;

    @Autowired
    public Repository repository;

}
