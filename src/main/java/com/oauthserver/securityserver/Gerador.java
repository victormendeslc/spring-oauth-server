package com.oauthserver.securityserver;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.UUID;

class Gerador {
    public static void main(String... args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        System.out.println(UUID.randomUUID().toString());
        String admin = encoder.encode("admin");
        //     String admin = encoder.encode("mendes");
        System.out.println(admin);
    }


}