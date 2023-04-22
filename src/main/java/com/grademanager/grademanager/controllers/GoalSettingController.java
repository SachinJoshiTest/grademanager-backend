package com.grademanager.grademanager.controllers;

import com.grademanager.grademanager.models.GoalRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoalSettingController {

    @PostMapping("/setGoal")
    public ResponseEntity setGoal(@RequestBody GoalRequest request) {
        // Logic to save goal settings here

        return ResponseEntity.ok().build();
    }
}
