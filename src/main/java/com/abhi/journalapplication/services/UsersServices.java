package com.abhi.journalapplication.services;

import com.abhi.journalapplication.entity.Users;
import com.abhi.journalapplication.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UsersServices {
    @Autowired
    private UsersRepository usersRepository;

    public void createUser(Users newUser){
        usersRepository.save(newUser);
    }

    public void updateJournalEntries(Users userWithEntry){
        usersRepository.save(userWithEntry);
    }
}
