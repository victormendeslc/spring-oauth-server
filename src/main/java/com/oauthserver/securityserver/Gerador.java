package com.oauthserver.securityserver;

import org.springframework.security.crypto.factory.PasswordEncoderFactories;

import java.util.UUID;

class Gerador {
    public static void main(String... args) {
        System.out.println(UUID.randomUUID().toString());
        System.out.println("SENHA" + PasswordEncoderFactories.createDelegatingPasswordEncoder().encode("admin"));

        System.out.println("TESTE " + PasswordEncoderFactories.createDelegatingPasswordEncoder().encode("secret"));
    }


}