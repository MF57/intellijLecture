package com.intellij.lecture;

/**
 * Created by mf57 on 13.03.2016.
 */
public class Exam {

    private String name;
    private int timeConsumption;
    private int difficulty;

    public Exam(String name, int timeConsumption, int difficulty) {
        this.name = name;
        this.timeConsumption = timeConsumption;
        this.difficulty = difficulty;
    }

    public String getName() {
        return name;
    }

    public int getTimeConsumption() {
        return timeConsumption;
    }

    public int getDifficulty() {
        return difficulty;
    }
}
