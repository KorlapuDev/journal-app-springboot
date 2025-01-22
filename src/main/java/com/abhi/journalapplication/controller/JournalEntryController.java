package com.abhi.journalapplication.controller;

import com.abhi.journalapplication.entity.JournalEntries;
import com.abhi.journalapplication.services.JournalEntryServices;
import com.abhi.journalapplication.util.helper.ResBuild;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/journal")
public class JournalEntryController {


    @Autowired
    private JournalEntryServices journalEntryServices;

    @PostMapping("{userName}")
    public boolean CreatJournalEntry (@RequestBody JournalEntries newEntry, @PathVariable String userName){
        return journalEntryServices.createJournalEntry(newEntry, userName);
    }

    @GetMapping("/all")
    public ResponseEntity<Map<String, Object>> getAllJournals (){
        List<JournalEntries> entries = journalEntryServices.getAllJournalEntries();
        Map<String, Object> resBody = ResBuild.buildRes("success", "list of entries fetched!", entries);
       return ResponseEntity.status(HttpStatus.OK).body(resBody);
    }


}
