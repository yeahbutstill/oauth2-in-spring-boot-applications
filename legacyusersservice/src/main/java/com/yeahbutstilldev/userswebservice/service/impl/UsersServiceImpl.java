package com.yeahbutstilldev.userswebservice.service.impl;

import com.yeahbutstilldev.userswebservice.data.UserEntity;
import com.yeahbutstilldev.userswebservice.data.UsersRepository;
import com.yeahbutstilldev.userswebservice.response.UserRest;
import com.yeahbutstilldev.userswebservice.service.UsersService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    
    @Override
    public UserRest getUserDetails(String userName) {
        UserRest returnValue = new UserRest();

        UserEntity userEntity = usersRepository.findByEmail(userName);
        if (userEntity == null) {
            return returnValue;
        }

        BeanUtils.copyProperties(userEntity, returnValue);

        return returnValue;
    }

    @Override
    public UserRest getUserDetails(String userName, String password) {

        UserRest returnValue = null;

        UserEntity userEntity = usersRepository.findByEmail(userName);

        if (userEntity == null) {
            return null;
        }

        if (bCryptPasswordEncoder.matches(password,
                userEntity.getEncryptedPassword())) {
            log.info("password matches!!!");

            returnValue = new UserRest();
            BeanUtils.copyProperties(userEntity, returnValue);

        }

        return returnValue;
    }

}
