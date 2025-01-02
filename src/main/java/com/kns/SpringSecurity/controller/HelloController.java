package com.kns.SpringSecurity.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
   /* public String message() {
        return "Sreerama Rama Rama";
    }**/
    public String message(HttpServletRequest request) {
        return "Sreerama Rama Rama " + request.getSession().getId();
    }
}

