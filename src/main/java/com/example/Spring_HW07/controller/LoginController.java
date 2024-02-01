package com.example.Spring_HW07.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    /*
    * Возвращает имя представления (шаблона HTML) для страницы входа
     */
    @GetMapping("/login")
    public String loginPage() {
        return "login.html";
    }

    @GetMapping("/private-data")
    public String privateData() {
        return "private.html";
    }

    @GetMapping("/public-data")
    public String publicData() {
        return "public.html";
    }
}
