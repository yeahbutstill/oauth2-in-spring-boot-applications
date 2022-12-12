package com.yeahbutstilldev.ws.api.resourceserver.response;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class UserRest {

    private String userFirstName;
    private String userLastName;
    private String userId;

}
