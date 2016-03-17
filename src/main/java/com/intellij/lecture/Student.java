package com.intellij.lecture;

/**
 * Created by mf57 on 13.03.2016.
 */
public class Student {
    private String name;
    private String surname;
    private String indexNumber;
    private String mail;

    public Student(String name, String surname, String indexNumber, String mail) {
        this.name = name;
        this.surname = surname;
        this.indexNumber = indexNumber;
        this.mail = mail;
    }


    public String getIndexNumber() {
        return indexNumber;
    }

    public String getMail() {
        return mail;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "{\n" +
                "  \"name\": \"Piotr\",\n" +
                "  \"surname\": \"Bochenek\",\n" +
                "  \"mail\": \"niePodamWamMaila\"\n" +
                "}";
    }
}
