package com.example.macbookair.basic_it;

/**
 * Created by macbookair on 1/13/18.
 */

public class Person {

    private String name;
    private String surname;
    private boolean sex;

    public Person(String name, String surname, boolean sex) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }


    public boolean getSex() {

        return sex;
    }


}
