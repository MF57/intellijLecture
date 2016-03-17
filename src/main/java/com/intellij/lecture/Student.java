package com.intellij.lecture;

/**
 * Created by mf57 on 13.03.2016.
 */
public class Student {
    private String name;
    private String surname;
    private String indexNumber;
    private String mail;
    private int iq;
    private int time;

    public Student(String name, String surname, String indexNumber, String mail) {
        this.name = name;
        this.surname = surname;
        this.indexNumber = indexNumber;
        this.mail = mail;
        this.iq = 100;
        this.time = 100;
    }


    public double writeExam(Exam exam) {
        WritingExamStrategy cheatingBasedStrategy = new CheatingBasedStrategy();
        return cheatingBasedStrategy.writeExam(this, exam);
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

    public int getIq() {
        return iq;
    }

    public int getTime() {
        return time;
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
