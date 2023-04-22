package com.grademanager.grademanager.models;

import java.time.LocalDate;
import java.util.List;

public class Term {
    private int termID;
    private String termName;
    private int termScheduleID;
    private String termScheduleName;
    private int termSeq;
    private boolean isPrimary;
    private LocalDate startDate;
    private LocalDate endDate;
    private List<Course> courses;

    // Constructor, getters, and setters


    public int getTermID() {
        return termID;
    }

    public void setTermID(int termID) {
        this.termID = termID;
    }

    public String getTermName() {
        return termName;
    }

    public void setTermName(String termName) {
        this.termName = termName;
    }

    public int getTermScheduleID() {
        return termScheduleID;
    }

    public void setTermScheduleID(int termScheduleID) {
        this.termScheduleID = termScheduleID;
    }

    public String getTermScheduleName() {
        return termScheduleName;
    }

    public void setTermScheduleName(String termScheduleName) {
        this.termScheduleName = termScheduleName;
    }

    public int getTermSeq() {
        return termSeq;
    }

    public void setTermSeq(int termSeq) {
        this.termSeq = termSeq;
    }

    public boolean isPrimary() {
        return isPrimary;
    }

    public void setPrimary(boolean primary) {
        isPrimary = primary;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
