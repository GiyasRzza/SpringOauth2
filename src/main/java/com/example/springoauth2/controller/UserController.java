package com.example.springoauth2.controller;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserController {

    @GetMapping("/")
    public Map<String,Object> currentUser(OAuth2AuthenticationToken token){
        System.out.println(token.getPrincipal().getAttributes());
        return token.getPrincipal().getAttributes();
    }


}
