package com.grademanager.grademanager.models;

public class GoalRequest {

    private String subjectName;

    private int goalMarks;

    // getters and setters


    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getGoalMarks() {
        return goalMarks;
    }

    public void setGoalMarks(int goalMarks) {
        this.goalMarks = goalMarks;
    }
}
