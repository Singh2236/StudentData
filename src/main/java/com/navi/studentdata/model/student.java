package com.navi.studentdata.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@Entity
//@Table(name="STUDENT", schema="SCHOOL") table name and schemas can also be defined here. Schema name helps to distinguish one set of tables from another.
//The entity name defaults to the name of the class.We can change its name using the name element @Entity(name= "value")
//entity classes must not be declared final.
public class student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //We can choose from four id generation strategies with the strategy element. The value can be AUTO, TABLE, SEQUENCE, or IDENTITY:
    private int  id;

    @Column(name = "Matri", nullable = false, unique = true)
    int matriculationNumber;

    @Column(length = 225, nullable = false, unique = false)
    String name;

    @Column(length = 225, nullable = false, unique = false)
    String course;





}


//helping notes from https://www.baeldung.com/jpa-entities#:~:text=2.-,Entity,a%20row%20in%20the%20table.
