package com.backendwizards.dynamic_profile.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private String name;
    private String email;
    private String stack;
}
