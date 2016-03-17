package com.intellij.lecture.strategy;

import com.intellij.lecture.student.Student;

/**
 * Created by mf57 on 15.03.2016.
 */
public class WritingExamStrategyFactory {

    public static WritingExamStrategy getExamStrategyForStudent(Student student) {
        return student.getIq() > 90 ? new LearningBasedStrategy() : new CheatingBasedStrategy();
    }
}
