package com.grademanager.grademanager.controllers;

import com.grademanager.grademanager.models.Course;
import com.grademanager.grademanager.models.GradingTask;
import com.grademanager.grademanager.models.Term;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
public class GradeController {

    @GetMapping("/term")
    public Term getTerm() {
        Term term = new Term();
        term.setTermID(1260);
        term.setTermName("S2");
        term.setTermScheduleID(509);
        term.setTermScheduleName("Semesters");
        term.setTermSeq(2);
        term.setPrimary(true);
        term.setStartDate(LocalDate.parse("2023-01-09"));
        term.setEndDate(LocalDate.parse("2023-05-26"));

        List<Course> courses = new ArrayList<>();

        // Fill data for courses
        GradingTask task1 = new GradingTask("Coursework", "A-", 91.9, 151, 160, "S2");
        Course course1 =
                new Course(
                        "AP Macro Economics",
                        "T620A2",
                        "2",
                        2023,
                        "Naperville Central High School",
                        "224",
                        "Solberg, Janine S",
                        task1);
        courses.add(course1);

        GradingTask task2 = new GradingTask("Coursework", "A", 95.05, 30.2, 40, "S2");
        Course course2 =
                new Course(
                        "AP Physics 1",
                        "S600A2",
                        "1",
                        2023,
                        "Naperville Central High School",
                        "326",
                        "Dille, Nathanael James",
                        task2);
        courses.add(course2);

        GradingTask task3 = new GradingTask("Coursework", "F", 53.08, 19, 33, "S2");
        Course course3 =
                new Course(
                        "Automotive 1 Eng and Maint",
                        "S600A2",
                        "1",
                        2023,
                        "Naperville Central High School",
                        "326",
                        "Feid, Christopher T",
                        task3);
        courses.add(course3);

        GradingTask task4 = new GradingTask("Coursework", "A+", 100, 0, 0, "S2");
        Course course4 =
                new Course(
                        "Business INCubatoredu",
                        "B370W2",
                        "2",
                        2023,
                        "Naperville Central High School",
                        "245",
                        "Neubauer, Bradley",
                        task4);
        courses.add(course4);

        GradingTask task5 = new GradingTask("Coursework", "A+", 97.77, 44, 45, "S2");
        Course course5 =
                new Course(
                        "Honors English 3",
                        "C250H2",
                        "4",
                        2023,
                        "Naperville Central High School",
                        "200",
                        "Albiniak, Sarah",
                        task5);
        courses.add(course5);

        GradingTask task6 = new GradingTask("Coursework", "B", 86.54, 33.5, 39, "S2");
        Course course6 =
                new Course(
                        "Honors Precalculus",
                        "M530H2",
                        "3",
                        2023,
                        "Naperville Central High School",
                        "341",
                        "Rakes, Marissa A",
                        task6);
        courses.add(course6);

        GradingTask task7 = new GradingTask("Coursework", "A+", 100, 40, 40, "S2");
        Course course7 =
                new Course(
                        "PE Leader",
                        "P62012",
                        "38",
                        2023,
                        "Naperville Central High School",
                        null,
                        "Cauley, Sarah E",
                        task7);

        courses.add(course7);
        term.setCourses(courses);
        return term;
    }
}
