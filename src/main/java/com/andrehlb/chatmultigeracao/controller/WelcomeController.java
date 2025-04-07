package com.andrehlb.chatmultigeracao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/welcome")
    public String welcome() {
        return "👋 Bem-vindo à API MultiGeração!";
    }
}
