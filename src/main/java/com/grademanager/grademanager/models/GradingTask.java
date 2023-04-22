package com.grademanager.grademanager.models;

public class GradingTask {
    private String taskName;
    private String progressScore;
    private double progressPercent;
    private double progressPointsEarned;
    private double progressTotalPoints;
    private String termName;

    public GradingTask(String coursework, String s, double v, double i, double i1, String s2) {
        taskName=coursework;
        progressScore=s;
        progressPercent=v;
        progressPointsEarned=i;
        progressTotalPoints=i1;
        termName=s2;
    }

    // Constructor, getters, and setters


    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getProgressScore() {
        return progressScore;
    }

    public void setProgressScore(String progressScore) {
        this.progressScore = progressScore;
    }

    public double getProgressPercent() {
        return progressPercent;
    }

    public void setProgressPercent(double progressPercent) {
        this.progressPercent = progressPercent;
    }

    public double getProgressPointsEarned() {
        return progressPointsEarned;
    }

    public void setProgressPointsEarned(double progressPointsEarned) {
        this.progressPointsEarned = progressPointsEarned;
    }

    public double getProgressTotalPoints() {
        return progressTotalPoints;
    }

    public void setProgressTotalPoints(double progressTotalPoints) {
        this.progressTotalPoints = progressTotalPoints;
    }

    public String getTermName() {
        return termName;
    }

    public void setTermName(String termName) {
        this.termName = termName;
    }
}
