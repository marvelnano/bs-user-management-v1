package com.example.bs_user_management_v1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MiControlador {

    @GetMapping("/saludo")
    public String saludo() {
        return "Hola, mundo!!";
    }
}