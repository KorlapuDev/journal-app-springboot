package com.abhi.journalapplication.entity;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class Users {

    private ObjectId id;
    private String userName;
    private String fullName;
    private String email;
    private String password;
}
