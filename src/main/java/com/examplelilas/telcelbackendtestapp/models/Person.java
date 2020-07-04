package com.examplelilas.telcelbackendtestapp.models;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
@Entity
@Table(name = "t_person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NonNull
    private String firstName;
    @NonNull
    private String lastName;


    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="person_id")
    @NonNull
    private List<PersonInfo> personInfoList;
}
