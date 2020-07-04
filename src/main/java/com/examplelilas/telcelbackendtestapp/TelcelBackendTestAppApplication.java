package com.examplelilas.telcelbackendtestapp;

import com.examplelilas.telcelbackendtestapp.models.Person;
import com.examplelilas.telcelbackendtestapp.models.PersonInfo;
import com.examplelilas.telcelbackendtestapp.repo.PersonRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class TelcelBackendTestAppApplication implements CommandLineRunner {

    private final PersonRepo personRepo;

    public TelcelBackendTestAppApplication(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    public static void main(String[] args) {
        SpringApplication.run(TelcelBackendTestAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        insertDefaultValues();

    }

    private void insertDefaultValues() {
        List<Person> defUserList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            List<PersonInfo> defPersonInfoList = new ArrayList<>();
            if (i % 2 == 0) {
                defPersonInfoList.add(new PersonInfo("AMD", 8200.6));
                defPersonInfoList.add(new PersonInfo("EUR", 160.8));
                defPersonInfoList.add(new PersonInfo("RUR", 1200.65));
            } else if (i % 3 == 0) {
                defPersonInfoList.add(new PersonInfo("AMD", 10200.6));
                defPersonInfoList.add(new PersonInfo("GBP", 2660.8));
                defPersonInfoList.add(new PersonInfo("GEL", 15000));
                defPersonInfoList.add(new PersonInfo("AED", 2200));
            } else {
                defPersonInfoList.add(new PersonInfo("AMD", 3200.85));
                defPersonInfoList.add(new PersonInfo("USD", 200.5));
            }
            defUserList.add(new Person("Name" + i, "Last Name" + i, defPersonInfoList));
        }
        personRepo.saveAll(defUserList);
    }
}
