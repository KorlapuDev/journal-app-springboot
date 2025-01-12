package com.abhi.journalapplication.repository;

import com.abhi.journalapplication.entity.JournalEntries;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalEntryRepository extends MongoRepository <JournalEntries, ObjectId> {
}
