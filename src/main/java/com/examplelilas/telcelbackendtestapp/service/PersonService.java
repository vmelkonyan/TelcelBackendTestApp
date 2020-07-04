package com.examplelilas.telcelbackendtestapp.service;

import com.examplelilas.telcelbackendtestapp.models.Person;
import com.examplelilas.telcelbackendtestapp.repo.PersonRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class PersonService {

    private final PersonRepo personRepo;

    public PersonService(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    public Iterable<Person> findAllUsers() {
        Iterable<Person> personList = personRepo.findAll();
        log.info("info_message {}", "personList -----> " + personList.toString());
        return personList;
    }
}
