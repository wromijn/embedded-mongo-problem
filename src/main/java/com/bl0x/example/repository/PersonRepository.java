package com.bl0x.example.repository;

import com.bl0x.example.entities.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepository extends MongoRepository<Person, String> {
}
