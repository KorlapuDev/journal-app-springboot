package com.abhi.journalapplication.services;

import com.abhi.journalapplication.entity.JournalEntries;
import com.abhi.journalapplication.entity.Users;
import com.abhi.journalapplication.repository.JournalEntryRepository;
import com.abhi.journalapplication.repository.UsersRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JournalEntryServices {

    @Autowired
    private JournalEntryRepository journalEntryRepository;

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private UsersServices usersServices;


    public boolean createJournalEntry(JournalEntries newEntry, String userName){
        Users user = usersRepository.findByUserName(userName);
        JournalEntries savedEntry = journalEntryRepository.save(newEntry);
        user.getJournalEntries().add(savedEntry);
        usersServices.updateJournalEntries(user);
        return true;
    }
}
