package com.yeahbutstilldev.keycloak;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class User {

    private String firstName;
    private String lastName;
    private String email;
    private String userName;
    private String userId;
    
    
}
