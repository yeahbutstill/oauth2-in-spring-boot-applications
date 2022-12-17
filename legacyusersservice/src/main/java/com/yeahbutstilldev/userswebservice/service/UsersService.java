package com.yeahbutstilldev.userswebservice.service;

import com.yeahbutstilldev.userswebservice.response.UserRest;

public interface UsersService {

   UserRest getUserDetails(String userName, String password);
   UserRest getUserDetails(String userName);

}
