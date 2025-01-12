package com.abhi.journalapplication.controller;

import com.abhi.journalapplication.entity.JournalEntries;
import com.abhi.journalapplication.services.JournalEntryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {


    @Autowired
    private JournalEntryServices journalEntryServices;

    @PostMapping
    public boolean CreatJournalEntry (@RequestBody JournalEntries newEntry){
        return journalEntryServices.createJournalEntry(newEntry);
    }
}
