package com.intellij.lecture;

/**
 * Created by mf57 on 13.03.2016.
 */
public class LearningBasedStrategy implements WritingExamStrategy {
    public double writeExam(Student student, Exam exam) {
        return (student.getIq()+student.getTime())*100/(exam.getDifficulty() + exam.getTimeConsumption());
    }
}
