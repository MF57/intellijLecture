package com.intellij.lecture;

import java.util.Random;

/**
 * Created by mf57 on 13.03.2016.
 */
public class CheatingBasedStrategy implements WritingExamStrategy {

    public double writeExam(Student student, Exam exam) {
        return cheatingSucceded() ? 100 : 0;
    }

    private boolean cheatingSucceded() {
        return new Random().nextBoolean();
    }
}
