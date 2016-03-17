package com.intellij.lecture;

import org.junit.Before;
import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by mf57 on 13.03.2016.
 */
public class LearningBasedStrategyTest {

    private LearningBasedStrategy strategy;
    private Student student = mock(Student.class);
    private Exam exam = mock(Exam.class);

    @Before
    public void setUp() throws Exception {
        strategy = new LearningBasedStrategy();
    }

    @Test
    public void testWriteExam() throws Exception {
        //given
        when(student.getIq()).thenReturn(100);
        when(student.getTime()).thenReturn(100);
        when(exam.getDifficulty()).thenReturn(200);
        when(exam.getTimeConsumption()).thenReturn(200);

        //when
        double result = strategy.writeExam(student, exam);

        //then
        assertThat(result).isEqualTo(50);

    }

    @Test
    public void testSuperStudentWritingExam() throws Exception {
        //given
        when(student.getIq()).thenReturn(200);
        when(student.getTime()).thenReturn(200);
        when(exam.getDifficulty()).thenReturn(100);
        when(exam.getTimeConsumption()).thenReturn(100);

        //when
        double result = strategy.writeExam(student, exam);

        //then
        assertThat(result).isEqualTo(100);
    }

    @Test
    public void testStupidStudentWritingExam() throws Exception {
        //given
        when(student.getIq()).thenReturn(100);
        when(student.getTime()).thenReturn(100);
        when(exam.getDifficulty()).thenReturn(0);
        when(exam.getTimeConsumption()).thenReturn(0);

        //when
        double result = strategy.writeExam(student, exam);

        //then
        assertThat(result).isEqualTo(100);

    }
}