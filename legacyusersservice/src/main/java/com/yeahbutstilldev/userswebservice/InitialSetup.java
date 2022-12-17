package com.yeahbutstilldev.userswebservice;

import com.yeahbutstilldev.userswebservice.data.UserEntity;
import com.yeahbutstilldev.userswebservice.data.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
public class InitialSetup {

    @Autowired
    UsersRepository usersRepository;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @EventListener
    @Transactional
    public void onApplicationEvent(ApplicationReadyEvent event) {

        UserEntity user = new UserEntity(
                1L,
                "qswe3mg84mfjtu",
                "Dani",
                "Setiawan",
                "test2@test.com",
                bCryptPasswordEncoder.encode("dani"),
                "",
                false);

        usersRepository.save(user);

    }

}
