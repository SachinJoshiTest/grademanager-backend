package com.grademanager.grademanager.models;

public class Course {
    private String courseName;
    private String courseNumber;
    private String sectionNumber;
    private int endYear;
    private String schoolName;
    private String roomName;
    private String teacherDisplay;
    private GradingTask gradingTasks;

    public Course(String courseName, String courseNumber, String sectionNumber, int endYear, String schoolName, String roomName, String teacherDisplay, GradingTask gradingTasks) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
        this.sectionNumber = sectionNumber;
        this.endYear = endYear;
        this.schoolName = schoolName;
        this.roomName = roomName;
        this.teacherDisplay = teacherDisplay;
        this.gradingTasks = gradingTasks;
    }

    // Constructor, getters, and setters


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getSectionNumber() {
        return sectionNumber;
    }

    public void setSectionNumber(String sectionNumber) {
        this.sectionNumber = sectionNumber;
    }

    public int getEndYear() {
        return endYear;
    }

    public void setEndYear(int endYear) {
        this.endYear = endYear;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getTeacherDisplay() {
        return teacherDisplay;
    }

    public void setTeacherDisplay(String teacherDisplay) {
        this.teacherDisplay = teacherDisplay;
    }

    public GradingTask getGradingTasks() {
        return gradingTasks;
    }

    public void setGradingTasks(GradingTask gradingTasks) {
        this.gradingTasks = gradingTasks;
    }
}
