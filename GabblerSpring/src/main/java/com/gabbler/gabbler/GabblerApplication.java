package com.gabbler.gabbler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GabblerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GabblerApplication.class, args);
        System.out.println("salut les potes");
    }

}
