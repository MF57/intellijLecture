package com.intellij.lecture.strategy;

import com.intellij.lecture.exam.Exam;
import com.intellij.lecture.student.Student;

/**
 * Created by mf57 on 13.03.2016.
 */
public class LearningBasedStrategy implements WritingExamStrategy {
    public double writeExam(Student student, Exam exam) {

        int studentResources = student.getIq() + student.getTime();
        int examChallenge = exam.getDifficulty() + exam.getTimeConsumption();
        if(examChallenge == 0) {
            return 100;
        }
        int result = (studentResources * 100) / examChallenge;
        return result > 100 ? result : 100;
    }
}
