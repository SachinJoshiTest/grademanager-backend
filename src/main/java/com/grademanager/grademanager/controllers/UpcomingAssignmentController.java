package com.grademanager.grademanager.controllers;

import com.grademanager.grademanager.models.UpcomingAssignment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UpcomingAssignmentController {
    @GetMapping("/upcomingassignment")
    public List<UpcomingAssignment> getUpcomingAssignment(){
        List<UpcomingAssignment> upcomingAssignmentList=new ArrayList<>();
        UpcomingAssignment upcomingAssignment1 = new UpcomingAssignment();
        upcomingAssignment1.setAssignmentnumber(1);
        upcomingAssignment1.setSubject("AP Macro Economics");
        upcomingAssignment1.setPortal("camvas");
        upcomingAssignment1.setPriority("high");
        upcomingAssignmentList.add(upcomingAssignment1);

        UpcomingAssignment upcomingAssignment2 = new UpcomingAssignment();
        upcomingAssignment2.setAssignmentnumber(2);
        upcomingAssignment2.setSubject("AP Physics 1");
        upcomingAssignment2.setPortal("camvas");
        upcomingAssignment2.setPriority("med");
        upcomingAssignmentList.add(upcomingAssignment2);


        UpcomingAssignment upcomingAssignment3 = new UpcomingAssignment();
        upcomingAssignment3.setAssignmentnumber(3);
        upcomingAssignment3.setSubject("Automotive 1 Eng and Maint");
        upcomingAssignment3.setPortal("camvas");
        upcomingAssignment3.setPriority("low");
        upcomingAssignmentList.add(upcomingAssignment3);


        return upcomingAssignmentList;
    }
}
