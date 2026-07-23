package com.condo.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api/teste")
    public String teste() {
        return "Bem-vindo ao backend do CONDO&CONDO!";
    }

}