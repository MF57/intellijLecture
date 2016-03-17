package com.intellij.lecture.student;

public class StudentBuilder {
    private String name;
    private String surname;
    private String indexNumber;
    private String mail;
    private int iq;
    private int time;

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public StudentBuilder setIndexNumber(String indexNumber) {
        this.indexNumber = indexNumber;
        return this;
    }

    public StudentBuilder setMail(String mail) {
        this.mail = mail;
        return this;
    }

    public StudentBuilder setIq(int iq) {
        this.iq = iq;
        return this;
    }

    public StudentBuilder setTime(int time) {
        this.time = time;
        return this;
    }

    public Student createStudent() {
        return new Student(name, surname, indexNumber, mail, iq, time);
    }
}