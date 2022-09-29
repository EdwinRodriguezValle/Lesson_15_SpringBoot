package com.example.Assignmet_les_15.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/user")
    public String userSection(){

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth.getPrincipal() instanceof UserDetails) {
            return "Hello " + ((UserDetails) auth.getPrincipal()).getUsername();
        }

        return " This is user section";

    }
    @GetMapping("/Admin")
    public String adminSection(){
        return " This is the admin section ...";
    }
}
