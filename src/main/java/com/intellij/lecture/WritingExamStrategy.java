package com.intellij.lecture;

import com.intellij.lecture.Exam;
import com.intellij.lecture.Student;

/**
 * Created by mf57 on 13.03.2016.
 */
public interface WritingExamStrategy {
    double writeExam(Student student, Exam exam);
}
