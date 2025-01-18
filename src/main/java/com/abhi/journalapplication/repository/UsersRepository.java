package com.abhi.journalapplication.repository;

import com.abhi.journalapplication.entity.Users;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsersRepository extends MongoRepository <Users, ObjectId>{
    Users findByUserName(String username);
}
