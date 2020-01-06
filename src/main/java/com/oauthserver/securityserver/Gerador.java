package com.oauthserver.securityserver;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

class Gerador {
    public static void main(String... args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String admin = encoder.encode("admin");
        //     String admin = encoder.encode("mendes");
        System.out.println(admin);
    }

}