package com.examplelilas.telcelbackendtestapp.repo;


import com.examplelilas.telcelbackendtestapp.models.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepo extends CrudRepository<Person,Long> {
}
