package com.abhi.journalapplication.services;

import com.abhi.journalapplication.entity.JournalEntries;
import com.abhi.journalapplication.repository.JournalEntryRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JournalEntryServices {

    @Autowired
    private JournalEntryRepository journalEntryRepository;

    public boolean createJournalEntry(JournalEntries newEntry){
        journalEntryRepository.save(newEntry);
        return true;
    }
}
