package com.grademanager.grademanager.models;

public class UpcomingAssignment {
    private int assignmentnumber;
    private String subject;
    private String portal;
    private String priority;

    public int getAssignmentnumber() {
        return assignmentnumber;
    }

    public void setAssignmentnumber(int assignmentnumber) {
        this.assignmentnumber = assignmentnumber;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPortal() {
        return portal;
    }

    public void setPortal(String portal) {
        this.portal = portal;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
}
