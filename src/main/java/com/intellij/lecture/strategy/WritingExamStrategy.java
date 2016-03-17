package com.intellij.lecture.strategy;

import com.intellij.lecture.exam.Exam;
import com.intellij.lecture.student.Student;

/**
 * Created by mf57 on 13.03.2016.
 */
public interface WritingExamStrategy {
    double writeExam(Student student, Exam exam);
}
