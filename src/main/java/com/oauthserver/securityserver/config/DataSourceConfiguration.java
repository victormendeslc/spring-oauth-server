package com.oauthserver.securityserver.config;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Slf4j
@Configuration
public class DataSourceConfiguration {

    public DataSourceConfiguration() {
        log.info("Created");
    }

    public DataSource datasource() {
        return DataSourceBuilder.create()
                .driverClassName("com.mysql.cj.jdbc.Driver")
                .url("jdbc:mysql://localhost:3306/myDb")
                .username("user1")
                .password("pass")
                .build();
    }
}
