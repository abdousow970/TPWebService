package com.example.webservice1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UtilisateurController {
    @GetMapping("/")
    public String sayHello(){
        return "Hello !";
    }
}
