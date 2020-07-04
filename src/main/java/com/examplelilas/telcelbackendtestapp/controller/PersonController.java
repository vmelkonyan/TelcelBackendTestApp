package com.examplelilas.telcelbackendtestapp.controller;

import com.examplelilas.telcelbackendtestapp.constants.AppConstants;
import com.examplelilas.telcelbackendtestapp.models.Person;
import com.examplelilas.telcelbackendtestapp.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }


    @GetMapping(AppConstants.GET_ALL_ACTION_KEY)
    private Iterable<Person> getAllUsers() {
        log.info("info_message {}", "getAllUsers action");
        return personService.findAllUsers();
    }
}
