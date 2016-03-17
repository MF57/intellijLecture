package com.intellij.lecture.student;

import com.intellij.lecture.exam.Exam;
import com.intellij.lecture.strategy.WritingExamStrategy;
import com.intellij.lecture.strategy.WritingExamStrategyFactory;

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

    public Student(String name, String surname, String indexNumber, String mail, int iq, int time) {
        this.name = name;
        this.surname = surname;
        this.indexNumber = indexNumber;
        this.mail = mail;
        this.iq = iq;
        this.time = time;
    }


    public double writeExam(Exam exam) {
        WritingExamStrategy cheatingBasedStrategy = WritingExamStrategyFactory.getExamStrategyForStudent(this);
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
