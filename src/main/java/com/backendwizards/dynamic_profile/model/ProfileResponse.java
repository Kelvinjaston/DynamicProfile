package com.backendwizards.dynamic_profile.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class ProfileResponse {
    private String status;
    private User user;
    private String timestamp;
    private String fact;
}
