package com.abhi.journalapplication.entity;

import lombok.Data;
import lombok.NonNull;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "users")
@Data
public class Users {

    @Id
    private ObjectId id;
    @NonNull
    private String userName;
    @NonNull
    private String fullName;
    private String email;
    @NonNull
    private String password;
    @DBRef
    private List<JournalEntries> journalEntries = new ArrayList<>();
}
