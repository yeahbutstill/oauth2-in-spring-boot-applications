package com.yeahbutstilldev.userswebservice.response;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class UserRest {

    private String firstName;
    private String lastName;
    private String email;
    private String userName;
    private String userId;

}
