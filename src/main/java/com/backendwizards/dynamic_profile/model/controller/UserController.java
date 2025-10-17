package com.backendwizards.dynamic_profile.model.controller;

import com.backendwizards.dynamic_profile.model.ProfileResponse;
import com.backendwizards.dynamic_profile.model.User;
import com.backendwizards.dynamic_profile.service.CatFactService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.time.format.DateTimeFormatter;

@RestController
public class UserController {
    @Value("${profile.name}")
    private String userName;

    @Value("${profile.email}")
    private String userEmail;

    @Value("${profile.stack}")
    private String userStack;

    private final CatFactService catFactService;

    public UserController(CatFactService catFactService) {
        this.catFactService = catFactService;
    }
    @GetMapping("/me")
    public ProfileResponse getProfile(){
        String fact = catFactService.getRandomCatFact();

        String timestamp = DateTimeFormatter.ISO_INSTANT.format(Instant.now());

        User user = new User(userName,userEmail,userStack);
        return  new ProfileResponse(
                "success",
                user,
                timestamp,
                fact
        );
    }
}
