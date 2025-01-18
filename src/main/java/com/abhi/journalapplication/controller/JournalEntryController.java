package com.abhi.journalapplication.controller;

import com.abhi.journalapplication.entity.JournalEntries;
import com.abhi.journalapplication.services.JournalEntryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {


    @Autowired
    private JournalEntryServices journalEntryServices;

    @PostMapping("{userName}")
    public boolean CreatJournalEntry (@RequestBody JournalEntries newEntry, @PathVariable String userName){
        return journalEntryServices.createJournalEntry(newEntry, userName);
    }


}
