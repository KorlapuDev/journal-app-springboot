package com.abhi.journalapplication.entity;

import lombok.Data;
import lombok.NonNull;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "journal_entries")
@Data
public class JournalEntries {

    @Id
    private ObjectId id;

    @NonNull
    private String title;
    private String content;
    private LocalDateTime date = LocalDateTime.now();

}
